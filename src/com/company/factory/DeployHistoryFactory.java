package com.company.factory;

import com.company.model.BuildHistory;
import com.company.model.DeployHistory;

import java.util.Date;

public class DeployHistoryFactory {
    public static DeployHistory create(int id,
                                       Date date,
                                       String user,
                                       String result,
                                       String deployName,
                                       String platformType,
                                       String platformVersion) {
        DeployHistory deployHistory = new DeployHistory();
        deployHistory.setId(id);
        deployHistory.setDate(date);
        deployHistory.setUser(user);
        deployHistory.setResult(result);
        deployHistory.setDeployName(deployName);
        deployHistory.setPlatformType(platformType);
        deployHistory.setPlatformVersion(platformVersion);
        return deployHistory;
    }
}
