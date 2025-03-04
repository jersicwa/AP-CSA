public class more2dstuff {
    public static void main(String[] args) {
        int[][] arr = {{10, 9, 8},{7, 6, 5}, {4, 3, 2}};
        for(int row = 0; row < arr.length; row++)
        {
            for(int num: arr[row])
            {
                System.out.println(arr[row][row] == num);
            }
        }
    }
}
