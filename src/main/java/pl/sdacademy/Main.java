package pl.sdacademy;

public class Main {
    public static void main(String[] args) {
        Date data1 = new Date(7,4, 2021);
        Date data2 = new Date(7,2, 2020);
        Date data3 = new Date(29,2, 2021);
        System.out.println(data1);
        System.out.println(data1.isLeapYear());
        System.out.println(data2.isLeapYear());
        System.out.println(data2.getCurrentMonthDaysCount());
        System.out.println(data3.getCurrentMonthDaysCount());
        System.out.println(data3.isValid());
        Date data4 = new Date(17,12, 2020);
        System.out.println(data4);
        System.out.println("----------------");
        Date data5 = new Date(21,06, 2021);
        System.out.println(data5);
        data5.addDays(-730);
        System.out.println(data5);

    }
}
