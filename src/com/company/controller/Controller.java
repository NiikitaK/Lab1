package com.company.controller;

import java.awt.*;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.graalvm.compiler.nodeinfo.Verbosity.Id;

class Controller {

    private Map map;

    public static History create(int id,
                                 Date date,
                                 String user,
                                 String result) {
        History newbie = ClassSpecializer.factory.create( int id,
        Date date,
        String user,
        String result);
        map.put(newbie.getId, newbie);
    }

    public void remove(id) {
        map.remove(id);
    }

    public int get(id) {
        return map.get(id);
    }

    public History getAll() {
        return map.values();
    }

    public History update(int id,
                          Date date,
                          String user,
                          String result) {
//like for create at this moment
    }
}