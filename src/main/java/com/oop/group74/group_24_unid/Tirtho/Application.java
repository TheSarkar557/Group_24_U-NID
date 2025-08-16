package com.oop.group74.group_24_unid.Tirtho;

public class Application {
    private String id;
    private String applicantName;
    private String status;

    public Application(String id, String applicantName, String status) {
        this.id = id;
        this.applicantName = applicantName;
        this.status = status;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getApplicantName() { return applicantName; }
    public void setApplicantName(String applicantName) { this.applicantName = applicantName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Application{" +
                "id='" + id + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}