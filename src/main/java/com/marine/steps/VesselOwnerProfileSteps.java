package com.marine.steps;

import com.marine.pages.VesselOwnerProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VesselOwnerProfileSteps {

    VesselOwnerProfilePage vesselOwnerProfilepage = new VesselOwnerProfilePage();

    @When("user select menu vessel owner")
    public void userSelectMenuVesselOwner() {
        vesselOwnerProfilepage.clickMenuProfile();
        vesselOwnerProfilepage.clickSubMenuVesselOwner();
    }

    @And("vessel owner table will be displayed")
    public void vesselOwnerTableWillBeDisplayed() {
        vesselOwnerProfilepage.isDisplayedVesselOwnerProfile();
    }

    @And("user click button Add New")
    public void userClickButtonAddNew() {
        vesselOwnerProfilepage.clickButtonAddNew();
    }

    @And("user will directed to input vessel owner form")
    public void userWillDirectedToInputVesselOwnerForm() {
        vesselOwnerProfilepage.isDisplayedVesselOwnerForm();
    }

    @And("user will directed to contact person information page")
    public void userWillDirectedToContactPersonInformationPage() {
        vesselOwnerProfilepage.isDisplayedContactPersonForm();
    }
    @And("user will directed to bank account information page")
    public void userWillDirectedToBankAccountInformationPage() {
        vesselOwnerProfilepage.isDisplayedBankAccountForm();
    }

    @And("user will directed to legal information page")
    public void userWillDirectedToLegalInformationPage() {
        vesselOwnerProfilepage.isDisplayedLegalForm();
    }
    @And("user input vessel owner information's code with {}")
    public void userInputVesselOwnerInformationSCodeWith(String voCode) {
        vesselOwnerProfilepage.inputCode(voCode);
    }

    @And("user input vessel owner information's name with {}")
    public void userInputVesselOwnerInformationSNameWith(String voName) {
        vesselOwnerProfilepage.inputName(voName);
    }

    @And("user input vessel owner information's address with {}")
    public void userInputVesselOwnerInformationSAddressWith(String voAddress) {
        vesselOwnerProfilepage.inputAddress(voAddress);
    }

    @And("user input vessel owner information's area with {}")
    public void userInputVesselOwnerInformationSAreaWith(String voArea) {
        vesselOwnerProfilepage.inputArea(voArea);
    }

    @And("user input vessel owner information's notes with {}")
    public void userInputVesselOwnerInformationSNotesWith(String voNotes) {
        vesselOwnerProfilepage.inputNotes(voNotes);
    }

    @And("user input vessel owner information's tags with {}")
    public void userInputVesselOwnerInformationSTagsWith(String voTags) {
        vesselOwnerProfilepage.inputTags(voTags);
    }

    @And("user input vessel owner information's PIC with {}")
    public void userInputVesselOwnerInformationSPICWith(String voPic) {
        vesselOwnerProfilepage.inputPic(voPic);
    }

    @And("user input contact person information's name with {}")
    public void userInputContactPersonInformationSNameWith(String cpiName) {
        vesselOwnerProfilepage.inputCpiName(cpiName);
    }

    @And("user input contact person information's position with {}")
    public void userInputContactPersonInformationSPositionWith(String cpiPosition) {
        vesselOwnerProfilepage.inputCpiPosition(cpiPosition);
    }

    @And("user input contact person information's phone with {}")
    public void userInputContactPersonInformationSPhoneWith(String cpiPhone) {
        vesselOwnerProfilepage.inputCpiPhone(cpiPhone);
    }

    @And("user input contact person information's email with {}")
    public void userInputContactPersonInformationSEmailWith(String cpiEmail) {
        vesselOwnerProfilepage.inputCpiEmail(cpiEmail);
    }

    @And("user input contact person information's notes with {}")
    public void userInputContactPersonInformationSNotesWith(String cpiNotes) {
        vesselOwnerProfilepage.inputCpiNotes(cpiNotes);
    }
    @And ("user input bank account information {}")
    public void userInputBankAccountInformation(String name) throws InterruptedException {
        vesselOwnerProfilepage.inputBankAccount(name);

    }
    @And("user input bank account number with {}")
    public void userInputBankAccountNumberWith(String bankAccountNumber) throws InterruptedException {
        vesselOwnerProfilepage.inputBankAccountNumber(bankAccountNumber);
    }

    @And("user click button next")
    public void userClickButtonNext() {
        vesselOwnerProfilepage.clickButtonNext();
    }

    @And("user input legal information's Surat Pengesahan kehakiman with {}")
    public void userInputLegalInformationSSuratPengesahanKehakimanWith(String voSpk) {
        vesselOwnerProfilepage.inputSpk(voSpk);
    }

    @And("user input legal information's Akta with {}")
    public void userInputLegalInformationSAktaWith(String voAkta) {
        vesselOwnerProfilepage.inputAkta(voAkta);
    }

    @And("user input legal information's NIB with {}")
    public void userInputLegalInformationSNIBWith(String voNib) {
        vesselOwnerProfilepage.inputNib(voNib);
    }

    @And("user input legal information's SIUP with {}")
    public void userInputLegalInformationSSIUPWith(String voSiup) {
        vesselOwnerProfilepage.inputSiup(voSiup);
    }

    @And("user input legal information's SPPKP with {}")
    public void userInputLegalInformationSSPPKPWith(String voSppkp) {
        vesselOwnerProfilepage.inputSppkp(voSppkp);
    }

    @And("user input legal information's Surat Keterangan Terdaftar with {}")
    public void userInputLegalInformationSSuratKeteranganTerdaftarWith(String voSkt) {
        vesselOwnerProfilepage.inputSkt(voSkt);
    }

    @And("user input legal information's NPWP with {}")
    public void userInputLegalInformationSNPWPWith(String voNpwp) {
        vesselOwnerProfilepage.inputNpwp(voNpwp);
    }

    @And("user input legal information's NPWP File with {}")
    public void userInputLegalInformationSNPWPFileWith(String voNpwpFile) {
        vesselOwnerProfilepage.inpuNpwpFile(voNpwpFile);

    }

    @And("user input legal information's SPAL signatory name with {}")
    public void userInputLegalInformationSSPALSignatoryNameWith(String VoSpalSignatory) {
        vesselOwnerProfilepage.inputVoSpalSignatory(VoSpalSignatory);
    }

    @And("user input legal information's SPAL signatory KTP with {}")
    public void userInputLegalInformationSSPALSignatoryKTPWith(String VoSignatoryKtp) {
        vesselOwnerProfilepage.inputVoSignatoryKtp(VoSignatoryKtp);
    }

    @And("user input legal information's Director Name with {}")
    public void userInputLegalInformationSDirectorNameWith(String DirectorName) {
        vesselOwnerProfilepage.inputDirectorName(DirectorName);
    }

    @And("user input legal information's Director KTP with {}")
    public void userInputLegalInformationSDirectorKTPWith(String DirectorKtp) {
        vesselOwnerProfilepage.inputDirectorKtp(DirectorKtp);
    }
    @And("user click button save as draft")
    public void userClickButtonSaveAsDraft() {
        vesselOwnerProfilepage.clickButtonDraft();

    }

    @Then("vessel owner profile successfully with status draft")
    public void vesselOwnerProfileSuccessfullyWithStatusDraft() {
    }


    @And("user click button submit")
    public void userClickButtonSubmit()
    {
        vesselOwnerProfilepage.clickButtonSubmit();
    }
}
