import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personaje p1 = new Personaje("Guerrero");

        int opcion;
        do {
            System.out.println("       MENÚ       ");
            System.out.println("1. Crear personaje ");
            System.out.println("2. Mostrar estado");
            System.out.println("3. Ganar experiencia");
            System.out.println("4. Subir nivel");
            System.out.println("5. Recibir daño");
            System.out.println("6. Curarse");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(p1.crearUsuario());
                    break;
                case 2:
                    System.out.println(p1.mostrarEstado());
                    break;
                case 3:
                    System.out.println(p1.ganarExperiencia());
                    break;
                case 4:
                    System.out.println(p1.subirNivel());
                    break;
                case 5:
                    System.out.println(p1.recibirDaño());
                    break;
                case 6:
                    System.out.println(p1.curarse());
                    break;
                case 7:
                    System.out.println("Saliendo  ");
                    break;
                default:
                    System.out.println("Opción inválida");

            }
        } while (opcion != 7);
        System.out.println("Estado final:");
        System.out.println(p1.mostrarEstado());
        sc.close();
    }
}