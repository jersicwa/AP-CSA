import java.util.Scanner;

public class ifElseprac {
    public static void main(String[] args) {
        // ask for input of how much has been sold
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sales value");
        double sales=input.nextDouble();
        boolean value=true;
        // logic of ranges, calculate commission fee
        double commissionFee=0;
        if(sales<=10000 && sales>=0)
            commissionFee=sales*0.1;
        else if(sales>10000 && sales<=15000)
            commissionFee=sales*0.15;
        else if (sales>15000)
            commissionFee=sales*0.2;
        else
            System.out.println("Please input valid sales value");
        System.out.println("The commissions fee is: "+commissionFee);
        // print commission fee

    }
}