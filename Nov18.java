public class Nov18 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="greetings;";
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        // Convert to string
        String s="200";
        int num=Integer.parseInt(s); // convert string to INT
        double dNum=Double.parseDouble(s); // convert string to double
        String s3=String.valueOf(s); // convert num to string
        String s4 = Integer.toString(num); // convert num to string

        // Math functions
        int x=4;
        int y=50;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(-50));

        //generate random numbers
        double rdNum= Math.random();
        System.out.println(rdNum); //range [0,1) max is 0.9999
        // range is 1-10
        int rdNumInt= ((int)(Math.random()*46)+5);
        System.out.println(rdNumInt);


    }
}
