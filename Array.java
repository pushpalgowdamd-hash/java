package basic;

public class Array {
    public static void main(String [] args) {
        int sum = 0;
        int[] arr = {20, 30, 40, 50, 60};
        int len = arr.length;
        System.out.println("The length of the array : " + len);

        for (int i = 0; i < len; i++) {
            sum += arr[i];  
        }

        double avg = sum / len;  

        System.out.println("Average of elements: " + avg);
    }
}
