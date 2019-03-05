package com.testcase;




import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.login_page;


public class gmail_testcase extends Baseclass {

	@Test
	public void browserset() throws Exception {
		login_page Go = PageFactory.initElements(driver, login_page.class);
		Go.login(sh.sheetdata(0, 0, 0), sh.sheetdata(0, 0, 1));
		Go.email_write(sh.sheetdata(0, 2, 0), sh.sheetdata(0, 2, 1), sh.sheetdata(0, 4, 0));
		Go.send_mail();
			
	}
	
		}
	


