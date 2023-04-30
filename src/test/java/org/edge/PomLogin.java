package org.edge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin extends BaseClass{
public PomLogin() {
	PageFactory.initElements(Driver, this);
}
@FindBy(css = "div#showJoinBox")
private WebElement SignUpIcon;
public WebElement getSignUpIcon() {
	return SignUpIcon;
	
}
@FindBy(xpath="//a[text()='Already a member? Login here!']")
private WebElement AlreadyMember;
public WebElement getAlreadyMember() {
return AlreadyMember;
}
@FindBy(css = "input#login-email")
private WebElement Username;
public WebElement getUsername() {
	return Username;
	
}
@FindBy(css = "input#pass")
private WebElement Password;
public WebElement getPassword() {
	return Password;
}
@FindBy(css = "button#send2")
private WebElement Login;
public WebElement getLogin() {
	return Login;
}
@FindBy(xpath = "(//span[@class='top_navigation_menu'][contains(text(),'Men')])[1]")
private WebElement MouseoverMan;
public WebElement getMouseoverMan() {
	return MouseoverMan;
}
@FindBy(xpath = "(//a[contains(text(),'All Clothing')])[1]")
private WebElement MouseoverAllclothing;
public WebElement getMouseoverAllclothing() {
	return MouseoverAllclothing;
}
@FindBy(xpath = "//a[text()=' Activewear']")
private WebElement Activewear;
public WebElement getActivewear() {
	return Activewear;
}
@FindBy(xpath = "(//a[@title='White Affleck Half Zip Merino Wool Jumper'])[2]")
private WebElement FirstProduct;
public WebElement getFirstProduct() {
	return FirstProduct;
}
@FindBy(css = "a#swatch-5")
private WebElement ShirtSize;
public WebElement getShirtSize() {
	return ShirtSize;
}
@FindBy(css = "button#product-addtocart-button")
private WebElement AddTOBasket;
public WebElement getAddTOBasket() {
	return AddTOBasket;
}
@FindBy(css="span#develo-mini-cart-content")
private WebElement mouseovercart;
public WebElement getMouseovrcart() {
	return mouseovercart;
	
}
@FindBy(xpath = "//button[@class='button btn-inline viewAll']")
private WebElement ViewBasket;
public WebElement getViewBasket() {
	return ViewBasket;
}







}
