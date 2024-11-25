import java.util.Scanner;

public class soundWavecalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to calculate through air, water, or steel?");
        System.out.println("How far did it travel? (ft)");
        double distance = input.nextDouble();

        double timeAir = distance / 1100;
        double timeWater = distance / 4900;
        double timeSteel = distance / 16400;

    }
}


