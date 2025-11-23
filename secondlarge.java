import java.util.Arrays;

public class secondlarge {
    public static void main(String[] args) {
         int [] arr={4,3,2,1,15,15,6};
        int largest=arr[0];
        int secondlargest=-1;

//         Arrays.sort(arr);
// System.out.println("largest: "+arr[arr.length-1]);
// System.out.println("second-largest: "+arr[arr.length-2]);

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
                            }else if(arr[i]<largest && arr[i]>secondlargest){
                                secondlargest=arr[i];
                            }
        }
        System.out.println("largest: "+largest);
        System.out.println("second-largest: "+secondlargest);

    }
}