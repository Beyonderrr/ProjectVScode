import java.util.Scanner;

public class Pro3_64011299 {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size matrix : ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        //Random
        for(int i=0;i<size;i++)
        {
            for(int j =0;j<size;j++)
            {
                matrix[i][j] = (int)(Math.random()*10)%2;
            }
        }

        //Display
        for(int i=0;i<size;i++)
        {
            for(int j =0;j<size;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //Check row
        for(int i=0;i<size;i++)
        {
            int checknumber = matrix[i][0];
            int many =0;
            for(int j=1;j<size;j++)
            {
                if(matrix[i][j]==checknumber)
                {
                    many++;
                }
                if(many == 3)
                {
                    System.out.println("All "+checknumber+"s on row "+i);
                }
            }
        }
        //Check column
        for(int j=0;j<size;j++)
        {
            int checknumber = matrix[0][j];
            int many =0;
            for(int i=1;i<size;i++)
            {
                if(matrix[i][j]==checknumber)
                {
                    many++;
                }
                if(many == 3)
                {
                    System.out.println("All "+checknumber+"s on column "+j);
                }
            }
        }
        
    }
}
