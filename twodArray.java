public class twodArray {
    public static void main(String[] args) {
        //if you know the value
        int[][] temp = {{80, 95}, {70,85},{86,95}};
        // if you don't know the value
        int[][] temp1=new int [3][2];
        temp1 [0][0]=80;
        temp1 [0][1]=95;
        temp1 [1][0]=70;
        temp1 [1][1]=85;
        temp1 [2][0]=86;
        temp1 [2][1]=95;
        }
        public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+", ");
            }
            System.out.println();
        }
        }
    }