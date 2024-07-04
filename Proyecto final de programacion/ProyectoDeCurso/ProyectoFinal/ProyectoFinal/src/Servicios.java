public class Servicios {

    private String Nombre;
    private String Descripción;
    private double Precio;

    public Servicios(String Nombre, String Descripción, double Precio){
        this.Nombre = Nombre;
        this.Descripción = Descripción;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }


    public String getDescripción() {
        return Descripción;
    }


    public double getPrecio() {
        return Precio;
    }

    


    

}
