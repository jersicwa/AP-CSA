public class functionPrac {
    public static void main(String[] args) {
        addition (3,4);
    }
    public static void showMessage(){
        System.out.println("Hello");
    }
    //method signature = method name + parameters
    // you can not have two methods with the same signature
    public static void addition(int n1, int n2){
        int total = n1*n2;
        System.out.println(n1+"*"+n2+"="+total);
    }
}