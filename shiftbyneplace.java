import java.lang.reflect.Array;
import java.util.Arrays;

public class shiftbyneplace{
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7};
        // o/p {3,4,5,6,7,2};
        int temp=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            (arr[i-1])=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}