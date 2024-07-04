public abstract class Menu {
    protected CatalogoServicios catalogo;

    public Menu(CatalogoServicios catalogo) {
        this.catalogo = catalogo;
    }

    public abstract void MuestraMenu();

    public void exit() {
        System.out.println("Saliendo...");
    }
}
