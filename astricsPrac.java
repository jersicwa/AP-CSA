public class astricsPrac {
    public static void main(String[] args) {
        //1
        for (int i=1; i<=4; i++) {
            System.out.println("**********");
        }
        //2
        for (int i=1;i<=5;i++){
            for (int j=1; j<=i;j++)
                System.out.println("*");
            System.out.println();
        }
    }
}
