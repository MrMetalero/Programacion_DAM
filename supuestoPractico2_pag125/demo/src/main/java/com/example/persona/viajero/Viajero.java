package com.example.persona.viajero;

import java.util.Scanner;

public class Viajero {
    
    Scanner sc = new Scanner(System.in);

    public static int contador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String nacionalidad;
    
    
    // constructor con los parámetros de los viajeros y sus variables
    public Viajero(String dni, String nombre, String apellidos, String nacionalidad, String direccion) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;


        contador += 1;
        

    }

    //Valores por defecto
    public Viajero() {

        this.dni = "null";
        this.nombre = "null";
        this.apellidos = "null";
        this.nacionalidad = "null";
        this.direccion = "null";
        contador += 1;

    }

    public void getInfo(String formato) {

        if (formato.equals("pausado")) {

            System.out.println(dni);
            //Para esperar un paso hasta que introduzca intro
            sc.nextLine();

            System.out.println(nombre);
            //Para esperar un paso hasta que introduzca intro
            sc.nextLine();

            System.out.println(apellidos);
            //Para esperar un paso hasta que introduzca intro
            sc.nextLine();

            System.out.println(nacionalidad);
            //Para esperar un paso hasta que introduzca intro
            sc.nextLine();

            System.out.println(direccion);


        } else if (formato.equals("normal")) {
        
            System.out.println( dni + " " + nombre + " " + apellidos + " " + nacionalidad + " " + direccion );

        }

        

    }

    public void setDni(String dni) {

        this.dni = dni;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }

    public void setNacionalidad(String nacionalidad) {

        this.nacionalidad = nacionalidad;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    

}
