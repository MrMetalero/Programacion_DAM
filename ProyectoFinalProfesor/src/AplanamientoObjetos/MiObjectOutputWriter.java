package AplanamientoObjetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * MiObjectOutputWriter es un ObjectOutputWriter custom que hereda de ObjectOutputStream pero que elimina las cabeceras que este genera a la hora de introducir
 * más de un objeto en un fichero binario. De esta forma puedo escribir múltiples objetos
 * @nota Si el fichero binario NO EXISTE se usa la clase original. SI SÍ EXISTE SE USA ESTA 
 */
public class MiObjectOutputWriter extends ObjectOutputStream {

    @Override
    protected void writeStreamHeader()throws IOException{

    }
    
    public MiObjectOutputWriter() throws IOException{
        super();
    }

    public MiObjectOutputWriter(OutputStream outputStream) throws IOException{
        super(outputStream);
    }

}
