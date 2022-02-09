import java.util.Scanner;

public class Pro4_64011299 {
    public static void main(String[] args){
        float weight,height,BMI;
        System.out.print("Enter weight in pounds : ");
        Scanner input1 = new Scanner(System.in);
        weight = input1.nextFloat();
        System.out.print("Enter height in inches : ");
        Scanner input2 = new Scanner(System.in);
        height = input2.nextFloat();
        BMI = 703*weight/(height*height);
        System.out.println("BMI is "+BMI);
    }
}
