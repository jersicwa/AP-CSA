public class TwoDArrayPrac {
    public static void main(String[] args) {
        int[][] temp = {
                {80, 95}, {70, 85}, {86, 85}};
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                sum += temp[i][i];
            }
            System.out.println(sum);
        }

    }

    public static int getMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];

            }
        }
        return max;
    }
    public static void printDiagonal(int[][] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i][i]);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i][arr.length-1-i]);
        }
    }
    public static void printDiagona(int[][] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i][i]);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i][arr.length-1-i]);
        }
    }
}
