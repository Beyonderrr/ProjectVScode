import java.util.Scanner;

public class Pro2_64011299 {
    public static void main(String[] args){
        
        //random
        int me,computer;
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        me = input.nextInt();
        computer = (int)(Math.random()*10)%3;
        if(me == 0 && computer == 0)
        {
            System.out.print("The computer is scissor. You are scissor. It is a draw");

        }
        else if(me == 0 && computer ==1)
        {
            System.out.print("The computer is rock. You are scissor.You lose");
        }
        else if(me == 0 && computer ==2)
        {
            System.out.print("The computer is paper.You are scissor.You won");
        }
        else if(me==1&& computer==0)
        {
            System.out.print("The computer is scissor.You are rock.You won");
        }
        else if(me==1&& computer==1)
        {
            System.out.print("The computer is rock.You are rock.It is a draw");
        }
        else if(me==1&& computer==2)
        {
            System.out.print("The computer is paper.You are rock.You lose");
        }
        else if(me==2&&computer==0)
        {
            System.out.print("The computer is scissor.You are paper.You lose");
        }
        else if(me==2&&computer==1)
        {
            System.out.print("The computer is rock.You are paper.You won");
        }
        else if(me==2&&computer==2)
        {
            System.out.print("The computer is paper.You are paper.It is a draw");
        }

    }
}
