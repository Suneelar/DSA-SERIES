public class MaxMin{
    void minuminm(int [] arr){
        int samllest=arr[0];
        int largest=arr[0];
         for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<samllest){
                samllest=arr[i];
            }else if(arr[i]>largest){
                largest=arr[i];
            }
        }
         System.out.println("largest element in the array: "+samllest);
         System.out.println("largest element in the array: "+largest);
    }
    
    public static void main(String[] args) {
        int [] arr={12,34,9,45,5};
        MaxMin obj=new MaxMin();
        obj.minuminm(arr);
        
    }
}