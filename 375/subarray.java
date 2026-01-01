public class subarray {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 9, -1, -2, 1,  -3 };
        subarrays(arr);
        subarrays1(arr);
        subarrays2(arr);
    }

    static void subarrays(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    max = Math.max(sum, max);
                }
                // System.out.print(sum + " ");
            }
            // System.out.println();
        }
         System.out.println("max: " + max);
    }
    static void subarrays1(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                max = Math.max(sum, max);

                // System.out.print(sum + " ");
            }
            // System.out.println();
        }
        System.out.println("max: " + max);

    }

    static void subarrays2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println("max: " + max);
    }

}
