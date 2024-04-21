package revesion_Feb2024;

public class Find_First_Unique_Number_In_Array {
    // Find the first unique number in array and return it
    public static void main(String[] args) {
        int arr[] ={1000,2000,3000,4,1000,2000,3000,7000,1,7000};
        System.out.println(findFirstUniqueNumberInArray(arr));
    }
    static int findFirstUniqueNumberInArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return 0;
    }
}
