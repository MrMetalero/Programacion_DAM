package com.example;

public class Persona {
    
    String nombre = "";
    int edad = 0;
    char sexo = '0';
    static final char sexoFinal = 'H';
    int peso = 0;
    float altura = 0;
    
    private String resultadoIMC;
    private boolean mayorEdad;

    int contadorPersonas;


    public Persona(){
        this.sexo = sexoFinal;
       

        contadorPersonas += 1;
    }

  


    public Persona(String nombre,int edad,char sexo){
        
        
        this.sexo = comprobarSexo(sexo);
        this.nombre = nombre;
        this.edad = edad;

        contadorPersonas += 1;

    
    }

    public Persona(String nombre,int edad,char sexo,int peso,float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

        contadorPersonas += 1;
    
    }

    public int calcularIMC(){
        float imcCalculado;
        int resultado = 0;

        imcCalculado = peso/(altura*altura);

        if (imcCalculado < 20){
            resultado = -1;

        }else 
            if (imcCalculado >= 20 && imcCalculado <= 25){
                resultado = 0;
            }
            else 
                if(imcCalculado > 25){
                    resultado = 1;
                }
        

        return resultado;
    }  

    public String devuelveString(){
        resultadoIMC = "";
        
        if(this.calcularIMC() == -1){
            resultadoIMC = "Por debajo del peso ideal";
        }else if(this.calcularIMC() == 0){
            resultadoIMC = "En el peso ideal";

        }else if(this.calcularIMC() == 1){
            resultadoIMC = "Por encima del peso ideal";
        }


        String devueltoString = "Paciente: "+ nombre + "\n"
                                +"Edad: "+ edad + " años \n"
                                +"Sexo: "+ sexo + "\n"
                                +"Peso: " + peso + " Kg\n"
                                +"Altura: "+ altura + " m\n"
                                + resultadoIMC
        ;


        return devueltoString;
    }
    

    public boolean esMayorDeEdad(){
        mayorEdad = false;

        if (edad > 18){
            mayorEdad = true;

        }


        return mayorEdad;
    }

    

    static private char comprobarSexo(char sexo){

        if (sexo == 'H' || sexo == 'M'){
            

        }else{
            sexo = sexoFinal;
        }

        return sexo;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public int getEdad() {
        return edad;
    }




    public void setEdad(int edad) {
        this.edad = edad;
    }




    public char getSexo() {
        return sexo;
    }




    public void setSexo(char sexo) {
        this.sexo = sexo;
    }




    public static char getSexofinal() {
        return sexoFinal;
    }




    public int getPeso() {
        return peso;
    }




    public void setPeso(int peso) {
        this.peso = peso;
    }




    public float getAltura() {
        return altura;
    }




    public void setAltura(float altura) {
        this.altura = altura;
    }




    public int getContadorPersonas() {
        return contadorPersonas;
    }




    public void setContadorPersonas(int contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }







}
