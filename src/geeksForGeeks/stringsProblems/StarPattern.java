package geeksForGeeks.stringsProblems;

public class StarPattern {
    public static void main(String[] args) {
        /**
         *        *
         *        **
         *        ***
         *        ****
         *        *****
         */
        for(int i=0;i<5;i++){
          //  System.out.println(i);
            for(int j=0;j<=i;j++){
            //    System.out.println(j);
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
