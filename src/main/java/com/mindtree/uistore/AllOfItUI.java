package com.mindtree.uistore;

import org.openqa.selenium.By;

public class AllOfItUI {

	public static By allofit = By.xpath("//*[@data-dropdown-rel=\'all-of-it\']");

	public static By product = By.className("grid-product__title");

	public static By title = By.cssSelector(".h1.product-single__title");
	public static By fname=By.id("FirstName");
	public static By lname=By.id("LastName");
	public static By email=By.id("Email");
	public static By pass=By.id("CreatePassword");
	public static By submit=By.cssSelector("input[class='btn btn--full']");

}
