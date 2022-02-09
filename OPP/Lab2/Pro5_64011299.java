import java.util.Scanner;

public class Pro5_64011299 {
    public static void main(String[] args){
        int Input,AtFloor=1,LastFloor,NumberAtFloor=1,CountofSpace;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        Input = input.nextInt();
        Input++;
        
        while(AtFloor<Input)
        {
            //Front
            CountofSpace=Input*2-2-(NumberAtFloor-1);
            for(int i=(Input-AtFloor-1)*2;i>0;i--)
            {
                System.out.print(" ");
            }
            while(NumberAtFloor>0)
            {
                if(NumberAtFloor>0)
                {
                    System.out.print(NumberAtFloor);
                    NumberAtFloor--;
                }
                if(CountofSpace>0)
                {
                    System.out.print(" ");
                    CountofSpace--;
                }
                
            }
            //Back
            NumberAtFloor = 2;
            CountofSpace=Input*2-2-(NumberAtFloor-1);
            while(NumberAtFloor<=AtFloor)
            {
                if(NumberAtFloor<=AtFloor)
                {
                    System.out.print(NumberAtFloor);
                    NumberAtFloor++;
                }
                if(CountofSpace>0)
                {
                    System.out.print(" ");
                    CountofSpace--;
                }
                
               
            }

            AtFloor++;
            NumberAtFloor=AtFloor;
            System.out.println();
        }

    }    
}
