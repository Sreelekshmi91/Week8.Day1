package week8.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnThrows {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("./testData/tc001.xlsx");
	}
}
