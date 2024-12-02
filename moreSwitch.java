import java.util.Scanner;

public class moreSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How much does your package weigh?");
        double weight = input.nextDouble();
        System.out.println("Would you like express or regular shipping?");
        String type = input.nextLine();
        double costReg = 0;

        if (type.equals("regular") || type.equals("Regular"))
            if (weight<=2)
                costReg=1.1;
            else if (weight >2 && weight <6)
                costReg=2.2;
            else if (weight>6 && weight<10)
                costReg = 3.7;
            else if (weight >10)
                costReg = 4.5;
        if (type.equals("express")||type.equals("Express"))
            costReg = costReg+3;

        System.out.println("Your package costs "+costReg);

    }
}