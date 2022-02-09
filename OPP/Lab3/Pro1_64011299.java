import java.util.Scanner;
import java.util.Arrays;

public class Pro1_64011299 {
    
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);

    //check prime
    int number = input.nextInt(); 
    int divide=2;
    int check=0;
    while(divide <number)
    {
        if(number%divide==0)
        {
            check++;
        }
        divide++;
    }
    if(check>0)
        {
            System.out.print("No");
        }
    else
        {
            System.out.print("Yes");
        }
    }
    
    
}
