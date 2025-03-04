public class circleTest {
    public static void main(String[] args) {
        Circle c1=new Circle(2.3);
        System.out.println("Area is "+c1.getArea());
        Circle c2 = new Circle(5.6);
        System.out.println("Perimeter is "+c2.getPerimeter());
        Circle c3 = new Circle(10);
        int[] arr = new int[3];
        Circle[] arrCircle = new Circle[3];
        arrCircle[0]=c1;
        arrCircle[1]=c2;
        arrCircle[2]=c3;
    }
    public static Circle searchCircle(Circle[] arr,double radius) {
        for (int i = 0; i < arr.length; i++) {
            Circle curCircle = arr[i];
            double curRadius = curCircle.getRadius();
            if (curRadius == radius) {
                return curCircle;
            }
        }
        return null;
    }

}

