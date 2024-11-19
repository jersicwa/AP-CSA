import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public class InputPrac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Addition program, ask num1 and num2
        System.out.println("What's the first number?");
        int num1=input.nextInt();
        System.out.println("What's the second number");
        int num2=input.nextInt();
        System.out.println("The total is "+(num1+num2));

    }
}
