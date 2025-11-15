import java.util.LinkedHashMap;
import java.util.Map;
public class containsduplicates {
    public static void main(String[] args) {
        // input {2,1,2,1,4,5} 
        // output{2,1}
        int [] arr={1,1,1,2,2,3,3};
        Map<Integer, Integer>s1=new LinkedHashMap<Integer,Integer>();
        for(int x:arr){
            s1.put(x,s1.getOrDefault(x,0)+1);
        }
        s1.forEach((a,b)->{
            if(b>1)
System.out.println(a+" "+b);
        });
        }
    }

