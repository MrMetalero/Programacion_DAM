package com.example;

public class Encargado extends Empleado {
    

@Override
public int getSueldo() {
    // TODO Auto-generated method stub
    return super.getSueldo() * 10 /100 + super.getSueldo();
}



}
