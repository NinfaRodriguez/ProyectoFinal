import java.io.IOException;

public class MenuC extends Menu {
    //Menu de Clientes
    public MenuC(CatalogoServicios catalogo) {
        super(catalogo);
    }

    @Override
    public void MuestraMenu() {
        System.out.println("FARICY SALON");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ver catalogo de servicios");
        System.out.println("2. Agendar cita");
        System.out.println("3. Salir");
    }

    public void verCatalogo() {
        catalogo.mostrarCatalogo();
    }

    public void agendarCita() throws IOException {
        catalogo.agendarCita();
    }
}
