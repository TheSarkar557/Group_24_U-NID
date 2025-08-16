package com.oop.group74.group_24_unid.Tirtho;

public class BiometricData {
    private String id;
    private String type;
    private int qualityScore;

    public BiometricData(String id, String type, int qualityScore) {
        this.id = id;
        this.type = type;
        this.qualityScore = qualityScore;
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public int getQualityScore() { return qualityScore; }
    public void setQualityScore(int qualityScore) { this.qualityScore = qualityScore; }
}
