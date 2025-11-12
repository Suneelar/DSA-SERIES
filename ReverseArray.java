import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
 public static void main(String [] args){
    int arr[]={1,2,3,4,5};
    // for(int i=arr.length-1;i>=0;i--){
    //     System.out.print(arr[i]+" ");
    // }

    // method 2
    int start=0;
    int end=arr.length-1;
    while(start<end){
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
// method-3
//     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
// Collections.reverse(list);
 }   
}
