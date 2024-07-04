import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoServicios {
    Scanner op2 = new Scanner(System.in);
    private List<Servicios> servicios;
    private List<Cita> citas;
   

    // Constructor
    public CatalogoServicios() {
        servicios = new ArrayList<>();
        citas = new ArrayList<>();
        CrearObjetosS();
    }

    private void CrearObjetosS() {
        servicios.add(new Servicios("Manicure", "Servicio de Manicure incluye: Limpieza de uñas, Recorte y limado, Tratamiento de Cutículas y Esmaltado", 200));
        servicios.add(new Servicios("Pedicure", "Servicio de Pedicure incluye: Limpieza de uñas, Recorte y limado, Hidratación y esmaltado", 200));
        servicios.add(new Servicios("Corte de cabello basico", "Servicio de corte de cabello para damas y caballeros", 200));
        servicios.add(new Servicios("Corte de cabello personalizado", "Servicio de corte de cabello para damas y caballeros", 300));
        servicios.add(new Servicios("Maquillaje Simple", "Servicio de maquillaje para damas natural", 150));
        servicios.add(new Servicios("Maquillaje Completo", "Servicio de maquillaje para damas personalizado", 300));
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de servicios:");

        for (int i = 0; i < servicios.size(); i++) {
            Servicios servicio = servicios.get(i); // Acceder  a la posicion 1
            System.out.println("Servicio: " + servicio.getNombre());
            System.out.println("Descripción: " + servicio.getDescripción());
            System.out.println("Precio: $" + servicio.getPrecio());
            System.out.println("______________________________________");
        }
    }

    public void escribirTxt() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("servicios.txt"))) {
            for (Servicios servicios : servicios) {
                bw.write(servicios.toString());
                bw.newLine();
            }
            System.out.println("Archivo guardado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void agendarCita() throws IOException {
     System.out.print("Ingrese el nombre del cliente: ");
     String nombreCliente = op2.nextLine();

        System.out.print("Ingrese el servicio a agendar: ");
        String servicio = op2.nextLine();

        System.out.print("Ingrese la fecha de la cita (dd/mm/yyyy): ");
        String fecha = op2.nextLine();

        System.out.print("Ingrese la hora de la cita (hh:mm): ");
        String hora = op2.nextLine();

        Cita cita = new Cita(nombreCliente, servicio, fecha, hora);
        citas.add(cita);
        escribirCitaTxt(cita);

        System.out.println("Cita agendada con exito!");
    }


    private void escribirCitaTxt(Cita cita) throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("citas.txt", true))){
            bw.write(cita.toString());
            bw.newLine();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

   
    public void mostrarCitas() {
    try (BufferedReader br = new BufferedReader(new FileReader("citas.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
}

