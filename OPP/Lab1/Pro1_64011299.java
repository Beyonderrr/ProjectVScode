import java.util.Scanner;

public class Pro1_64011299 {
    public static void main(String[] args){
        int birth,death,immigrant;
        int sec1year = 31556926;
        int population = 312032486;
        birth = sec1year/7;
        death = sec1year/13;
        immigrant = sec1year/45;
        System.out.println("population 0 years : "+ population);
        population += birth-death+immigrant;
        System.out.println("population 1 years : "+ population);
        population += birth-death+immigrant;
        System.out.println("population 2 years : "+ population);
        population += birth-death+immigrant;
        System.out.println("population 3 years : "+ population);
        population += birth-death+immigrant;
        System.out.println("population 4 years : "+ population);
        population += birth-death+immigrant;
        System.out.println("population 5 years : "+ population);


    }
}
