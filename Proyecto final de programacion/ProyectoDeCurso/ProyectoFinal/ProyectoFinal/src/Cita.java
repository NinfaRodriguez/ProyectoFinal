public class Cita {
    private String nombreCliente;
    private String servicio;
    private String fecha;
    private String hora;

    public Cita(String nombreCliente, String servicio, String fecha, String hora) {
        this.nombreCliente = nombreCliente;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getServicio() {
        return servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String toString() {
        return "Cita{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", servicio='" + servicio + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
        
}

