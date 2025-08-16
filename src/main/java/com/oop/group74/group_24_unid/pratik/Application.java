package com.oop.group74.group_24_unid.pratik;


public class Application {
    private String applicantName;
    private String dob;
    private String address;
    private String photoPath;
    private boolean approved;

    public Application(String applicantName, String dob, String address, String photoPath) {
        this.applicantName = applicantName;
        this.dob = dob;
        this.address = address;
        this.photoPath = photoPath;
        this.approved = false;
    }

    public String getApplicantName() { return applicantName; }
    public String getDob() { return dob; }
    public String getAddress() { return address; }
    public String getPhotoPath() { return photoPath; }
    public boolean isApproved() { return approved; }
    public void setApproved(boolean approved) { this.approved = approved; }
}
