package com.company;

public class History {
    int id;
    String date;
    String act;
    public void displayInfo() {
        System.out.printf("id: %d \tdate: %s \t act: %s\n", id, date, act);
    }

    public void setInfoHistory(int id, String date, String act) {
        this.id =   id;
        this.date = date;
        this.act = act;
    }
}
//wow
