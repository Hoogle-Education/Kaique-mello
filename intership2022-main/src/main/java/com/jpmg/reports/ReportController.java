package com.jpmg.reports;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

    @Autowired
    private ReportServices reportServices;

    @RequestMapping(value = "/financialByTrader", method = RequestMethod.GET, produces = "application/json")
    public String getString() {
        Gson json=new Gson();
        List<FinancialbyTrader> financialbyTraders = reportServices.getFinancialbyTraders();

        return json.toJson(financialbyTraders);
    }

    @RequestMapping(value = "/CreateNewFile", method = RequestMethod.GET)
    public String getCSV() {
        return reportServices.toCSV();
    }
}
