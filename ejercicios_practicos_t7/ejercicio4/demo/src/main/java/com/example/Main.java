package com.example;

import com.example.Congelados.CongeladosAgua;
import com.example.Congelados.CongeladosAire;
import com.example.Congelados.CongeladosNitrogeno;

public class Main {
    public static void main(String[] args) throws Exception {

        Refrigerado refri1 = new Refrigerado("17/02/2056", 12313, "23/05/1923", "España", "C23fadada", 1);

        System.out.println(refri1.toString());

        CongeladosAgua conge1 = new CongeladosAgua("17/05/2822", 12415, "29/06/2033", "Finlandia", -2, 23);

        System.out.println(conge1.toString());

        CongeladosAire congeA1 = new CongeladosAire("12/02/2034", 252514, "10/02/2033", "Afghanistan", 2, 10, 70, 10,
                10);
        System.out.println(congeA1.toString());

        CongeladosNitrogeno congeNitro1 = new CongeladosNitrogeno("12/06/2033", 2425252, "19/09/9233", "Venezuela", 1,
                "Método 1", 4500);
        System.out.println(congeNitro1.toString());

    }
}