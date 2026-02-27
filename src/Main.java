import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Personaje> listaPersonajes = new ArrayList<>();

        int opcion = 0;

        do {
            System.out.println("       MENÚ       ");
            System.out.println("1. Crear personaje ");
            System.out.println("2. Mostrar personajes");
            System.out.println("3. Ganar experiencia");
            System.out.println("4. Subir nivel");
            System.out.println("5. Recibir daño");
            System.out.println("6. Curarse");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Debes ingresar un número.");
                sc.nextLine();
                continue;
            }

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese nombre del personaje: ");
                    String nombre = sc.nextLine().trim();

                    if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío.");
                        break;
                    }

                    Personaje nuevo = new Personaje(nombre);
                    listaPersonajes.add(nuevo);
                    System.out.println(nuevo.crearUsuario());
                    break;

                case 2:
                    if (listaPersonajes.isEmpty()) {
                        System.out.println("No hay personajes creados.");
                    } else {
                        for (Personaje p : listaPersonajes) {
                            System.out.println(p.mostrarEstado());
                        }
                    }
                    break;

                case 3:
                    ejecutarAccion(listaPersonajes, sc, 1);
                    break;

                case 4:
                    ejecutarAccion(listaPersonajes, sc, 2);
                    break;

                case 5:
                    ejecutarAccion(listaPersonajes, sc, 3);
                    break;

                case 6:
                    ejecutarAccion(listaPersonajes, sc, 4);
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();
    }

    public static void ejecutarAccion(ArrayList<Personaje> lista, Scanner sc, int tipo) {

        if (lista.isEmpty()) {
            System.out.println("No hay personajes creados.");
            return;
        }

        System.out.println("Seleccione personaje:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i).getNombre());
        }

        if (!sc.hasNextInt()) {
            System.out.println("Debes ingresar un número válido.");
            sc.nextLine();
            return;
        }

        int indice = sc.nextInt();
        sc.nextLine();

        if (indice < 0 || indice >= lista.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Personaje p = lista.get(indice);

        switch (tipo) {
            case 1:
                System.out.println(p.ganarExperiencia());
                break;
            case 2:
                System.out.println(p.subirNivel());
                break;
            case 3:
                System.out.println(p.recibirDaño());
                break;
            case 4:
                System.out.println(p.curarse());
                break;
        }
    }
}