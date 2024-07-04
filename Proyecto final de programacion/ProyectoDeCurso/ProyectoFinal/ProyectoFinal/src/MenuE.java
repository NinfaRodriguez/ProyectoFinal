public class MenuE extends Menu {
    public MenuE(CatalogoServicios catalogo) {
        super(catalogo);
    }

    @Override
    public void MuestraMenu() {
        System.out.println("Bienvenido al Menú de Empleados");
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("1. Ver Citas");
        System.out.println("2. Salir");
    }

    public void verCitas() {
        catalogo.mostrarCitas();
    }
}
