import java.util.LinkedHashMap;
import java.util.Map;
public class printDuplicatesArray {
    public static void main(String[] args) {
        int [] arr={1,2,1,2,3,4};
        Map<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        for(int x:arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
      map.forEach((key,value)->{
        if(value==1){
System.out.println(key+" "+value);
        }

      });
    }
}
