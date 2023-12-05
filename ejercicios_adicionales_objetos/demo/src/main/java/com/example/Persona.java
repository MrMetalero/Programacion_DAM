package com.example;

public class Persona {
    
    String nombre = "";
    int edad = 0;
    char sexo = '0';
    static final char sexoFinal = 'H';
    int peso = 0;
    float altura = 0;




    public Persona(){
        this.nombre = nombre;
        this.sexo = sexoFinal;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

        
    }

  


    public Persona(String nombre,int edad,char sexo){
        if(sexo == 'H' && sexo == 'M' && edad > 0 && nombre != "" ){

            this.nombre = nombre;
            this.edad = edad;
            this.peso = peso;
            this.altura = altura;

        }else{System.out.println("Datos incorrectos");}

        

    
    }

    public Persona(String nombre,int edad,char sexo,int peso,float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

    
    }


    


}
