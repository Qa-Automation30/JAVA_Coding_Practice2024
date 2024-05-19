package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException_1 {
    /**
     * Need to handle the exception using try catch block
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args){
        FileReader fileReader=null;
        try
        {
            File file = new File("test.xml");
            fileReader = new FileReader(file);
        }
        catch (FileNotFoundException exception)
        {
            exception.printStackTrace();
        }
        finally {
            try {
                if(fileReader!=null)
                {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /**
         * So if we add few more lines code after this and try to execute it, it will execute bcs
         * we have handled with try catch block [basically we have handled it]
         */
        System.out.println("This will print after Exception");
    }
}
