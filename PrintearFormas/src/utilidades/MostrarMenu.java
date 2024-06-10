package utilidades;
/**
 * MostrarMenu
 */
public class MostrarMenu implements Runnable {


    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("OPCIONES MENÚ HEHEHEHE ");



        }




    }

    
}