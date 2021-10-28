package steps;

import net.thucydides.core.annotations.Step;
import pagesObject.CompraProductoPageObject;

import java.util.List;

public class CompraProductoSteps {

    CompraProductoPageObject compraProductoPageObject;
    @Step
    public void abrirPaginaWeb(){
        compraProductoPageObject.open();
    }

    @Step
    public void iniciarSesion(List<String> parametros){
        compraProductoPageObject.Login(parametros);
    }

    @Step
    public void usuarioSeleccionaProducto(){
        compraProductoPageObject.SeleccionarProducto();
    }

    @Step
    public void usuarioAgregaAlCarrito() {
        compraProductoPageObject.AgregarAlCarrito();
    }

    @Step
    public void irAlCarrito() { compraProductoPageObject.IrAlCarrito();}

    @Step
    public void realizarCheckout (){
        compraProductoPageObject.Checkout();
    }

    @Step
    public void DatosUsuario(List<String> parametros) {compraProductoPageObject.LlenarFormulario(parametros); }

    @Step
    public void confirmarCompra () {
        compraProductoPageObject.FinalizarCompra();
    }

    @Step
    public void validarCompra (List<String> parametros) {
        compraProductoPageObject.ValidarCompra(parametros);
    }

}
