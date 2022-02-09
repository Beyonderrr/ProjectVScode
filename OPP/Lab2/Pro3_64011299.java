import java.util.Scanner;

public class Pro3_64011299 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int h,q,m,k,j;
        System.out.print("Enter day of the month : ");
        q = input.nextInt();
        System.out.print("Enter the month : ");
        m = input.nextInt();
        System.out.print("Enter the year : ");
        j = input.nextInt();

        if(m==1)
        {
            m=13;
            j--;
        }
        else if(m==2)
        {
            m=14;
            j--;
        }

        h = (q+((26*(m+1))/10)+((j%100)/4)+((j/100)/4)+(5*(j/100)))%7;
        switch(h){
            case 0 : System.out.print("Saturday");break;
            case 1 : System.out.print("Sunday");break;
            case 2 : System.out.print("Monday");break;
            case 3 : System.out.print("Tuesday");break;
            case 4 : System.out.print("Wednesday");break;
            case 5 : System.out.print("Thursday");break;
            case 6 : System.out.print("Friday");break;
        }
    }
    
}
