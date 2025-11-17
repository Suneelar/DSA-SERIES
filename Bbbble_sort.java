public class Bbbble_sort {
    public static void main(String[] args) {
        int arr[]={15,16,6,8,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
            }
        }
// Print sorted array
        for (int ii = 0; ii < arr.length; ii++) {
            System.out.print(arr[ii]+" ");
        }
    }
}
