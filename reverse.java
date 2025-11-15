import java.sql.Array;
import java.util.Arrays;

public class reverse {
 public static void main(String[] args) {
    // Reverse the Array
    int [] arr={1,12,3,14,4,5};
    //o/p {5,4,14,3,12,1};
int i=0;
int j=arr.length-1;
while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;  
}
System.out.println(Arrays.toString(arr));

 }   
}
