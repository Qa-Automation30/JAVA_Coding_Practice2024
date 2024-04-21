package reverseAString;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 12345;
        // o/p-> 54321
        int revNumber = 0;
        while (num != 0) {
            int digit = num % 10;  // It will return the reminder
            revNumber = revNumber * 10 + digit;
            num = num / 10;
        }
        System.out.println(revNumber);
    }
}
