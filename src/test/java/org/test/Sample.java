package org.test;

public class Sample extends BaseClass {

	public static void main(String[] args) {

		chromeBrowser();
		implicitlywait(20);
		urlLaunch("https://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		sendKeys(l.getTxtusername(), "9159789164");
		sendKeys(l.getTxtpassword(), "tamil9750");
//		click(l.getBtnlogin());
		
		RegistrationPage r = new RegistrationPage();
		click(r.getClick());
		sendKeys(r.getFirstname(), "tamil");
		sendKeys(r.getLastname(), "selvan");
		sendKeys(r.getMobilenumberbox(), "9159789164");
		sendKeys(r.getNewpassword(), "Tamil9750");
		sendKeys(r.getDay(), "27");
		sendKeys(r.getMonth(), "Mar");
		sendKeys(r.getYear(), "1997");
		click(r.getGender());
		click(r.getSignupbtn());

		
	
		
	}

}