import java.io.*;

public class TestExceptions{
	//uncomment for non-try/catch exception handling
	//public static void main(String[] args) throws IOException {

	public static void main(String[] args) {

		/****************************************************/
		/* FileNotFoundException error handling. When the	*/
		/* file is not found in the \src directory, the 	*/
		/* program will print a message to the console to 	*/
		/* tell the user the file wasn't found				*/
		/****************************************************/
		try{
			//Open the Input file
			File inputFile = new File("Sample.jpg");
			//Open the Output file
			File outputFile1 = new File("Output1.jpg");
			//Get file handlers in Byte Stream format
			FileInputStream in1 = new FileInputStream(inputFile);
			FileOutputStream out1 = new FileOutputStream(outputFile1);
		}catch(FileNotFoundException fnf){

			System.out.println("The file requested cannot be found");
		}
//		int c1;
//
//		while ((c1 = in1.read()) != -1){   //Until end of file
//			out1.write(c1);
//		}
//
//		//Close the files
//		in1.close();
//		out1.close();
	}
}


