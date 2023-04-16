/**
 * 
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Lab 4
 * Semester year Spring 2023
 */
import java.util.*;
import java.io.*;
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws StringTooLongException{
		// TODO Auto-generated method stub
		FileProcessor read = new FileProcessor("GoodString.txt", 5);
		StringTooLongException stretch= new StringTooLongException();
		read.processFile();
		if(read.getStringLength()>5)
			throw stretch;
	//	read.getArrayListSize();
	}//end main()

}//end Application
