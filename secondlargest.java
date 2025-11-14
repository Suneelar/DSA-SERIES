import java.util.Arrays;

public class secondlargest {


    void burteSolution(int [] arr){
 Arrays.sort(arr);
        int largest = arr[0];
        int secondlargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // n  ==(nlogn+n)TC
        for(int i=arr.length-2;i<arr.length-1;i++){
            if(arr[i]!=largest){
                secondlargest=arr[i];
                break;
            }
        }
        System.out.println(secondlargest);
    }

    void betterappraoch(int[] arr){
int secondlargest=Integer.MIN_VALUE;
int largest=Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++){
  if (arr[i] > largest) {
                largest = arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=largest){
        secondlargest=arr[i];
    }
}
    System.out.println(secondlargest);

    }

    void optimalApp(int[] arr){
int largest=arr[0];
int secondlargest=Integer.MIN_VALUE;
for(int i=0;i<arr.length-1;i++){
    if(arr[i]>largest){
        
    }
}
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 12,15, 12,11,10, 4, 56 };
 // sort (NlogN) // non static to create an object
secondlargest obj=new secondlargest();
// obj.burteSolution(arr);

obj.betterappraoch(arr);

       

    }
}
