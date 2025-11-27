import java.util.LinkedHashSet;
import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        int arr[]={2,3,5,4,3,2,5,8};
           Set<Integer>s1=new LinkedHashSet<>();
          for(int x:arr){
          s1.add(x);
          }
          for(int x:s1){
            System.out.print(x+" ");
          }
        }
}
