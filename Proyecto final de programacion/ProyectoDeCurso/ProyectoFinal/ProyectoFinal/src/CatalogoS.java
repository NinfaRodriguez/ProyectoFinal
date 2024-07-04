import java.util.ArrayList;
import java.util.List;

public class CatalogoS {
    private List<Servicios> servicios;
    public CatalogoS() {
        servicios = new ArrayList<>();
        inicializarServicios();
    }

    // Método para inicializar los servicios
    private void inicializarServicios() {
        servicios.add(new Servicios("Manicure", "Servicio de Manicure incluye: Limpieza de uñas, Recorte y limado, Tratamiento de Cutículas y Esmaltado", 200));
        servicios.add(new Servicios("Pedicure", "Servicio de Pedicure incluye: Limpieza de uñas, Recorte y limado, Hidratación y esmaltado", 200));
        servicios.add(new Servicios("Corte de cabello basico", "Servicio de corte de cabello para damas y caballeros", 200));
        servicios.add(new Servicios("Corte de cabello personalizado", "Servicio de corte de cabello para damas y caballeros", 300));
        servicios.add(new Servicios("Maquillaje Simple", "Servicio de maquillaje para damas natural", 150));
        servicios.add(new Servicios("Maquillaje Completo", "Servicio de maquillaje para damas personalizado", 300));
    }

    // Método para mostrar el catálogo de servicios utilizando un ciclo for con índice
    public void mostrarCatalogo() {
        System.out.println("Catálogo de servicios:");

    
            for (int i = 0; i < servicios.size(); i++) {
                Servicios servicio = servicios.get(i);
                System.out.println("Servicio: " + servicio.getNombre());
                System.out.println("Descripción: " + servicio.getDescripción());
                System.out.println("Precio: $" + servicio.getPrecio());
                System.out.println("------------------------");
            }
        }

}
