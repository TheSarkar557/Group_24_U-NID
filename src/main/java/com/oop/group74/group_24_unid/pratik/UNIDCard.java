package com.oop.group74.group_24_unid.pratik;



public class UNIDCard {
    private Application application;
    private String unidNumber;

    public UNIDCard(Application application, String unidNumber) {
        this.application = application;
        this.unidNumber = unidNumber;
    }

    public Application getApplication() { return application; }
    public String getUnidNumber() { return unidNumber; }
}
