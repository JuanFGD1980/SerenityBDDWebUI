package co.com.sofka.userinterfaces.automationpractice;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class AutomationPractice extends PageObject {

    public static final Target CONTACT = Target
            .the("Contact us")
            .located(id("contact-link"));

    public static final Target SIGN = Target
            .the("Sign in")
            .located(className("header_user_info"));

    public static final Target SUBJECT_HEADING = Target
            .the("Subject Heading")
            .located(id("uniform-id_contact"));

    public static final Target SUBJECT_HEADING_OPTION_WEBMASTER = Target
            .the("Subject Heading option3")
            .located(xpath("//*[@id=\"id_contact\"]/option[3]"));

    public static final Target SUBJECT_HEADING_OPTION_CUSTUMER = Target
            .the("Subject Heading option2")
            .located(xpath("//*[@id=\"id_contact\"]/option[2]"));

    public static final Target EMAIL = Target
            .the("Email address")
            .located(id("email"));

    public static final Target ORDER_REFERENCE = Target
            .the("Order reference")
            .located(id("id_order"));

    public static final Target MESSAGE = Target
            .the("Message")
            .located(id("message"));

    public static final Target BUTTON_SUTMITMESSAGE = Target
            .the("Button sutmit message")
            .located(id("submitMessage"));

    public static final Target EMAIL_ADDREES = Target
            .the("Email address")
            .located(id("email_create"));

    public static final Target CREATE_ACCOUNT = Target
            .the("Create an account")
            .located(id("SubmitCreate"));

    public static final Target STAR_CREATE_ACCOUNT = Target
            .the("Start Create an account")
            .located(xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/label"));

    public static final Target MAN = Target
            .the("Mr")
            .located(xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]"));

    public static final Target WOMAN = Target
            .the("Mrs")
            .located(xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]"));

    public static final Target FIRST_NAME = Target
            .the("First name")
            .located(id("customer_firstname"));

    public static final Target LAST_NAME = Target
            .the("Last name")
            .located(id("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(id("passwd"));

    public static final Target DAY = Target
            .the("Day")
            .located(id("uniform-days"));

    public static final Target DAY_BIRTH = Target
            .the("Day birth")
            .located(xpath("//*[@id=\"days\"]/option[15]"));

    public static final Target MONTH = Target
            .the("Month")
            .located(id("uniform-months"));

    public static final Target MONTH_BIRTH = Target
            .the("Month birth")
            .located(xpath("//*[@id=\"months\"]/option[3]"));

    public static final Target YEAR = Target
            .the("Day")
            .located(id("uniform-years"));

    public static final Target YEAR_BIRTH = Target
            .the("Year birth")
            .located(xpath("//*[@id=\"years\"]/option[44]"));

    public static final Target NEWSLETTER = Target
            .the("Newsletter")
            .located(id("uniform-newsletter"));

    public static final Target OFFERS = Target
            .the("Offers")
            .located(id("uniform-optin"));

    public static final Target COMPANY = Target
            .the("Company")
            .located(id("company"));

    public static final Target ADDRESS = Target
            .the("address")
            .located(id("address1"));

    public static final Target ADDRESS_ADD = Target
            .the("address")
            .located(id("address2"));

    public static final Target CITY = Target
            .the("CITY")
            .located(id("city"));

    public static final Target STATE = Target
            .the("State")
            .located(id("uniform-id_state"));

    public static final Target STATE_SELECT = Target
            .the("State select")
            .located(xpath("//*[@id=\"id_state\"]/option[11]"));

    public static final Target ZIP_CODE = Target
            .the("Postcode")
            .located(id("postcode"));

    public static final Target ADD_INFO = Target
            .the("additional information")
            .located(id("other"));

    public static final Target HOME_PHONE = Target
            .the("Home phone")
            .located(id("phone"));

    public static final Target MOBILE_PHONE = Target
            .the("Mobile phone")
            .located(id("phone_mobile"));

    public static final Target ALIAS_ADDRESS = Target
            .the("Adress alias")
            .located(id("alias"));

    public static final Target BUTTON_REGISTER = Target
            .the("Register")
            .located(id("submitAccount"));

    public static final Target MY_ADDRESS = Target
            .the("My address")
            .located(xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]"));

    public static final Target CONTAINER_INFO = Target
            .the("Container info")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[1]/h3"));

    //For validations
    public static final Target MESSAGE_VALIDATION = Target
            .the("Message comfirm send")
            .located(xpath("//*[@id=\"center_column\"]/p"));

    public static final Target NAME_LASTNAME_VALIDATION = Target
            .the("Name and lastname send")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]"));

    public static final Target ADDRESS_VALIDATION = Target
            .the("Address send")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]"));

    public static final Target CITY_VALIDATION = Target
            .the("City send")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[1]"));

    public static final Target ZIP_VALIDATION = Target
            .the("Zip code send")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[3]"));

    public static final Target MOBILE_PHONE_VALIDATION = Target
            .the("Mobile phone send")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[8]/span"));

    public static final Target USER_VALIDATION = Target
            .the("User  validation")
            .located(cssSelector(".account :nth-child(1)"));

    public static final Target USER_VALIDATION2 = Target
            .the("User  validation")
            .located(xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
















}
