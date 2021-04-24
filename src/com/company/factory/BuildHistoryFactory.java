package com.company.factory;

import com.company.model.BuildHistory;

import java.util.Date;

public class BuildHistoryFactory {
    public static BuildHistory create(int id,
                                      Date date,
                                      String user,
                                      String result,
                                      String buildName,
                                      String artifactType) {
        BuildHistory buildHistory = new BuildHistory();
        buildHistory.setId(id);
        buildHistory.setDate(date);
        buildHistory.setUser(user);
        buildHistory.setResult(result);
        buildHistory.setBuildName(buildName);
        buildHistory.setArtifactType(artifactType);
        return buildHistory;
    }
}
