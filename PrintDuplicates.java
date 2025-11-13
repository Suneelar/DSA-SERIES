import java.util.*;
public class PrintDuplicates {
 public static void main(String[] args) {
    String str="hi hi this this is java";
    String s[]=str.split(" ");
   Map<String,Integer>map=new LinkedHashMap<String,Integer>();
for(String s2:s){
    map.put(s2, map.getOrDefault(s2, 0)+1 );
}
map.forEach((key,value)->{
//     if(value>1){
//        System.out.println("This are the duplicates values:\t"+key+" "+value); 
//     }else if(value==1){
// System.out.println("This are the unquie values:\t"+key+" "+value); 
//     }
       System.out.println("This are the Fequency values:\t"+value);  
    
   
});
   
 }   
}
