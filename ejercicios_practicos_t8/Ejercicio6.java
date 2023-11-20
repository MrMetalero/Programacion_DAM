package ejercicios_practicos_t8;

public class Ejercicio6 {


    public class Cadenas{
        String cad1;
        String cad2;
        String cad3;

    }


    public static void main(String[] args) {
        
        String cad1 = "Pepe";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);


        System.out.println(cad1 +" " +cad1.length());
        System.out.println(cad2 +" " +cad2.length());
        System.out.println(cad3 +" " +cad3.length());


        cad1 += cad2;
        System.out.println(cad1 + cad2);

        System.out.println(cad1.toString());
        

        System.out.println(cad2.compareTo(cad3));
        System.out.println(cad1.compareTo(cad3));
        System.out.println(cad2.compareTo(cad1));

        System.out.println(cad1);
        System.out.println(cad2.toLowerCase());
        System.out.println(cad3.toUpperCase());
        
        



    }

}
