package com.company.controller;

import com.company.exception.HistoryNotFoundException;
import com.company.model.History;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Controller {
    private static Controller instance;
    private final Map<Integer, History> histories;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Controller() {
        this.histories = new HashMap<>();
    }

    public void create(History history) {
        histories.put(history.getId(), history);
    }

    public void remove(int id) throws HistoryNotFoundException {
        if (histories.containsKey(id)) {
            histories.remove(id);
        } else {
            throw new HistoryNotFoundException("History was not found by id " + id);
        }
    }

    public History get(int id) {
        return histories.get(id);
    }

    public List<History> getAll() {
        return new ArrayList<>(histories.values());
    }

    public void update(History history) throws HistoryNotFoundException {
        if (histories.containsKey(history.getId())) {
            histories.put(history.getId(), history);
        } else {
            throw new HistoryNotFoundException("History was not found by id " + history.getId());
        }
    }
}