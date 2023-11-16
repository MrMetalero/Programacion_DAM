package crearpdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
public class CrearPDF {
public void añadirTexto() throws Exception{
Document document = new Document();
String parrafo = "Usaremos este parrafo como ejemplo de lo sencillo que es el uso de la libreria, "
+ "pues como podria observar en el codigo esta cadena no lleva saltos de linea, "
+ "mismos que la libreria agrego.";
PdfWriter.getInstance(document, new FileOutputStream("recibo.pdf"));
document.open();
document.add(new Paragraph(parrafo));
document.close();
}
public static void main(String args[]){
try{
CrearPDF p = new CrearPDF();
p.añadirTexto();
}catch(Exception e){
System.out.println(e);
}
}
}






