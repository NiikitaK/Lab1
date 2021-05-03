package com.company.model;

import java.util.Objects;

public class BuildHistory extends History {
    private String buildName;
    private String artifactType;

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildHistory that = (BuildHistory) o;
        return buildName == that.buildName && Objects.equals(artifactType, that.artifactType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildName, artifactType);
    }

    @Override
    public String toString() {
        return "BuildHistory{" +
                "id='" + super.getId() + '\'' +
                ", date='" + super.getDate() + '\'' +
                ", user='" + super.getUser() + '\'' +
                ", result='" + super.getResult() + '\'' +
                ", buildName=" + buildName +
                ", artifactType='" + artifactType + '\'' +
                '}';
    }
}
