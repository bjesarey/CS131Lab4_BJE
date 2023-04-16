/**
 * @author brandonesarey
 * @version 1.3
 * Lab 4
 * Semester year Spring 2023
 */

import java.io.*;
import java.util.*;

public class FileProcessor extends StringTooLongException {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList;
	private Scanner input;


	public FileProcessor(String fileName, int stringLength) {
		this.fileName = fileName;
		this.stringLength = stringLength;
	}// end preferred argument constructor

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the stringLength
	 */
	public int getStringLength() {
		return stringLength;
	}

	/**
	 * @param stringLength the stringLength to set
	 */
	public void setStringLength(int stringLength) {
		this.stringLength = stringLength;
	}

	//public int getArrayListSize() {
	//	return stringList.size();
	//}// end getArrayListSize

	public void processFile() {
		try{
			Scanner file = new Scanner(new File("GoodString.txt"));
			String shortString;
			while (file.hasNextLine()) {
				shortString = file.nextLine();
				System.out.println(shortString);
				stringList.add(shortString);
			} // end while
		} // end try
		catch (FileNotFoundException gone) {
		System.out.println("Sorry. That file cannot be found.");
		} // end catch
	}// end processFile
}// end class
