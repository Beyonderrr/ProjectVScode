import java.util.Scanner;

public class Pro3_64011299 {
    public static void main(String[] args){
      int num1=0,sum=0,digit1=0,digit2=0,digit3=0;
      System.out.print("Enter a number between 0 and 1000 : ");
      Scanner input = new Scanner(System.in);
      num1 = input.nextInt();
      if(num1 >= 100){
          digit3 = num1%10;
          num1 -= digit3;
          num1/=10;
          digit2 = num1%10;
          num1 -= digit2;
          num1/=10;
          digit1 = num1;
          sum = digit1+digit2+digit3;
      }
      else if(num1 >= 10){
          digit2 = num1%10;
          num1 -= digit2;
          num1/=10;
          digit1 = num1;
          sum = digit1+digit2;
      }
      else if(num1 <= 10){
          sum = num1;
      }
      System.out.println("The sum of the digits is "+sum);
    }
}
