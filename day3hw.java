import java.util.Scanner;

public class day3hw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter letter of package (A, B, C)");
        String pkg1 = input.nextLine();
        System.out.println("Please enter # of hours");
        double hr1 = input.nextDouble();
        double pkgA1 = 9.95;
        double pkgA2 = ((hr1 - 10) * 2) + 9.95;
        double pkgB1 = 13.95;
        double pkgB2 = ((hr1 - 20) * 1) + 13.95;
        double pkgC = 19.95;

        if (pkg1.equals("A") || pkg1.equals("a"))
            if (hr1 <= 10 && hr1 >= 0) {
                System.out.println("Please pay " + pkgA1);
            } else if (hr1 > 10) {
                System.out.println("Please pay " + pkgA2);
            } else {
                System.out.println("Please enter correct values");
            }
        else if (pkg1.equals("B") || pkg1.equals("b")) {
            if (hr1 <= 20 && hr1 >= 0) {
                System.out.println("Please pay " + pkgB1);
            } else if (hr1 > 20) {
                System.out.println("Please pay " + pkgB2);
            } else {
                System.out.println("Please enter correct values");
            }
        } else if (pkg1.equals("C") || pkg1.equals("c")) {
            System.out.println("Please pay " + pkgC);
        } else {
            System.out.println("Please enter correct letter");


        }
    }
}