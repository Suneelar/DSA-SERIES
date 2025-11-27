import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args) {
        int [] arr={13,46,24,52,20,9};
        for(int i=0;i<=arr.length-2;i++){
            int mini=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
                int temp;
                temp=arr[i];
                arr[i]=arr[mini];
                arr[mini]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}