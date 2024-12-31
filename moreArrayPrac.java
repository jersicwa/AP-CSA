import java.util.Arrays;

public class moreArrayPrac {
    public static void main(String[] args) {
        int[] source = {26, 35, 20, 13, 48, 23, 5, 63, 12};
        int target = 5;
        int ind = findIndex(source, target);
        System.out.println("index of the target value is "+ind);
        swapEnds(source);
        System.out.println(Arrays.toString(source));
    }
    public static int[] makeMiddle(int[] nums){
        int[] newArr = new int[2];
        newArr[0]=nums[nums.length/2-1];
        newArr[1]=nums[nums.length/2];
        return newArr;
    }
    public static int[] makeEnds(int[] nums){
        int[] newArr = new int[2];
        newArr[0]=nums[0];
        newArr[0]=nums[nums.length-1];
        return newArr;
    }
    public static int[] swapEnds(int[] source)
    {
        int first = source[0];
        int last=source[source.length-1];
        source[0]=last;
        source[source.length-1]=first;
        return source;
    }
    public static int getMaxValue(int[] sourceArray)
    {
        int min=sourceArray[0]; // set up to be the min value
        for(int i=0;i<sourceArray.length;i++){
            if(sourceArray[i]<min)
                min=sourceArray[i];
        }

        return min;
    }

    public static int findIndex(int[] sourceArr, int targetValue) {
        int index = -1;
        for (int i = 0; i < sourceArr.length; i++) {
            if (targetValue == sourceArr[i]) {
                index = 1;
                break;
            }
        }
return index;
    }
}

