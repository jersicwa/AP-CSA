public class Operators1 {
    public static void main(String[] args) {
        //%: get the remainder
        int rem=12%5; //2
        //++,--
        int x=10;
        int y=x++; //x=x+1
        System.out.println(y);
        x--; // x=x+1
        int a=10;
        int z=++a; //1.increase a=a+1; 2. assign the value z=a

        System.out.println(z);


        //+=, -=, *=, /=, %=
        int f=2;
        f+=1; // f=f+5
        f-=5; //f=f-5

        //compare: 1. compare numbers 2. compare strings
        // 1. compate numbers, 1) equal ==, 2) not equal !=, 3) >=,> 4) <=, <
        boolean comRes = x==y;
        System.out.println(comRes);
        comRes = x!=y;
        System.out.println(comRes);
        //comparison always has a result, either true or false (boolean data type)
        System.out.println(x<50);
        // compare string: use word: .equals to compare strings
        String name1="Kevin";
        String name2="Kelly";
        System.out.println(name1.equals(name2)); //.equals is a method
        System.out.println(!name1.equals(name2)); // exclamation mark at the beginning for not equal
        /* Logical Operators
        1) &&: true if both are true
        2) ||: true if one is true
        3)
         */
        System.out.println(x==10 || y<10);

        // .length(): returns the length of the string
        String name="kevin";
        System.out.println("there are " + name.length() + " letters in the name");
        name=name.toLowerCase();
        name = name.toUpperCase();
        // index always starts from 0, shows -1 if not found, if there is multiple it shows the first occurance
        int index = name.indexOf("V");
        System.out.println("'6' is a \"number\"\\");
        // Adding numbers and strings


    }
}
