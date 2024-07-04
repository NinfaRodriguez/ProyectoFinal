import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner op = new Scanner(System.in);
    private static CatalogoServicios catalogo = new CatalogoServicios();
        public static void main(String[] args) throws Exception {
            int contraseña = 470039;
            // Menu principal

            try {
                System.out.println("Bienvenido a FARICY SALON");
                System.out.println("Elige una de las siguientes opciones");
                System.out.println("1. Menú de Clientes");
                System.out.println("2. Menú de Empleados");
                int opcion = op.nextInt();
    
                switch (opcion) {
                    case 1:
                        MenuC menuClientes = new MenuC(catalogo);
                        menuClientes.MuestraMenu();
                        int opcioncc2 = op.nextInt();
                        switch (opcioncc2) {
                            case 1:
                                menuClientes.verCatalogo();
                                break;
                            case 2:
                                menuClientes.agendarCita();
                                break;
                            case 3:
                                menuClientes.exit();
                                break;
                            default:
                                break;
                        }
                        break;
    
                    case 2:
                        System.out.println("Ingrese la contraseña");
                        int opcontraseña = op.nextInt();
                        if (opcontraseña == contraseña) {
                            MenuE menuEmpleados = new MenuE(catalogo);
                            menuEmpleados.MuestraMenu();
                            int opcionEmpleados = op.nextInt();
                            switch (opcionEmpleados) {
                                case 1:
                                    menuEmpleados.verCitas();
                                    break;
                                case 2:
                                    menuEmpleados.exit();
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            System.out.println("La contraseña es incorrecta, vuelve a intentarlo");
                        }
                        break;
    
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Algo salió mal, vuelve a intentarlo");
            }
        }
    }
    