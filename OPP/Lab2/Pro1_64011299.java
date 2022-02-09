import java.util.Scanner;

public class Pro1_64011299 {
    public static void main(String[] args){
        //Input Today
        int today,future;
        
        System.out.print("Enter today's day : ");
        Scanner input1 = new Scanner(System.in);
        today = input1.nextInt();
        
        //Input Future
        System.out.print("Enter the number of days elapsed since today : ");
        Scanner input2 = new Scanner(System.in);
        future = input2.nextInt();

        future = (future%7)+today;
        switch(today){
            case 0 : System.out.print("Today is Sunday ");break;
            case 1 : System.out.print("Today is Monday ");break;
            case 2 : System.out.print("Today is Tuesday ");break;
            case 3 : System.out.print("Today is Wednesday ");break;
            case 4 : System.out.print("Today is Thursday ");break;
            case 5 : System.out.print("Today is Friday ");break;
            case 6 : System.out.print("Today is Saturday ");break;
        }
        switch(future){
            case 0 : System.out.print("and the future day is Sunday");break;
            case 1 : System.out.print("and the future day is Monday");break;
            case 2 : System.out.print("and the future day is Tuesday");break;
            case 3 : System.out.print("and the future day is Wednesday");break;
            case 4 : System.out.print("and the future day is Thursday");break;
            case 5 : System.out.print("and the future day is Friday");break;
            case 6 : System.out.print("and the future day is Saturday");break;
        }
        

        
    }
}