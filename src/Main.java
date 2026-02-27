import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Personaje> listaPersonajes = new ArrayList<>();
        int opcion;
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
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese nombre del personaje: ");
                    String nombre = sc.nextLine();
                    Personaje nuevo = new Personaje(nombre);
                    listaPersonajes.add(nuevo);
                    System.out.println(nuevo.crearUsuario());
                    break;
                case 2:
                    for (Personaje p : listaPersonajes) {
                        System.out.println(p.mostrarEstado());
                    }
                    break;
                case 3:
                    Personaje pExp = seleccionarPersonaje(listaPersonajes, sc);
                    if (pExp != null) {
                        System.out.println(pExp.ganarExperiencia());
                    }
                    break;
                case 4:
                    Personaje pNivel = seleccionarPersonaje(listaPersonajes, sc);
                    if (pNivel != null) {
                        System.out.println(pNivel.subirNivel());
                    }
                    break;
                case 5:
                    Personaje pDaño = seleccionarPersonaje(listaPersonajes, sc);
                    if (pDaño != null) {
                        System.out.println(pDaño.recibirDano());
                    }
                    break;
                case 6:
                    Personaje pCura = seleccionarPersonaje(listaPersonajes, sc);
                    if (pCura != null) {
                        System.out.println(pCura.curarse());
                    }
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 7);
        sc.close();
    }

    public static Personaje seleccionarPersonaje(ArrayList<Personaje> lista, Scanner sc) {
        if (lista.isEmpty()) {
            System.out.println("No hay personajes creados.");
            return null;
        }
        System.out.println("Seleccione personaje:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i).getNombre());
        }
        int indice = sc.nextInt();
        if (indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        }
        System.out.println("Índice inválido.");
        return null;
    }
}