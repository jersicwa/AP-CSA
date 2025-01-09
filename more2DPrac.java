import java.util.Arrays;

public class more2DPrac {
    public static void main(String[] args) {
        int[][] temp = {{80, 95}, {70, 85}, {86, 95}};
        //int maxx = getMax(temp);
        int[] newArr = getSumRowsCols(temp);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.println(temp[i][j]);
            }
        }
        System.out.println(Arrays.toString(newArr));
    }


        public static int[] getSumRowsCols(int[][] arr)
        {
            int[] newArr = new int[arr.length + arr[0].length];
            int index=0;
            for(int i=0;i<arr.length;i++)
            {
                int rowTotal=0;
                for(int j=0;j<arr[i].length;j++)
                {
                    rowTotal += arr[i][j];
                }
                newArr[index] = rowTotal;
                index++;
            }
            for(int j=0;j<arr[0].length;j++)
            {
                int colTotal=0;
                for(int i=0;i<arr.length;i++)
                {
                    colTotal += arr[i][j];
                }
                newArr[index] = colTotal;
                index++;
            }
            return newArr;
        }
    }
