public class meow {
    public static void main(String[] args) {
        public static int getTotal(int n)
        {
            if(n==1)
                return 1;
            return n+getTotal(n-1);
        }
        public static int fib(int n)
        {
            if(n==0)
                return 0;
            else if (n==1)
                return 1;
            else
                return fib(n-1) + fib(n-2);
        }

        public static int factorial(int n)
        {
            if(n==1)
                return 1;
            else
                return n * factorial(n-1);
        }
    }
}
