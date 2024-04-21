public class FindTheMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5};
        int sum=0;
        int length= arr.length;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println((length*(length+1))/2-sum);
    }
}
