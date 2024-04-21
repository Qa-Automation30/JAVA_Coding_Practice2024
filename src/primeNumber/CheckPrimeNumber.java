package primeNumber;
// Imp need to have a look and understand the concept
public class CheckPrimeNumber {
    public static void main(String[] args) {
        /**
         * Prime number ek aise natural number hai jo sirf 1 aur khud se divisible hota hai.
         * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, etc. are prime numbers.
         */
        // Input number
        int n = 11;

        // Holds the count of values
        int count = 0;

        // There is no prime number less than 2.
        if (n <= 1) {
            System.out.println("The number is not prime");
            return;
        }

        // Do a for loop
        int num1 = n/2;
        for (int i = 1; i <= num1; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // If the number of factors is greater than 1,
        // the number is not prime.
        if (count > 1) {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("The number is prime");
    }
}}
