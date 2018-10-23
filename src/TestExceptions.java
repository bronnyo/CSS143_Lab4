import java.io.*;

/**
 * @author Ian Bryan
 * @version 10/22/2018
 * 
 * TestExceptions uses a throws statement in the main method signature
 * to catch any child exceptions.
 */

public class TestExceptions{
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {

        //Open the Input file
        File inputFile = new File("Sample.jpg");
        //Open the Output file
        File outputFile1 = new File("Output1.jpg");
        
        try {
        //Get file handlers in Byte Stream format
        FileInputStream in1 = new FileInputStream(inputFile);
        FileOutputStream out1 = new FileOutputStream(outputFile1);

        int c1;

        while ((c1 = in1.read()) != -1){   //Until end of file
           out1.write(c1);
        }

        //Close the files
        in1.close();
        out1.close();
        }catch(IOException ioe) {
        	System.out.println("The file you have requested cannot be found");
        }
    }
}


