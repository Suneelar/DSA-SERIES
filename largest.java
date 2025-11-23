import java.lang.reflect.Array;
import java.util.Arrays;

public class largest{
    public static void main(String[] args){
        int [] arr={4,3,2,1,15,6};
        Arrays.sort(arr);
        System.out.println("largest: "+arr[arr.length-1]);

 
        // int largest=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         largest=arr[i];
        //                     }
        // }
        // System.out.println("largest: "+largest);
    }
}