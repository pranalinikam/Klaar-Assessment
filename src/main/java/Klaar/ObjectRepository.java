package Klaar;

import org.openqa.selenium.By;

public class ObjectRepository {
    By loginOption = By.xpath("//p[contains(text(),'Log in with klaar')]");
    By email = By.xpath("//input[@id='email-field']");
    By password = By.xpath("//input[@id='password-field']");
    By loginButton = By.xpath("//button[@id='login-btn']");
    By settingsIcon = By.xpath("//p[contains(text(),'Settings')]");
    By workspaceSettingHeader = By.xpath("//div[@class='ant-row mb-1 ant-row-space-between']//h2");
    By workspaceName = By.xpath("//input[@data-cy='settings-workspace-name-field']");
    By saveChangesButton = By.xpath("//span[contains(text(),'Save changes')]");
    By organisationHead = By.xpath("//nz-select[contains(@nzplaceholder,'Select head of Org Chart')]");
    By organisationClear = By.xpath("//span[@class='ant-select-selection-item-remove ng-star-inserted']");
    By organisationHeadSaveButton = By.xpath("(//span[contains(text(),'Save')])[2]");
    By organisationHeadLabel = By.xpath("//label[contains(text(),'Select head of Org Chart')]");
    By deleteLogoButton = By.xpath("//button[@data-cy='settings-workspace-logo-delete-button']/i");
    By deleteConfirmButton = By.xpath("//p[contains(text(),'Delete')]");
    By userList = By.xpath("//a[contains(text(),'User List')]");
    By customFields = By.xpath("//div[contains(text(),'Custom Fields')]");
    By addFields = By.xpath("//span[contains(text(),'Add Field')]");
    By fieldName = By.xpath("//input[@formcontrolname='fieldName']");
    By fieldDataType = By.xpath("//nz-form-control[@nzerrortip='Please select field Type']");
    By customFieldSubmitButton = By.xpath("//span[contains(text(),'Submit')]");
    By optionListDataType = By.xpath("//input[@placeholder='Option List']");
    By anotherList = By.xpath("//span[contains(text(),' Add another Item')]");
    By organisationList = By.xpath("//div[contains(@class, 'cdk-overlay-container')]");
    By headerList = By.xpath("//nz-option-item//p");
    By dataTypeDropDown = By.xpath("//nz-option-container[contains(@class,'ant-select-dropdown')]");
    By listOfFieldType = By.xpath("//nz-option-item/div");
    By listOfCustomFields = By.xpath("//table//tbody[@class='ant-table-tbody ng-star-inserted']");
    By listOfCustomFieldName = By.xpath("//tr//td[2]");
    By workSpaceLogoSaveButton = By.xpath("/html/body/div[2]/app-root/app-layout/nz-layout/nz-layout/nz-content/div/app-settings/div/nz-card[3]/div/div/nz-spin/div/div/div/button[1]/p");
}
