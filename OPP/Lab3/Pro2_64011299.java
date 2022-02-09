import java.util.Scanner;
import java.util.Arrays;

public class Pro2_64011299 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Input List1
        System.out.print("Enter List1 : ");
        int[] list1 = new int[input.nextInt()];
        for (int i =0;i<list1.length;i++){
            list1[i] = input.nextInt();
        }

        //Input List2
        System.out.print("Enter List2 : ");
        int[] list2 = new int[input.nextInt()];
        for (int i=0;i<list2.length;i++){
            list2[i] = input.nextInt();
        }

        

        int[] mergered = new int[list1.length+list2.length];
        System.arraycopy(list1,0,mergered,0,list1.length);
        System.arraycopy(list2,0,mergered,list1.length,list2.length);
        Arrays.sort(mergered);
        System.out.println(Arrays.toString(mergered));
    }    
        //Check palindrom
        //Check prime
        //if(checkprime && palindromic) print
}
