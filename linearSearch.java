public class linearSearch {
    public static void main(String[] args) {
        // input:1,2,3,4,5 o/p find 3 present or not
int [] arr={1,2,5,6,3};
int target=3;
linearSearch obj=new linearSearch();
obj.linear(arr,target);
    }
    void linear(int[] arr,int target){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
if(arr[i]==target){
    System.out.println("found at particular index : "+i);
    found=true;     
    break;
}
    }
if(!found){
  System.out.println("Not founded");
}
    }
}
