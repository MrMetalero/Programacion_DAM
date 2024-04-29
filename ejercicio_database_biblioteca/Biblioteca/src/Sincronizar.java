import java.sql.*;

public class Sincronizar {

    



    public static void sync(Statement st) throws SQLException{

        ResultSet rsUsuarios;
        rsUsuarios = st.executeQuery("SELECT * FROM usuarios");
 
        while (rsUsuarios.next()) {
            Usuario usuarioNuevoSync = new Usuario(null, null, null, null);
            usuarioNuevoSync.id= rsUsuarios.getString("id");
            usuarioNuevoSync.nombre= rsUsuarios.getString("nombre");
            usuarioNuevoSync.apellido1= rsUsuarios.getString("apellido1");
            usuarioNuevoSync.apellido2= rsUsuarios.getString("apellido2");
            usuarioNuevoSync.edad= rsUsuarios.getString("edad");
            App.usuarios.add(usuarioNuevoSync);
            //System.out.println("Sincronizando usuarios...");
        }
        
        
        ResultSet rsEmpleados;
        rsEmpleados = st.executeQuery("SELECT * FROM empleados");

         
        while (rsEmpleados.next()) {
            Empleado empleadoNuevoSync = new Empleado(null, null, null, null);
            empleadoNuevoSync.id= rsEmpleados.getString("id");
            empleadoNuevoSync.nombre= rsEmpleados.getString("nombre");
            empleadoNuevoSync.apellido1= rsEmpleados.getString("apellido1");
            empleadoNuevoSync.apellido2= rsEmpleados.getString("apellido2");
            empleadoNuevoSync.edad= rsEmpleados.getString("edad");
            App.empleados.add(empleadoNuevoSync);
            //System.out.println("Sincronizando empleados...");
        }
        ResultSet rsLibros;
        rsLibros = st.executeQuery("SELECT * FROM libros");

        while (rsLibros.next()) {
            Libro libroNuevoSync = new Libro(null, null, null, null, null, false, null, null);
            libroNuevoSync.id = rsLibros.getString("id");
            libroNuevoSync.titulo= rsLibros.getString("titulo");
            libroNuevoSync.editorial= rsLibros.getString("editorial");
            libroNuevoSync.autor= rsLibros.getString("autor");
            libroNuevoSync.isbn= rsLibros.getString("isbn");
            libroNuevoSync.ubicacion= rsLibros.getString("ubicacion");
            libroNuevoSync.prestado= rsLibros.getBoolean("prestado");

            try {
                libroNuevoSync.prestadoPor = getEmpleadoById(rsLibros.getInt("prestadopor"));
            } catch (Exception e) {
                System.out.println("Se ha fallado al obtener la ID del empleado" + e.getMessage());
            }
            
            try {
                libroNuevoSync.prestadoUsuario = getUsuarioById(rsLibros.getInt("prestadousuario"));
            } catch (Exception e) {
                System.out.println("Se ha fallado al obtener la ID del usuario o no tiene un ID asignado " + e.getMessage());
            }
            
            App.biblioteca.add(libroNuevoSync);
            //System.out.println("Sincronizando libros...");
        }



        System.out.println("Sincronización completada!!!");


    }

    public static Empleado getEmpleadoById(int i) {
        for (Empleado empleado : App.empleados) {
            if (empleado.id.equals(String.valueOf(i))) {
                return empleado;
            }
        }
        return null; // If no matching Empleado object is found
    }
    

    public static Usuario getUsuarioById(int i) {
        for (Usuario usuario : App.usuarios) {
            if (usuario.id.equals(String.valueOf(i))) {
                return usuario;
            }
        }
        return null; // If no matching Empleado object is found
    }



}