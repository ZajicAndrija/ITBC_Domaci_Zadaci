package domaci18_2;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Zadatak2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        ArrayList<String> original = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            XSSFRow row = sheet.getRow(i);
            String ime = row.getCell(0).getStringCellValue();
            original.add(ime);
        }

        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            String ime = faker.name().firstName();
            original.add(ime);
        }

        XSSFSheet noviSheet = workbook.createSheet("noviSheet");
        for (int i = 0; i < original.size(); i++) {
            XSSFRow row = noviSheet.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(original.get(i));
        }

        FileOutputStream fos = new FileOutputStream("Zadatak2.xlsx");
        workbook.write(fos);

        workbook.close();
    }
}
