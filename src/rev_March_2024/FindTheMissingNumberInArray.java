package rev_March_2024;

public class FindTheMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,4,7,9};
        int prev = arr[0];
        for(int i=0;i<arr.length;i++){
            int gap = arr[i]- prev;
            if((gap-1)==1){
                System.out.println((prev+1));
            }
            else if(gap>1) {
                System.out.println((prev+1)+"--->"+(arr[i]-1));
            }
            prev = arr[i];
        }
    }
}
