import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Screen {
    private static final String PACKAGE_NAME = "com.continuum.emi.calculator";

    @FindBy(id = PACKAGE_NAME+ ":id/btnStart")
    AndroidElement startButton;
    @FindBy(id = PACKAGE_NAME+ ":id/etLoanAmount")
    AndroidElement amount;
    @FindBy(id = PACKAGE_NAME+ ":id/etInterest")
    AndroidElement interest;
    @FindBy(id = PACKAGE_NAME+ ":id/etYears")
    AndroidElement years;
    @FindBy(id = PACKAGE_NAME+ ":id/etMonths")
    AndroidElement months;
    @FindBy(id = PACKAGE_NAME+ ":id/etEMI")
    AndroidElement emi;
    @FindBy(id = PACKAGE_NAME+ ":id/etFee")
    AndroidElement etFee;
    @FindBy(id = PACKAGE_NAME+ ":id/btnCalculate")
    AndroidElement btnCalculate;
    @FindBy(id = PACKAGE_NAME+ ":id/btnReset")
    AndroidElement btnReset;
    @FindBy(id = PACKAGE_NAME+ ":id/btnDetail")
    AndroidElement btnDetail;

    @FindBy(id = PACKAGE_NAME+ ":id/monthly_emi_result")
    AndroidElement monthly_emi_result;
    @FindBy(id = PACKAGE_NAME+ ":id/total_interest_result")
    AndroidElement total_interest_result;
    @FindBy(id = PACKAGE_NAME+ ":id/processing_fee_result")
    AndroidElement processing_fee_result;
    @FindBy(id = PACKAGE_NAME+ ":id/total_payment_result")
    AndroidElement total_payment_result;

    public Screen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void calculateEmi(String loanAmount, String interestperc, String year, String month, String fee){
        amount.sendKeys(""+loanAmount+"");
        interest.sendKeys(""+interestperc+"");
        years.sendKeys(""+year+"");
        months.sendKeys(""+month+"");
        etFee.sendKeys(""+fee+"");
        btnCalculate.click();
    }
}