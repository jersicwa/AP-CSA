import java.util.Arrays;

public class twodArrayPractic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int num=1;
        int [][] newArr = new int[3][3];
        for (int j = 0; j < newArr[0].length; j++) {
            for (int i = 0; i < newArr.length; i++) {

                newArr[i][j] = num;
                num++;
                System.out.println(newArr[i][j]);
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(newArr));
    }
    }

