package com.jpmg.reports;

public class Trader {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "Code='" + code + '\'' +
                ", Name='" + name + '\'' +
                '}';
    }
}
