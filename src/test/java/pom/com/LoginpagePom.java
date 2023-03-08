package pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class LoginpagePom extends Baseclass {

	
	

	public LoginpagePom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login")
	private WebElement Login;
	
	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	public void loginmethod(String user,String pass) {
		enterText(getUsername(),user);
		enterText(getPassword(),pass);
	}

	public void clickbutton() {
		elementClick(getLogin());
}
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement Noofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement Checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement Checkout;
	
	@FindBy(id="adult_room")
	private WebElement Adults;
	
	@FindBy(id="child_room")
	private WebElement Childperroom;
	
	@FindBy(id="Submit")
	private WebElement Searchbutton;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return Noofrooms;
	}

	
	public WebElement getCheckindate() {
		return Checkindate;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChildperroom() {
		return Childperroom;
	}
	
	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	public void Searchhotel(String loc,String hotel,String roomtype,String Noofro,String cid,String co,String Adu,String Cpr) {
		enterText(getLocation(),loc);
		enterText(getHotels(),hotel);
		enterText(getRoomtype(),roomtype);
		enterText(getNoofrooms(),Noofro);
		enterText(getCheckindate(),cid);
		enterText(getCheckout(),co);
		enterText(getAdults(),Adu);
		enterText(getChildperroom(),Cpr);
	}


	public void submit() {
		elementClick(getSearchbutton());
}
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	public WebElement getradioButton() {
		return radioButton;
	}
	
	public void radio() {
		elementClick(getradioButton());
		
	}
	@FindBy(id="continue")
	private WebElement continu;
	
	public WebElement getcontinue() {
		return continu;
		
	}
	
	public void contbutton() {
		elementClick(getcontinue());
	}
	@FindBy(id="first_name")
	private WebElement Firstname;
	
	public WebElement getFirstname() {
		return Firstname;
	}

	
	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinu() {
		return continu;
	}
	@FindBy(id="last_name")
	private WebElement Lastname;
	@FindBy(id="address")
	private WebElement BillindAddress;
	@FindBy(id="cc_num")
	private WebElement creditcadno;
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	@FindBy(id="cc_exp_month")
	private WebElement Expirymonth;
	@FindBy(id="cc_exp_year")
	private WebElement Expiryyear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;

	

	

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBillindAddress() {
		return BillindAddress;
	}

	public WebElement getCreditcadno() {
		return creditcadno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirymonth() {
		return Expirymonth;
	}

	public WebElement getExpiryyear() {
		return Expiryyear;
	}

	public WebElement getCvv() {
		return cvv;
	}
	public void firname(String fn) {
		enterText(getFirstname(),fn);
	}
	public void lasname(String Ln) {
		enterText(getLastname(),Ln);
	}
	public void Addresscreno(String BA,String ccn) {
		enterText(getBillindAddress(),BA);
		enterText(getCreditcadno(),ccn);
		
	}
	public void bookahotel(String cct,String EM,String EY) {
		enterText(getCreditcardtype(),cct);
		enterText(getExpirymonth(),EM);
		enterText(getExpiryyear(),EY);
		
	}

	public void cvv(String cvv) {
	enterText(getCvv(),cvv);
	}
	@FindBy(id="book_now")
	private WebElement Booknow;

	public WebElement getBooknow() {
	return Booknow;
	}

	public void bookNow() {
	elementClick(getBooknow());
		
	}
}
