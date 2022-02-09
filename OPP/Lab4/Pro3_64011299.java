import java.util.Random;
import java.util.Arrays;

public class Pro3_64011299 {
    public static void main(String[] args){
        StopWatch time = new StopWatch();
        time.start();
        int[] palindrome;
        java.util.Random R = new java.util.Random();
        double[] numbers = new double[1000];

        System.out.println("Creating a list containing 1000 elements,");
        for(int i =0;i < numbers.length;i++){
            numbers[i] = R.nextDouble(500);
            if(i%5==0){
                System.out.println();
            }
            System.out.print(String.format("%.2f",numbers[i])+"\t");
        }
        System.out.println();
        System.out.println("List created.");
        System.out.print("Sorting stopwatch starts...");

        Arrays.sort(numbers);
        for(int i =0;i< numbers.length;i++){
            if(i%5==0){
                System.out.println();
            }
            System.out.print(String.format("%.2f",numbers[i])+"\t");
        }
        System.out.println();
        time.stop();

        System.out.println("Sorting 1,000 numbers took "+time.getElapsedTime()+" milliseconds");
        System.out.println("---------------------");
        time.start();
        time.stop();
        System.out.println("The palindromPrime stopwatch starts...\nCreating 1000 PalindromPrime...");

        for(int n=2,count =0;count < 100;n++){
            if(isPalindrome(n) && isPrime(n)){
                System.out.print(n + " ");
                   count++;
                if(count % 10 == 0)
                  System.out.println();
            }
        }
       
    
       time.stop();
       System.out.println("PalindromePrime created\nThe palindromPrime stopwwatch stoped.");
       System.out.println("The palindromPrime time is "+time.getElapsedTime()+" milliseconds");
    }

    public static boolean isPalindrome(int x){
        int temp =x;
        int r,sum=0;
        while(x >0){
            r = x%10;
            sum = (sum*10) + r; 
            x = x/10;
        }

        if(temp ==sum)
            return true;
        else
            return false;

    }

    public static boolean isPrime(int x){
        if(x <=1){
            return false;
        }
        for(int i=2;i<= x/2;i++){
            if(x%i ==0){
                return false;
            }
        }
        return true;
    }
}
