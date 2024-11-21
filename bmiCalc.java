import java.util.Scanner;

public class bmiCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //define all the variables
        System.out.println("Please enter height (inch)");
        double height=input.nextDouble();
        System.out.println("Please enter weight (lbs)");
        double weight=input.nextDouble();

        double calc=weight*703/(height*height);
        if (calc<18.5 && calc>0)
            System.out.println("Your are underweight");
        else if (calc>=18.5 && calc<=25)
            System.out.println("You are at an optimal weight");
        else if (calc>25)
            System.out.println("You are overweight");
        else
            System.out.println("Please enter a correct weight or height value");


    }
}