package com.example;
import java.util.function.BinaryOperator;

public class Conversor {
    
    Integer valorGuardado;



    public Conversor(Integer valorEntero){
        valorGuardado = valorEntero;


    }

    public String getNumero(char character){
        String valorConvertido;
        if(character == 'B'){
            valorConvertido = Integer.toBinaryString(valorGuardado);
            System.out.println(valorConvertido);
        }else if(character == 'H'){
            valorConvertido = Integer.toHexString(valorGuardado);
            System.out.println(valorConvertido);

        }else if(character == 'O'){
            valorConvertido = Integer.toOctalString(valorGuardado);
            System.out.println(valorConvertido);

        }else {valorConvertido = "El caracter introducido no es válido";}

     
        return valorConvertido;
    }


}
