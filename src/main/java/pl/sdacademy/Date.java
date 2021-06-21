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

    public int getCurrentMonthDaysCount(){
        if(month == 1 || month == 3|| month == 5|| month == 7|| month == 8 || month == 10|| month == 12){
            return 31;
        }else if(month == 2){
            if(isLeapYear()){
                return 29;
            }else {
                return 28;
            }
        }else {
            return 30;
        }
    }

    public boolean isValid(){
        return day <= getCurrentMonthDaysCount();
    }

}
