package rev_March_2024;

public class FindTheMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,7};
        int length = arr.length;
        int sum = (length+1)*(length+2)/2;
        System.out.println(sum);
        //==================================
        for(int i=0;i<length;i++){
            sum=sum-arr[i];
        }
        System.out.println("Missing number -->"+sum);

    }
}
