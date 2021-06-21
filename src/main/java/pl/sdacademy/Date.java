package pl.sdacademy;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return day + "." + month + "." + year;
    }

    public boolean isLeapYear(){
        return year % 4 == 0;
    }
}
