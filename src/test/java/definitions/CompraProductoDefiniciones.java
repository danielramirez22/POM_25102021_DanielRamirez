package definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CompraProductoSteps;

import java.util.List;

public class CompraProductoDefiniciones {
    @Steps
    CompraProductoSteps compraProductoSteps;

        @Given("^El usuario inició sesión correctamente en la plataforma$")
        public void elUsuarioInicioSesionCorrectamenteEnLaPlataforma(List<String> parametros) {
            compraProductoSteps.abrirPaginaWeb();
            compraProductoSteps.iniciarSesion(parametros);
        }

        @When("^Compramos un producto$")
        public void compramosUnProducto(List<String> parametros) {
            compraProductoSteps.usuarioSeleccionaProducto();
            compraProductoSteps.usuarioAgregaAlCarrito();
            compraProductoSteps.irAlCarrito();
            compraProductoSteps.realizarCheckout();
            compraProductoSteps.DatosUsuario(parametros);
            compraProductoSteps.confirmarCompra();
        }

        @Then("^Validamos que la compra haya sido exitosa$")
        public void validamosQueLaCompraHayaSidoExitosa (List<String> parametros) {
            compraProductoSteps.validarCompra(parametros);
        }
}
