package com.assesment.finalmethods;

import java.io.IOException;
import java.sql.SQLException;

import java.util.Scanner;

public class FinalCall {

	public void finalCall() throws IOException, SQLException {
	
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i <= 5; i++) {

				if (i == 0) {

					PrintingMethods studentdetails = new PrintingMethods();
					studentdetails.setSql();
					System.out.println("saved in mYsql");

					MySqlSearchDisplay str = new MySqlSearchDisplay();
					str.searchMethod();

				}

				System.out.println("To continue press y or exit press n");

				String input = sc.next();

				if (input.equals("y")) {
					MySqlSearchDisplay str2 = new MySqlSearchDisplay();
					str2.searchMethod();
				} else {
					System.exit(0);
				}
			}

		}

	}

