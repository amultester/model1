package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.demositepages;

public class demositetestcase extends Baseclass {
	@Test
	public void demosite() {
		demositepages pages=PageFactory.initElements(driver, demositepages.class);
		//pages.Register();
		//pages.Switchto_page();
		//pages.windowhandling();
		pages.iframehandling();
		
		
	}

	
}
