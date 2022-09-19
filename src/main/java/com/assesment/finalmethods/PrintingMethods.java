package com.assesment.finalmethods;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.gson.Gson;

public class PrintingMethods {
	double adm;
	String name;
	

	public void setSql() throws IOException, SQLException {
		SettersAndGetters student2 = new SettersAndGetters();
		final String url = "jdbc:mysql://localhost:3306/aliens";
		final String user = "root";
		final String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("connection estabilished");

		String fis = "C:\\Users\\alen.anil\\Downloads\\info.xlsx"; // creating a new file instance
		// obtaining bytes from the file
		// creating Workbook instance that refers to .xlsx file
		FileWriter file = new FileWriter(
				"C:\\Users\\alen.anil\\Downloads\\MavenTestApp\\src\\main\\java\\com\\assesment\\resources\\output.json");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1");
		List <SettersAndGetters> student3 =new ArrayList<>();
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			double adm2 = sheet.getRow(i).getCell(0).getNumericCellValue();
			String name1 = sheet.getRow(i).getCell(1).toString();
			double phys = sheet.getRow(i).getCell(2).getNumericCellValue();
			double chem = sheet.getRow(i).getCell(3).getNumericCellValue();
			double maths = sheet.getRow(i).getCell(4).getNumericCellValue();
			student2.setAdmission(adm2);
			student2.setName(name1);
			student2.setPhysicsMark(phys);
			student2.setChemistryMark(chem);
			student2.setMathematicsMark(maths);
			double admissionumber = student2.getAdmission();
			String name2 = student2.getName();
			double physicsmark1 = student2.getphysicsMark();
			double chemistrymark1 = student2.getchemistryMark();
			double mathematicsmark1 = student2.getmathematicsMark();
			 student3.add(student2);
			String sql = "insert into aliennames values('" + name2 + "', '" + admissionumber + "', '" + chemistrymark1
					+ "', '" + mathematicsmark1 + "', '" + physicsmark1 + "');";
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			String json = new Gson().toJson(student3);
			file.write(json);

		}
		file.close();
		wb.close();

	}
}
