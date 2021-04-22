package com.company;

public class main{
    int id = 1;
    String date = "20.05";
    String act = "interview";
    public void Testing(String[] args) {
        History his = new History();
        his.setInfoHistory(id, date, act);
        his.displayInfo();
        }
}
