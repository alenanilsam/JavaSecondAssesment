package com.assesment.main;

import java.io.IOException;
import java.sql.SQLException;

import com.assesment.finalmethods.*;

public class AssesmentSql {
	public static void main(String[] args) throws IOException, SQLException {
		 
		FinalCall fc = new FinalCall();
		fc.finalCall();
		PrintingMethods writefiler= new PrintingMethods();
        writefiler.setSql();
       
	}

}
