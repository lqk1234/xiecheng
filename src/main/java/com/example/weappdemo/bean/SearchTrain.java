package com.example.weappdemo.bean;

/**
 * @author lqk
 */
public class SearchTrain {
    private String fromStation;
    private String toStation;
    private String date;

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SearchTrain{" +
                "fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
