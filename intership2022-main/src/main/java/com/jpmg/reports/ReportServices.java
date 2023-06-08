package com.jpmg.reports;

import com.opencsv.CSVWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServices   {

    private static final String CSV_PATH = "tmp/report.csv";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<FinancialbyTrader> getFinancialbyTraders() {
        String sql4 = "select t.Code as traderCode, SUM(tr.Quantity * tr.Price) as total\n" +
                "from trader t inner join orders o on (t.Code=o.Trader)\n" +
                "inner join trade tr on (o.Id=tr.orderid)\n" +
                "group by t.code";

        List<FinancialbyTrader> financialbyTraders = jdbcTemplate.query(sql4, BeanPropertyRowMapper.newInstance(FinancialbyTrader.class));

        return financialbyTraders;
    }

    public List<DailyReport> getDailyReport() {
        String sql4 = "select t.code, t.name, o.id, o.ticker, tr.quantity, tr.price\n" +
                "from trader t inner join orders o on (t.Code=o.Trader)\n" +
                "inner join trade tr on (o.Id=tr.orderid)";

        List<DailyReport> dailyReports = jdbcTemplate.query(sql4, BeanPropertyRowMapper.newInstance(DailyReport.class));

        return dailyReports;
    }

    public String toCSV(){
        try {
            FileWriter fw = new FileWriter(new File(CSV_PATH));
            CSVWriter cw = new CSVWriter(fw);

            String[] headers = {"TraderCode", "TraderName", "OrderID", "Ticker", "Qty", "AVGPrice"};
            List<String[]> data = new ArrayList<String[]>();

            data.add(headers);

            List<DailyReport> dailyReports = getDailyReport();

            for(DailyReport item : dailyReports){
                String[] tmp = {item.getCode(), item.getName(), String.valueOf(item.getId()), item.getTicker(), String.valueOf(item.getQuantity()), String.valueOf(item.getPrice())};
                data.add(tmp);
            }

            cw.writeAll(data);

            cw.close();
            fw.close();

            System.out.println("Escrita de Arquivo pronta");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return CSV_PATH;
    }
}
