public class FindTheMissingNumberInArray_1 {
    public static void main(String[] args) {
        // First you need to Sort the array
        int[] arr ={1,3,5,6,9,12};
        int prev = arr[0];
        for(int i =0;i<arr.length;i++){
            int gap = arr[i] - prev;
            if((gap-1)==1){
                System.out.println(prev+1);
            }
            else if(gap>1) {
                System.out.println((prev+1)+"-->"+(arr[i]-1));
            }
            prev =arr[i];
        }

    }
}
