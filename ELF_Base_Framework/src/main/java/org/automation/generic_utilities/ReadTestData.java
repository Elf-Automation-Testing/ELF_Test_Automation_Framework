package org.automation.generic_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Sumanth
 *
 */
public class ReadTestData implements FrameworkConstants {

	public File abspath = new File(EXCEL_PATH);
	public Workbook workbook = null;
	private Sheet dataSheet;
	private String testCaseName;
	private int totalRowsOfData, firstRowNum, lastRowNum, iterationRow;

	/***
	 * method which helps to read all the test data which has to be executed for the
	 * given test case Id
	 * 
	 * @param sheetName       pass the sheet name in which test data is stored in
	 *                        the form of String
	 * @param testCaseName    pass the test case name whose test data is to be
	 *                        extracted
	 * @param executionColNum pass the column number in which Execution value('Yes'
	 *                        or 'No') is present (count from 1)
	 * @return returns two dimensional String array which consists of test data
	 *         required for execution
	 * @throws InvalidTestCaseIdException
	 * @throws CheckExecutionRowException
	 * @throws InvalidExecutionColumnException
	 */
	public String[][] readTestDataFromExcel(String sheetName, String testCaseName)
			throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException {

		FileInputStream fis;
		this.testCaseName = testCaseName;
		try {
			fis = new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		dataSheet = workbook.getSheet(sheetName);
		totalRowsOfData = getTotalNoOfTestData();
		getStartRowNo();
		getLastRowNo();
		int executionColNum = getExecutionColumnNumber();
		int totalcolData = getColumCount() - 2;
		getNumOfIterationRows(executionColNum);

		int row = 0;
		String[][] sarr = new String[iterationRow][totalcolData];
		for (int i = 0, k = firstRowNum; i <= (lastRowNum-firstRowNum); i++, k++) {
			if (dataSheet.getRow(k).getCell(executionColNum-1).toString().equalsIgnoreCase("Yes")) {
				for (int j = 0, l = 1; j < totalcolData; j++, l++) {
					sarr[row][j] = dataSheet.getRow(k).getCell(l).toString();
				}
				row++;
			}
		}
		return sarr;
	}

	/***
	 * method to capture the total number of test data present in the given excel
	 * sheet
	 * 
	 * @return returns the total number of rows with test data
	 */
	private int getTotalNoOfTestData() {
		return dataSheet.getPhysicalNumberOfRows();
	}

	/***
	 * method to capture the first row number of the test data for given test case
	 * 
	 * @return returns the first row number with test data for given test case
	 * @throws InvalidTestCaseIdException
	 */
	private int getStartRowNo() throws InvalidTestCaseIdException {
		int count = 0;
		for (int i = 0; i < totalRowsOfData; i++) {
			String value = dataSheet.getRow(i).getCell(0).toString();
			if (value.equalsIgnoreCase(testCaseName.trim())) {
				count++;
				firstRowNum = i;
				break;
			}
		}
		if (count == 0)
			throw new InvalidTestCaseIdException();
		else
			return firstRowNum;
	}

	private int getExecutionColumnNumber() {
		return dataSheet.getRow(firstRowNum).getPhysicalNumberOfCells();
	}
	/***
	 * method to capture the last row number of the test data for given test case id
	 * 
	 * @return returns the last row number with test data for given test case
	 */
	private int getLastRowNo() {
		for (int i = firstRowNum; i < totalRowsOfData; i++) {
			String value = dataSheet.getRow(i).getCell(0).toString();
			if (value.equalsIgnoreCase(testCaseName.trim())) {
				lastRowNum = i;
			}
		}
		return lastRowNum;
	}

	/***
	 * method to capture the number of rows of test data for particular execution
	 * @param executionColNum
	 * @return returns the number of test data rows that has to be executed
	 * @throws CheckExecutionRowException
	 * @throws InvalidExecutionColumnException
	 */
	private int getNumOfIterationRows(int executionColNum)
			throws CheckExecutionRowException, InvalidExecutionColumnException {

		for (int i = firstRowNum; i <= lastRowNum; i++) {
			if (dataSheet.getRow(i).getCell(executionColNum-1).toString().equalsIgnoreCase("Yes")) {
				iterationRow++;
			}
		}
		if (iterationRow == 0)
			throw new CheckExecutionRowException();
		else
			return iterationRow;
	}

	/***
	 * method to capture the number of data present for given test case
	 * 
	 * @return returns the number of columns with test data for a specific test case
	 */
	private int getColumCount() {
		int numOfCol = dataSheet.getRow(firstRowNum).getPhysicalNumberOfCells();
		return numOfCol;
	}

	/**
	 * This method is used to read the numeric data from the excel in the form of
	 * double
	 * 
	 * @param filePath  the path of the Excel file along with file name and
	 *                  extension
	 * @param sheetName the name of the sheet in which we have to read the data
	 * @param rowNum    the row number in which the data is present
	 * @param cellNum   the actual cell number in which the numeric data is present
	 * @return the data in double format
	 */
	public double readNumberDataFromExcel(String sheetName, int rowNum, int cellNum) {
		try {
			FileInputStream fis = new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}

	/**
	 * This method is used to read the boolean data from the excel in the form of
	 * boolean
	 * 
	 * @param filePath  the path of the Excel file along with file name and
	 *                  extension
	 * @param sheetName the name of the sheet in which we have to read the data
	 * @param rowNum    the row number in which the data is present
	 * @param cellNum   the actual cell number in which the boolean data is present
	 * @return the data in boolean format
	 */
	public boolean readBooleanDataFromExcel(String sheetName, int rowNum, int cellNum) {
		try {
			FileInputStream fis = new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}

	/**
	 * This method is used to read the String data from the excel in the form of
	 * String
	 * 
	 * @param filePath  the path of the Excel file along with file name and
	 *                  extension
	 * @param sheetName the name of the sheet in which we have to read the data
	 * @param rowNum    the row number in which the data is present
	 * @param cellNum   the actual cell number in which the String data is present
	 * @return the data in String format
	 */
	public String readStringDataFromExcel(String sheetName, int rowNum, int cellNum) {
		try {
			FileInputStream fis = new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}

	/**
	 * This method is used to read the Date value from the excel in the form of Date
	 * 
	 * @param filePath  the path of the Excel file along with file name and
	 *                  extension
	 * @param sheetName the name of the sheet in which we have to read the data
	 * @param rowNum    the row number in which the data is present
	 * @param cellNum   the actual cell number in which the Date value is present
	 * @return the data in Date format
	 */
	public Date readDateValueFromExcel(String sheetName, int rowNum, int cellNum) {
		try {
			FileInputStream fis = new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getDateCellValue();
	}

	/**
	 * This method is used to read any data present in the excel in the form of
	 * String
	 * 
	 * @param filePath  the path of the Excel file along with file name and
	 *                  extension
	 * @param sheetName the name of the sheet in which we have to read the data
	 * @param rowNum    the row number in which the data is present
	 * @param cellNum   the actual cell number in which the data is present
	 * @return the data in String format
	 */
	public String readAnyDataFromExcelInString(String sheetName, int rowNum, int cellNum) {
		File abspath = new File(EXCEL_PATH);
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}

	/**
	 * This method is used to read all the data present in the excel in the form of
	 * String
	 * 
	 * @param filePath  the path of the Excel file along with file name and
	 *                  extension
	 * @param sheetName the name of the sheet in which we have to read the data
	 * @return all the data present in the Excel in the form of String [][]
	 */
	public String[][] readAllDataFromExcel(String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int phyRowCount = workbook.getSheet(sheetName).getPhysicalNumberOfRows();
		int phyCellCount = workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		String[][] sarr = new String[phyRowCount][phyCellCount];

		for (int i = 0; i < phyRowCount; i++) {
			for (int j = 0; j < phyCellCount; j++) {
				sarr[i][j] = workbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
			}
		}
		return sarr;
	}

	/**
	 * This method reads the data from Property file for the key which is passed
	 * 
	 * @param pass the key
	 * @return returns the value associated for the given key
	 */
	public String readDataFromPropertyFile(String key) {

		File absPath;
		FileInputStream fis;
		Properties properties = null;
		try {
			absPath = new File(PROPERTYFILE_PATH);
			fis = new FileInputStream(absPath);
			properties = new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

//*****************************************************************************
//==============================Custom Exceptions==============================
//*****************************************************************************

	@SuppressWarnings("serial")
	public class InvalidExecutionColumnException extends Exception {

		public InvalidExecutionColumnException() {
			super("Given Execution column number is invalid");
		}
	}

	@SuppressWarnings("serial")
	public class InvalidTestCaseIdException extends Exception {

		public InvalidTestCaseIdException() {
			super("Test Data for the given Test case id is not present in the given excel file");
		}
	}

	@SuppressWarnings("serial")
	public class CheckExecutionRowException extends Exception {

		public CheckExecutionRowException() {
			super("Total number of iterations selected is 0. Please check execution column in test data file");
		}
	}
}
