package April_Rev_2024;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1;
        int n3;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=0;i<10;i++)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
    }
