package io.diaz.covidtracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int totalReportedCases;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalReportedCases() {
        return totalReportedCases;
    }

    public void setTotalReportedCases(int totalReportedCases) {
        this.totalReportedCases = totalReportedCases;
    }
}
