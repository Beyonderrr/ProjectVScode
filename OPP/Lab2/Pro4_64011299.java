import java.util.Scanner;

public class Pro4_64011299 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city : ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city : ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city : ");
        String city3 = input.nextLine();

        String wait;
        if((city1.compareTo(city2)<0)&&(city1.compareTo(city3)<0))
        {
            wait = city3;
            city3 = city1;
            city1 = wait;
        }
        else if((city2.compareTo(city1)<0)&&(city2.compareTo(city3)<0))
        {
            wait = city3;
            city3 = city2;
            city2 = wait;
        }
        if(city1.compareTo(city2)<0)
        {
            wait = city2;
            city2 = city1;
            city1 = wait;
        }

        System.out.println("The three cities in alpahbetical order are "+
            city3 + " " + city2 + " " + city1);

    }   
}
