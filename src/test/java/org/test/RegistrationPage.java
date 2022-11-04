package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement click;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement lastname;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement mobilenumberbox;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement newpassword;

	@FindBy(id = "day")
	private WebElement day;

	@FindBy(id = "month")
	private WebElement month;

	@FindBy(id = "year")
	private WebElement year;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement gender;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement signupbtn;

	public WebElement getSignupbtn() {
		return signupbtn;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobilenumberbox() {
		return mobilenumberbox;
	}

}
