package com.example;

public class Persona {
    
    private String nombre = "";
    private int edad = 0;
    private char sexo = '0';
    static final char sexoFinal = 'H';
    private int peso = 0;
    private float altura = 0;
    private String docDNI = generarDNI();

    private String resultadoIMC;
    private boolean mayorEdad;

    static int contadorPersonas;


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
        this.sexo = sexo;

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
        String resultadoMayorEdad = "";
        
        if(this.calcularIMC() == -1){
            resultadoIMC = "Por debajo del peso ideal";
        }else if(this.calcularIMC() == 0){
            resultadoIMC = "En el peso ideal";

        }else if(this.calcularIMC() == 1){
            resultadoIMC = "Por encima del peso ideal";
        }

        if(this.esMayorDeEdad() == true ){
            resultadoMayorEdad = "Es mayor de edad";
        }else{
            resultadoMayorEdad = "No es mayor de edad";

        }





        String devueltoString = "Paciente: "+ nombre + "\n"
                                +"Edad: "+ edad + " años \n"
                                +"Sexo: "+ sexo + "\n"
                                +"Peso: " + peso + " Kg\n"
                                +"Altura: "+ altura + " m\n"
                                +resultadoIMC +"\n"
                                +resultadoMayorEdad +"\n"
                                +"Número de personas creadas " + contadorPersonas +"\n"
                                +"DNI: " + docDNI + "\n";
    


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


   
    


    private String generarDNI(){
        //entre 0 y 1
        docDNI = "";
        //si es 1
        for (int i = 0; i < 7; i++) {

            
            docDNI += (int) ((Math.random()*9-1)+1);
                
        
        
        }

        int moduloDNI = Integer.parseInt(docDNI) %23;


        //Según el módulo da una letra u otra al DNI

        switch (moduloDNI) {



            case 0:
                docDNI += "T";
                break;

            case 1:
                docDNI += "R";
                break;

            case 2:
                docDNI += "W";
                break;

            case 3:
                docDNI += "A";
                break;

            case 4:
                docDNI += "G";
                break;

            case 5:
                docDNI += "M";
                break;

            case 6:
                docDNI += "Y";
                break;

            case 7:
                docDNI += "F";
                break;

            case 8:
                docDNI += "P";
                break;

            case 9:
                docDNI += "D";
                break;
                

            case 10:
                docDNI += "X";
                break;

        
            case 11:
                docDNI += "B";
                break;

            case 12:
                docDNI += "N";
                break;

            case 13:
                docDNI += "J";
                break;

            case 14:
                docDNI += "Z";
                break;

            case 15:
                docDNI += "S";
                break;

            case 16:
                docDNI += "Q";
                break;

            case 17:
                docDNI += "V";
                break;

            case 18:
                docDNI += "H";
                break;

            case 19:
                docDNI += "L";
                break;

            case 20:
                docDNI += "C";
                break;

            case 21:
                docDNI += "K";
                break;



        
            default:
                docDNI = "ERROR";
                break;
        
        
            }


        

        return docDNI;
    }











    //Getters y Setters



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










}
