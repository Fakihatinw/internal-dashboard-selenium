@VesselOwner
Feature: Vessel Owner

  @VesselOwnerDraft
  Scenario Outline: User should be able to create vessel owner profile successfully with status draft
    Given user state logged in with <username> and <password>
    And user select menu vessel owner
    Then vessel owner table will be displayed
    When user click button Add New
    Then user will directed to input vessel owner form
    And user input vessel owner information with code "BJK-*", name "PT BUANA JAYA KARYA", address "Jl. Setrohadi, Duduksampeyan", area "Jawa Timur", notes "Gresik", tags "bagus", pic "Hatin Admin Account"
    And user click button next
    Then user will directed to contact person information page
    And user input contact person information <cpi_name> <cpi_position> <cpi_phone> <cpi_email> <cpi_notes>
    And user click button next
    Then user will directed to bank account information page
    And user input bank account information <bank_account> <bank_account_number>
    And user click button next
    Then user will directed to legal information page
    And user input legal information <vo_spk> <vo_akta> <vo_nib> <vo_siup> <vo_sppkp> <vo_skt> <vo_npwp_number> <vo_npwp> <file_name>
   And user click button save as draft
   Then vessel owner profile successfully with status draft

    Examples:
      | username                         | password   |  |  |  |  |  |  |  |  |  |  | cpi_name | cpi_position | cpi_phone    | cpi_email            | cpi_notes | bank_account | bank_account_number | vo_spk | vo_akta | vo_nib | vo_siup | vo_sppkp | vo_skt | vo_npwp_number | vo_npwp         | file_name            |  |
      | fakihatin.wafiyah@marinetechs.co | Marine#123 |  |  |  |  |  |  |  |  |  |  | Anonym   | Marketing    | 628888432444 | buanakarya@gmail.com | notes     | Bank BCA     | 0943248487          | ""     | ""      | ""     | ""      | ""       | ""     | ""             | 098342424242422 | Cargo_Manifest_1.pdf |  |

#
#
#  @VesselOwnerSubmit
#    Scenario: Submit vessel owner input
#    Given user click button submit
#    Then vessel owner profile successfully with status created

