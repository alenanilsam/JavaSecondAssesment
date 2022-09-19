package com.assesment.finalmethods;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.google.gson.Gson;

public class MySqlSearchDisplay {
	public void searchMethod() throws IOException, SQLException {
		System.out.println("TO Search using admissionNumber press 0 or by name press 1");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		if (value == 0) {
			System.out.println("Enter ur admissionnumber");

			int adm = sc.nextInt();
			System.out.println("Searching....");

			String sql = "select * from aliennames where admissionNumber='" + adm + "';";
			final String url = "jdbc:mysql://localhost:3306/aliens";
			final String user = "root";
			final String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next() == false) {
				System.out.println("no records found");
			} else {
				do {
					SettersAndGetters student1 = new SettersAndGetters();
					int adm1 = rs.getInt(2);
					String name1 = rs.getString(1);
					Double chem = rs.getDouble(3);
					Double math = rs.getDouble(4);
					Double phy = rs.getDouble(5);
					student1.setAdmission(adm1);
					student1.setName(name1);
					student1.setPhysicsMark(phy);
					student1.setChemistryMark(chem);
					student1.setMathematicsMark(math);
					Gson json1 = new Gson();
					String jsonobject = json1.toJson(student1);
					System.out.println(jsonobject);
				} while (rs.next());
			}

		}

		else {
			System.out.println("You have selected Search by Name Enter the Name : ");

			String studentname = sc.next().toLowerCase();
			System.out.println("Searching....");
			String sql3 = "Select * from aliennames where name='" + studentname + "';";

			final String url = "jdbc:mysql://localhost:3306/aliens";
			final String user = "root";
			final String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql3);
			if (rs.next() == false) {
				System.out.println("not found!");
			} else {
				do {
					SettersAndGetters student1 = new SettersAndGetters();
					int adm1 = rs.getInt(2);
					String name1 = rs.getString(1);
					Double chem = rs.getDouble(3);
					Double math = rs.getDouble(4);
					Double phy = rs.getDouble(5);
					student1.setAdmission(adm1);
					student1.setName(name1);
					student1.setPhysicsMark(phy);
					student1.setChemistryMark(chem);
					student1.setMathematicsMark(math);
					Gson json1 = new Gson();
					String jsonobject = json1.toJson(student1);
					System.out.println(jsonobject);

				} while (rs.next());

			}
		}

	}
}
