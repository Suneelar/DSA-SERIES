public class sorted {
    public static void main(String[] args) {
        int []arr={4,3,2,1,15,6};
        boolean issorted=true;
     for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            issorted=false;
            break;
        }
    }
    if(issorted){
        System.out.println("Array is sorted");
    }else{
 System.out.println("Arrray is not sorted");
    }
   
     
    }
}
