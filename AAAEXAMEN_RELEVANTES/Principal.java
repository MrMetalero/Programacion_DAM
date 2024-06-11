
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Figura> lista = new ArrayList<>();

    public static void main(String[] args) {

        Figura.Rellenos();

        int op = 0;

        do {
            System.out.println("\nFIGURAS GEOMÉTRICAS");
            System.out.println("*******************");
            System.out.println("1. Agregar figura");
            System.out.println("2. Número de figuras creadas");
            System.out.println("3. Mostrar las figuras");
            System.out.println("4. Mostrar figura por posición");
            System.out.println("5. Modificar figura por posición");
            System.out.println("6. Eliminar figura por posición");
            System.out.println("7. Eliminar todas las figuras");
            System.out.println("8. Salir");
            System.out.print("Introduzca la opción a realizar: ");
            try {
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        agregarFigura();
                        break;
                    case 2:
                        numeroFiguras();
                        break;
                    case 3:
                        mostrarFiguras();
                        break;
                    case 4:
                        mostrarFiguraPos();
                        break;

                    case 5:
                        modificarFiguraPos();
                        break;

                    case 6:
                        eliminarFiguraPos();
                        break;

                    case 7:
                        vaciarLista();
                        break;

                    case 8:
                        break;

                    default:
                        System.out.println("¡Opción incorrecta!");
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Introduzca un número entero");
                sc.nextLine();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } while (op != 8);

    }

    //Opción 1: Agregar figura
    public static void agregarFigura() {
        int op, b, h, B;

        System.out.print("\nIntroduzca la base: ");
        b = sc.nextInt();
        if (b <= 0) {
            throw new IllegalArgumentException("ERROR: La base debe ser mayor que 0");
        }
        System.out.print("Introduzca la altura: ");
        h = sc.nextInt();
        if (h <= 0) {
            throw new IllegalArgumentException("ERROR: La altura debe ser mayor que 0");
        }

        System.out.println("\nElija la figura que quiere introducir:");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Trapecio");
        System.out.println("4. Hexágono");
        System.out.print("Opción: ");

        op = sc.nextInt();

        switch (op) {
            case 1:
                Triangulo tri = new Triangulo(b, h);
                lista.add(tri);
                break;

            case 2:
                Rectangulo rec = new Rectangulo(b, h);
                lista.add(rec);
                break;

            case 3:
                B = introducirBase(b);
                Trapecio t = new Trapecio(b, h, B);
                lista.add(t);
                break;

            case 4:
                Hexagono hex = new Hexagono(b, h);
                lista.add(hex);
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    //Opción 2: Consultar número de figuras creadas
    public static void numeroFiguras() {
        System.out.println("\nNúmero de figuras almacenadas: " + lista.size());
    }

    //Opción 3: Mostrar todas las figuras
    public static void mostrarFiguras() {
        if (lista.size() == 0) {
            System.out.println("\nNo hay figuras almacenadas");
        } else {
            for (Figura f : lista) {
                System.out.println(tipoFigura(f));
                System.out.println(f.toString());
                System.out.println("Posición: " + lista.indexOf(f));
            }
        }

    }

    //Opción 4: Mostrar una figura dada una posición
    public static void mostrarFiguraPos() {
        if (lista.size() == 0) {
            System.out.println("\nNo hay figuras almacenadas");
        } else {
            int pos = introducirPos();
            Figura f = lista.get(pos);
            System.out.println(tipoFigura(f));
            System.out.println(f.toString());
            f.Dibujo();
        }
    }

    //Opción 5: Modificar la figura de una posición dada
    public static void modificarFiguraPos() {
        if (lista.size() == 0) {
            System.out.println("\nNo hay figuras almacenadas");
        } else {
            int pos = introducirPos();
            Figura f = lista.get(pos);

            System.out.print("\nIntroduzca la nueva base: ");
            int b = sc.nextInt();
            if (b <= 0) {
                throw new IllegalArgumentException("ERROR: La base debe ser mayor que 0");
            }
            f.setBase(b);
            System.out.print("Introduzca la nueva altura: ");
            int h = sc.nextInt();
            if (h <= 0) {
                throw new IllegalArgumentException("ERROR: La altura debe ser mayor que 0");
            }
            f.setAltura(h);

            if (f instanceof Trapecio) {
                Trapecio tra = (Trapecio) f;
                int B = introducirBase(b);
                tra.setBBase(B);
            }

            System.out.println(tipoFigura(f));
            System.out.println(f.toString());
        }
    }

    //Opción 6: Eliminar la figura de una posición dada
    public static void eliminarFiguraPos() {
        if (lista.size() == 0) {
            System.out.println("\nNo hay figuras almacenadas");
        } else {
            int pos = introducirPos();
            Figura f = lista.remove(pos);
            System.out.println(tipoFigura(f) + " eliminado de la lista");
        }
    }

    //Opción 7: Vaciar la colección que almacena las figuras
    public static void vaciarLista() {
        if (lista.size() == 0) {
            System.out.println("\nNo hay figuras almacenadas");
        } else {
            System.out.println("\nLa operación seleccionada eliminará todas las figuras almacenadas.");
            System.out.println("¿Está seguro de ello? (s/n)");
            char resp = sc.next().charAt(0);
            if (resp == 's' || resp == 'S') {
                lista.clear();
                System.out.println("\nFiguras eliminadas");
            } else if (resp != 'n' && resp != 'N') {
                System.out.println("Opción incorecta. Las figuras no se eliminarán");
            }
        }
    }

    //Solicita la Base del Trapecio y obliga a que sea mayor que su base
    public static int introducirBase(int b) {
        int B;
        do {
            System.out.print("\nIntroduzca la Base: ");
            B = sc.nextInt();
            sc.nextLine();
            if (B <= b) {
                System.out.println("Base debe ser mayor que base");
            }
        } while (B <= b);
        return B;
    }

    //Devuelve un String con el tipo de figura
    public static String tipoFigura(Figura f) {
        if (f instanceof Triangulo) {
            return "\nTRIÁNGULO";
        }
        if (f instanceof Rectangulo) {
            return "\nRECTÁNGULO";
        }
        if (f instanceof Trapecio) {
            return "\nTRAPECIO";
        }
        if (f instanceof Hexagono) {
            return "\nHEXÁGONO";
        }
        return "\nDESCONOCIDO";
    }

    //Solicita la posición de una figura obligando a que esté dentro del rango de la colección
    public static int introducirPos() {
        int pos;
        do {
            System.out.print("\nIntroduzca la posición: ");
            pos = sc.nextInt();
            sc.nextLine();
            if (pos < 0 || pos >= lista.size()) {
                System.out.println("Posición fuera de rango");
            }
        } while (pos < 0 || pos >= lista.size());
        return pos;
    }
}
