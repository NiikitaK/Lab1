package com.company.model;

import java.util.Objects;

public class DeployHistory extends History{
    private String deployName;
    private String platformType;
    private String platformVersion;

    public String getDeployName() {
        return deployName;
    }

    public void setDeployName(String deployName) {
        deployName = deployName;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeployHistory that = (DeployHistory) o;
        return Objects.equals(deployName, that.deployName) && Objects.equals(platformType, that.platformType) && Objects.equals(platformVersion, that.platformVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployName, platformType, platformVersion);
    }

    @Override
    public String toString() {
        return "DeployHistory{" +
                "id" + super.getId() +
                "date" + super.getDate() +
                "user" + super.getUser() +
                "result" + super.getResult() +
                "deployName='" + deployName + '\'' +
                ", platformType='" + platformType + '\'' +
                ", platformVersion='" + platformVersion + '\'' +
                '}';
    }
}
