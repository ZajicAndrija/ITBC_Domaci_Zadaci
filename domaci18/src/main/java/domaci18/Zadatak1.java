package domaci18;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Zadatak1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFSheet avgSheet = workbook.createSheet("avgSheet");

        for (int i = 0; i < 3; i++) {
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                double value = sheet.getRow(i).getCell(j).getNumericCellValue();
                sum += value;
                double average = sum / 5;
                avgSheet.createRow(i).createCell(0).setCellValue(average);
            }
        }

        FileOutputStream fos = new FileOutputStream("Zadatak1.xlsx");
        workbook.write(fos);

        workbook.close();
    }
}
