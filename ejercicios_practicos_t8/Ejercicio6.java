package ejercicios_practicos_t8;

import java.util.Arrays;

public class Ejercicio6 {

    public class Cadenas {
        String cad1;
        String cad2;
        String cad3;

    }

    public static void main(String[] args) {

        String cad1 = "Pepe";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);

        System.out.println(cad1 + " " + cad1.length());
        System.out.println(cad2 + " " + cad2.length());
        System.out.println(cad3 + " " + cad3.length());

        cad1 += cad2;
        System.out.println(cad1);

        System.out.println(cad1.toString());

        System.out.println(cad2.compareTo(cad3));
        System.out.println(cad1.compareTo(cad3));
        System.out.println(cad2.compareTo(cad1));

        System.out.println(cad1);
        System.out.println(cad2.toLowerCase());
        System.out.println(cad3.toUpperCase());

        String nombre = " Daniel ";
        System.out.println(nombre.substring(0, nombre.length() - 1).trim());

        System.out.println(cad1.substring(0, 3).replace("e", "a"));
        // Papa Lionel
        cad1 = cad1.substring(0, 4).replace("e", "a") + cad1.substring(4, 10);

        System.out.println(cad1.startsWith("a"));
        System.out.println(cad2.startsWith("l"));
        System.out.println(cad3.startsWith("L"));

        System.out.println(cad1.charAt(4));

        System.out.println(cad1.indexOf(101));
        System.out.println(cad1.indexOf("a"));
        System.out.println(cad1.lastIndexOf("a"));

        char[] patata = new char[cad1.length()];
        for (int i = 0; i < patata.length; i++) {
            patata[i] = cad1.charAt(i);

        }

        System.out.println(Arrays.toString(patata));

    }

}
