package pagesObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com")
public class CompraProductoPageObject extends PageObject {

    @FindBy (xpath = "//INPUT[@id='user-name']")
    public WebElementFacade txtUsername;

    @FindBy (xpath = "//INPUT[@id='password']")
    public WebElementFacade txtPassword;

    @FindBy (xpath = "//INPUT[@id='login-button']")
    public WebElementFacade btnLogin;

    @FindBy (xpath = "//DIV[@class='inventory_item_name'][text()='Sauce Labs Backpack']")
    public WebElementFacade tagBackpack;

    @FindBy (xpath = "//BUTTON[@id='add-to-cart-sauce-labs-backpack']")
    public WebElementFacade btnAddToCart;

    @FindBy (xpath = "//A[@class='shopping_cart_link']")
    public WebElementFacade btnShoppingCart;

    @FindBy (xpath = "//BUTTON[@id='checkout']")
    public WebElementFacade btnCheckOut;

    @FindBy (xpath = "//INPUT[@id='first-name']")
    public WebElementFacade txtFirstName;

    @FindBy (xpath = "//INPUT[@id='last-name']")
    public WebElementFacade txtLastName;

    @FindBy (xpath = "//INPUT[@id='postal-code']")
    public WebElementFacade txtZipCode;

    @FindBy (xpath = "//INPUT[@id='continue']")
    public WebElementFacade btnContinue;

    @FindBy (xpath = "//BUTTON[@id='finish']")
    public WebElementFacade btnFinish;

    @FindBy (className = "complete-header")
    public WebElementFacade lblValidacionExitosa;


    public void Login(List<String> parametros) {
        txtUsername.click();
        txtUsername.clear();
        txtUsername.sendKeys(parametros.get(0));
        txtPassword.click();
        txtPassword.clear();
        txtPassword.sendKeys(parametros.get(1));
        btnLogin.click();
    }

    public void SeleccionarProducto(){
        tagBackpack.click();
    }

    public void AgregarAlCarrito () {
        btnAddToCart.click();
    }

    public void IrAlCarrito () {
        btnShoppingCart.click();
    }

    public void Checkout () {
        btnCheckOut.click();
    }

    public void LlenarFormulario (List<String> parametros) {
        txtFirstName.click();
        txtFirstName.clear();
        txtFirstName.sendKeys(parametros.get(0));
        txtLastName.click();
        txtLastName.clear();
        txtLastName.sendKeys(parametros.get(1));
        txtZipCode.click();
        txtZipCode.clear();
        txtZipCode.sendKeys(parametros.get(2));
        btnContinue.click();
    }

    public void FinalizarCompra () {
        btnFinish.click();
    }

    public String ValidarCompra () {

        String textoParaVerificar = lblValidacionExitosa.getText();
        return textoParaVerificar;
    }
}