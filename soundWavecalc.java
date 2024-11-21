import java.util.Scanner;

public class soundWavecalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to calculate through air, water, or steel?");
        String type = input.nextLine();
        System.out.println("How far did it travel? (ft)");
        double distance = input.nextDouble();

        double timeAir = distance / 1100;
        double timeWater = distance / 4900;
        double timeSteel = distance / 16400;

        if (type.equals("air") || type.equals("Air"))
            System.out.println("It traveled for " + timeAir + " feet per second in air");
        else if (type.equals("water") || type.equals("Water"))
            System.out.println("It traveled for "+timeWater+" feet per second in water");
        else if (type.equals("Steel") || type.equals("steel"))
            System.out.println("It traveled for "+timeSteel+" feet per second in steel");
        else
            System.out.println("Please input a correct value (Air, Water, Steel");

    }
}


