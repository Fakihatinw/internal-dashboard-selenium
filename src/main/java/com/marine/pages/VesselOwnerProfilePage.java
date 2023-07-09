package com.marine.pages;

import com.marine.core.Page;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class VesselOwnerProfilePage extends Page {

    public VesselOwnerProfilePage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(@class, 'ant-menu-title-content') and text() = 'Profile']")
    WebElement menu_profile;

    @FindBy(xpath = "//span[contains(@class, 'ant-menu-title-content') and text() = 'Vessel Owner']")
    WebElement sub_menu_vessel_owner;

    @FindBy(xpath = "//h1[text() = 'Vessel Owner Profile']")
    WebElement title_vessel_owner_profile;

    @FindBy(xpath = "//button[@type='button' and contains(@class, 'ant-btn-primary')]//span[text()='Add New']")
    WebElement button_add_new;

    @FindBy(xpath = "//div[contains(@class, 'button') and contains(@class, 'active')]//p[text() = 'Vessel Owner Information']")
    WebElement menu_vessel_owner_information;

    @FindBy (xpath = "//div[contains(@class, 'button') and contains(@class, 'active')]//p[text() = 'Contact Person Information']")
    WebElement menu_contact_person_information;

    @FindBy (xpath = "//div[contains(@class, 'button') and contains(@class, 'active')]//p[text() = 'Bank Account Information']")
    WebElement menu_bank_account_information;

    @FindBy (xpath = "//div[contains(@class, 'button') and contains(@class, 'active')]//p[text() = 'Legal Information']")
    WebElement menu_legal_information;

    @FindBy (xpath = "//input[@id='code']")
    WebElement tx_code;

    @FindBy (xpath = "//input[@id='name']")
    WebElement tx_name;

    @FindBy (xpath = "//input[@id='coverage_area']")
    WebElement tx_area;

    @FindBy (xpath = "//input[@id='additional_notes']")
    WebElement tx_notes;
    @FindBy (xpath = "//div[@id='address']//div[contains(@class, 'ql-editor')]")
    WebElement tx_address;

    @FindBy (xpath = "//input[@id='pics']")
    WebElement tx_pic;

    @FindBy (xpath = "//span[contains(@class,'site-tag-plus')]")
    WebElement btn_new_tag;

    @FindBy(xpath = "//div[2]/div/span/input")
    WebElement txt_tag;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement btn_next;

    @FindBy (xpath = "//button[@type='button']//span[text() = 'Save as Draft']")
    WebElement btn_save_as_draft;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement btn_submit;

    @FindBy (xpath = "//input[@id='contacts_0_name']")
    WebElement tx_contact_name;

    @FindBy (xpath = "//input[@id='contacts_0_position']")
    WebElement tx_contact_position;

    @FindBy (xpath = "//input[@id='contacts_0_phone_number']")
    WebElement tx_contact_phone;

    @FindBy (xpath = "//input[@id='contacts_0_email']")
    WebElement tx_contact_email;

    @FindBy (xpath = "//input[@id='contacts_0_additional_notes']" )
    WebElement tx_contact_notes;

    @FindBy (xpath = "//input[@id='bank_accounts_0_bank_name']")
    WebElement tx_bank_name;

    @FindBy (xpath = "//input[@id='bank_accounts_0_account_number']")
    WebElement tx_bank_account;

    @FindBy (xpath = "//button[@type='button']//span[text()='Check Account']")
    WebElement btn_check_account;

    @FindBy (xpath = "//div[@class='validate_state']//p[contains(text(),'A/N')]")
    WebElement lbl_is_valid_account;

    @FindBy (id = "npwp_num")
    WebElement tx_npwp;

    @FindBy (id = "npwp_doc")
    WebElement file_npwp_doc;

    @FindBy(id = "spk_doc")
    WebElement spk_doc;

    @FindBy(id = "akta_doc")
    WebElement akta_doc;

    @FindBy(id = "nib_doc")
    WebElement nib_doc;

    @FindBy (id = "siup_siupal_doc")
    WebElement siup_siupal_doc;

    @FindBy (id = "sppkp_doc")
    WebElement sppkp_doc;

    @FindBy (id = "skt_doc")
    WebElement skt_doc;

    @FindBy (id = "spal_signatory_name")
    WebElement spal_signatory_name;

    @FindBy (id = "spal_signatory_ktp_doc")
    WebElement spal_signatory_ktp_doc;

    @FindBy (id = "director_name")
    WebElement director_name;

    @FindBy (id = "director_ktp_doc")
    WebElement director_ktp_doc;


    public void clickMenuProfile() {
        menu_profile.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickSubMenuVesselOwner() {
        sub_menu_vessel_owner.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void isDisplayedVesselOwnerProfile() {
        assertTrue(title_vessel_owner_profile.isDisplayed());
    }

    public void clickButtonAddNew() {
        button_add_new.click();
    }

    public void isDisplayedVesselOwnerForm() {
        assertTrue(menu_vessel_owner_information.isDisplayed());
    }

    public void isDisplayedContactPersonForm() {
        assertTrue(menu_contact_person_information.isDisplayed());
    }

    public void isDisplayedBankAccountForm() {
        assertTrue(menu_bank_account_information.isDisplayed());
    }

    public void isDisplayedLegalForm()
    {
        assertTrue(menu_legal_information.isDisplayed());
    }

    public void inputCode(String code) {
        tx_code.sendKeys(code);
    }

    public void inputName(String voName) {
        tx_name.sendKeys(voName);
    }

    public void inputAddress(String voAddress) {
        tx_address.sendKeys(voAddress);
    }

    public void inputArea(String voArea) {
        tx_area.sendKeys(voArea);
    }

    public void inputNotes(String voNotes) {
       tx_notes.sendKeys(voNotes);
    }

    public void inputTags(String voTags) {
        btn_new_tag.click();
        txt_tag.sendKeys(voTags);
        txt_tag.sendKeys(Keys.ENTER);
    }

    public void inputPic(String voPic) {
        for (String p : voPic.split(",")) {
            tx_pic.sendKeys(p.substring(0, 3));
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[text()='" + p + "']")).click();
        }
    }

    public void inputCpiName(String cpiName) {
       tx_contact_name.sendKeys(cpiName);
    }

    public void inputCpiPosition(String cpiPosition) {
        tx_contact_position.sendKeys(cpiPosition);
    }

    public void inputCpiPhone(String cpiPhone) {
        tx_contact_phone.sendKeys(cpiPhone);
    }

    public void inputCpiEmail(String cpiEmail) {
        tx_contact_email.sendKeys(cpiEmail);
    }
    public void inputCpiNotes(String cpiNotes) {

        tx_contact_notes.sendKeys(cpiNotes);
    }

    public void inputBankAccount(String name) throws InterruptedException {
        tx_bank_name.sendKeys(name);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[starts-with(@aria-label,'" + name + "')]")).click();
    }

    public void inputBankAccountNumber(String bankAccountNumber) throws InterruptedException {
        tx_bank_account.sendKeys(bankAccountNumber);
        Thread.sleep(2000);
        btn_check_account.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        assertTrue(lbl_is_valid_account.isDisplayed());
        tx_bank_account.sendKeys(bankAccountNumber);
    }

    public void inputSpk(String voSpk) {
        spk_doc.sendKeys(voSpk);

    }

    public void inputAkta(String voAkta) {
        akta_doc.sendKeys(voAkta);
    }

    public void inputNib(String voNib) {
        nib_doc.sendKeys(voNib);
    }

    public void inputSiup(String voSiup) {
        siup_siupal_doc.sendKeys(voSiup);
    }

    public void inputSppkp(String voSppkp) {
        sppkp_doc.sendKeys(voSppkp);
    }

    public void inputSkt(String voSkt) {
        skt_doc.sendKeys(voSkt);
    }


    public void inputNpwp(String voNpwp) {
        tx_npwp.sendKeys(voNpwp);
    }

    public void inpuNpwpFile(String voNpwpFile) {
        file_npwp_doc.sendKeys(voNpwpFile);
    }

    public void inputVoSpalSignatory(String voSpalSignatory) {
        spal_signatory_name.sendKeys(voSpalSignatory);
    }

    public void inputVoSignatoryKtp(String voSignatoryKtp) {
        spal_signatory_ktp_doc.sendKeys(voSignatoryKtp);
    }

    public void inputDirectorName(String directorName) {
        director_name.sendKeys(directorName);
    }

    public void inputDirectorKtp(String directorKtp) {
        director_ktp_doc.sendKeys(directorKtp);
    }

    public void clickButtonNext() {
        btn_next.click();
    }

    public void clickButtonSubmit()
    {
        btn_submit.click();
    }
    public void clickButtonDraft() {
        btn_save_as_draft.click();
    }
}



