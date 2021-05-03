package com.company;

import com.company.controller.Controller;
import com.company.exception.HistoryNotFoundException;
import com.company.factory.BuildHistoryFactory;
import com.company.factory.DeployHistoryFactory;
import com.company.model.BuildHistory;
import com.company.model.DeployHistory;
import com.company.model.History;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BuildHistory buildHistory = new BuildHistory();
        buildHistory.setId(0);
        buildHistory.setBuildName("TestName");
        buildHistory.setArtifactType("Maven");
        buildHistory.setResult("Success");
        buildHistory.setUser("User");
        buildHistory.setDate(new Date(System.currentTimeMillis()));
        System.out.println(buildHistory);

        DeployHistory deployHistory = new DeployHistory();
        deployHistory.setDeployName("TestDeploy");
        deployHistory.setPlatformType("Kubernetes");
        deployHistory.setId(1);
        deployHistory.setResult("Success");
        deployHistory.setUser("Horse");
        deployHistory.setDate(new Date(System.currentTimeMillis()));
        deployHistory.setPlatformVersion("T-1000");
        System.out.println(deployHistory);

        List<History> histories = new ArrayList<>();
        histories.add(buildHistory);
        histories.add(deployHistory);
        System.out.println(histories);

        BuildHistory buildHistory1 = BuildHistoryFactory.create(
                2,
                new Date(System.currentTimeMillis()),
                "Konkov",
                "Failory",
                "TestB",
                "Docker"
        );
        DeployHistory deployHistory1 = DeployHistoryFactory.create(
                3,
                new Date(System.currentTimeMillis()),
                "Konkov111",
                "Success",
                "NameDep",
                "TypeTest",
                "TestVersion"
        );
        histories.add(buildHistory1);
        histories.add(deployHistory1);
        System.out.println(histories);
        System.out.println(histories.size());

        Controller.getInstance().create(buildHistory);
        Controller.getInstance().create(deployHistory);

        System.out.println(Controller.getInstance().getAll());
        try {
            Controller.getInstance().remove(10);
        } catch (HistoryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
