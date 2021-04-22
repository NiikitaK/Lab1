package com.company;

import java.util.Objects;

public class History {
    int id;
    String date;
    String act;

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getAct() {
        return act;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public void displayInfo() {
        System.out.printf("id: %d \tdate: %s \t act: %s\n", id, date, act);
    }

    public void setInfoHistory(int id, String date, String act) {
        this.id = id;
        this.date = date;
        this.act = act;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return id == history.id && Objects.equals(date, history.date) && Objects.equals(act, history.act);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, act);
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", act='" + act + '\'' +
                '}';
    }
}
//wow
