import java.util.GregorianCalendar;

public class Pro2_64011299 {
    public static void main(String[] args){
    GregorianCalendar calender = new GregorianCalendar();
    System.out.println("Current year, month, date, and day of week");
    System.out.println("Year is "+calender.get(GregorianCalendar.YEAR));
    System.out.println("Month is "+calender.get(GregorianCalendar.MONTH));
    System.out.println("Date is "+calender.get(GregorianCalendar.DATE));
    System.out.println("Day of week is "+calender.get(GregorianCalendar.DAY_OF_WEEK));
    System.out.println("-------------");
    
    calender.add(GregorianCalendar.DATE,1);
    System.out.println("After specified the elapsed time of one day after current day");
    System.out.println("Year is "+calender.get(GregorianCalendar.YEAR));
    System.out.println("Month is "+calender.get(GregorianCalendar.MONTH));
    System.out.println("Date is "+calender.get(GregorianCalendar.DATE));
    System.out.println("Day of week is "+calender.get(GregorianCalendar.DAY_OF_WEEK));
    System.out.println(calender.getTime());
    }
}
