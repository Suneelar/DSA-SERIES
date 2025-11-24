import java.util.Set;
import java.util.TreeSet;

public class removeduplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,3,3};
        int result=twopointerapporach(arr);
        System.out.println(result);
    //     Set<Integer>s1=new TreeSet<Integer>();
    //    for(int i=0;i<arr.length;i++){
    //     s1.add(arr[i]);
    //    }
    //    int count=0;
    //    for(int x:s1){
    //     count++;
    //    }
    //    System.out.println("Count: "+count);
    }

   static int twopointerapporach(int arr[]){
int index=0;
for(int i=1;i<arr.length;i++){
if(arr[i]!=arr[index]){
    index++;
    arr[index]=arr[i];
}
}
return index+1;
    }
}
