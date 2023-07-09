@VesselOwner
Feature: Vessel Owner

  @Test
  Scenario Outline: User should be able to create vessel owner profile successfully with status draft
    Given user state logged in with <username> and <password>
    When user select menu vessel owner
    And vessel owner table will be displayed
    And user click button Add New
    And user will directed to input vessel owner form
    And user input vessel owner information's code with <vo_code>
    And user input vessel owner information's name with <vo_name>
    And user input vessel owner information's address with <vo_address>
    And user input vessel owner information's area with <vo_area>
    And user input vessel owner information's notes with <vo_notes>
    And user input vessel owner information's tags with <vo_tags>
    And user input vessel owner information's PIC with <vo_pic>
    And user click button next
    And user will directed to contact person information page
    And user input contact person information's name with <cpi_name>
    And user input contact person information's position with <cpi_position>
    And user input contact person information's phone with <cpi_phone>
    And user input contact person information's email with <cpi_email>
    And user input contact person information's notes with <cpi_notes>
    And user click button next
    And user will directed to bank account information page
    And user input bank account information <bank_account>
    And user input bank account number with <bank_account_number>
    And user click button next
    And user will directed to legal information page
    And user input legal information's Surat Pengesahan kehakiman with <vo_spk>
    And user input legal information's Akta with <vo_akta>
    And user input legal information's NIB with <vo_nib>
    And user input legal information's SIUP with <vo_siup>
    And user input legal information's SPPKP with <vo_sppkp>
    And user input legal information's Surat Keterangan Terdaftar with <vo_skt>
    And user input legal information's NPWP with <vo_npwp_number>
    And user input legal information's NPWP File with <vo_npwp_file>
    And user input legal information's SPAL signatory name with <vo_spal_signatory_name>
    And user input legal information's SPAL signatory KTP with <vo_spal_ktp>
    And user input legal information's Director Name with <vo_director_name>
    And user input legal information's Director KTP with <vo_director_ktp>
    And user click button save as draft
    Then vessel owner profile successfully with status draft

    Examples:
      | username                         | password   | vo_code | vo_name             | vo_address                             | vo_area                | vo_notes           | vo_tags    | vo_pic              | cpi_name      | cpi_position | cpi_phone    | cpi_email        | cpi_notes          | bank_account | bank_account_number | vo_spk | vo_akta | vo_nib | vo_siup | vo_sppkp | vo_skt | vo_npwp_number       | vo_npwp_file     | vo_spal_signatory_name | vo_spal_ktp | vo_director_name | vo_director_ktp |  |
      | fakihatin.wafiyah@marinetechs.co | Marine#123 |         | PT Buana Karya Auto | Jalan Ir.Soekarno No.7 Jakarta Selatan | Jawa Timur, Jawa Barat | automation_testing | automation | Hatin Admin Account | Kamila Nabila | Finance      | 628978654321 | kamila@gmail.com | testing automation | Bank BCA     | 1111                |        |         |        |         |          |        | 48.328.648.2-384.372 | Cargo_Manifest_1 |                        |             |                  |                 |  |