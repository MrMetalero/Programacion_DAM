package com.example;

public class Persona {
    
    String nombre = "";
    int edad = 0;
    char sexo = '0';
    static final char sexoFinal = 'H';
    int peso = 0;
    float altura = 0;

    int contadorPersonas;


    public Persona(){
        this.nombre = nombre;
        this.sexo = sexoFinal;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

        contadorPersonas += 1;
    }

  


    public Persona(String nombre,int edad,char sexo){
        
        comprobarSexo(sexo);
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

        contadorPersonas += 1;

    

        

    
    }

    public Persona(String nombre,int edad,char sexo,int peso,float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

        contadorPersonas += 1;
    
    }

    public float calcularIMC(){
        float imcCalculado;
        float resultado = 0;

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
        String devueltoString = "Paciente: "+ nombre + "\n"
                                +"Edad: "+ edad + "años \n"
                                +"Sexo: "+ sexo + "\n"
                                +"Peso: " + peso + " Kg\n"
                                +"Altura: "+ altura + " m\n"
        ;


        return devueltoString;
    }
    

    public boolean esMayorDeEdad(){
        boolean mayorEdad = false;

        if (edad > 18){
            mayorEdad = true;

        }


        return mayorEdad;
    }

    //Package private comprobarSexo

    private void comprobarSexo(char sexo){

        if (sexo == 'H' || sexo == 'M'){
            

        }else{
            sexo = sexoFinal;
        }

    
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
