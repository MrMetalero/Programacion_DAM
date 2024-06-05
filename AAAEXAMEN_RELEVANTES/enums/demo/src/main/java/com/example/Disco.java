package com.example;

public class Disco extends Multimedia{
private Genero genero;
    

public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero){
    super(titulo,autor,formato,duracion);
    this.genero = genero;


}


public Genero getGenero() {
    return genero;
}


public void setGenero(Genero genero) {
    this.genero = genero;
}

public String toString(){
    return super.toString() + "\nGenero: " + genero;


}

}
