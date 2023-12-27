package testing;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Reusable_methods.readandrightxl;
import pages.data_login;

public class dataexe extends data_login{
	
	@DataProvider
	public Object[][] exefile() throws IOException {
		readandrightxl ra = new readandrightxl();
 
		return ra.excelarray();
	
	}
	
	@Test(dataProvider="exefile")
	public void dataexe(String s,String ss) throws IOException {
		launchurl();
		testlogin(s,ss);
	}

}
