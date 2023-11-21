package ejercicios_practicos_t8;

public class Ejercicio7 {

    public static boolean esCapicua(int dato) {
        Integer i = Integer.valueOf(dato);
        String opu = new StringBuffer(i.toString()).reverse().toString();
        return i.toString().equals(opu);
        // no funcionaba porque estaba comparando lógicamente el valor de string de i
        // y el valor de opu como objetos y no los valores contenidos dentro de ellos
        // al utilizar .equals si que se compara el contenido

    }

    public static void main(String[] args) {

        System.out.println(esCapicua(1551));

    }

}
