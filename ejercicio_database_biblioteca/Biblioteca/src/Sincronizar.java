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
        }
        ResultSet rsLibros;
        rsLibros = st.executeQuery("SELECT * FROM libros");

        while (rsLibros.next()) {
            Libro libroNuevoSync = new Libro(null, null, null, null, null, false, null, null);
            libroNuevoSync.titulo= rsEmpleados.getString("id");
            libroNuevoSync.autor= rsEmpleados.getString("nombre");
            libroNuevoSync.editorial= rsEmpleados.getString("titulo");
            libroNuevoSync.ubicacion= rsEmpleados.getString("autor");
            libroNuevoSync.isbn= rsEmpleados.getString("editorial");
            libroNuevoSync.prestado= rsEmpleados.getBoolean("prestado");

            try {
                libroNuevoSync.prestadoPor = getEmpleadoById(rsLibros.getInt("prestadopor"));
            } catch (Exception e) {
                System.out.println("Se ha fallado al obtener la ID del empleado");
            }
            
            try {
                libroNuevoSync.prestadoUsuario = getUsuarioById(rsUsuarios.getInt("prestadousuario"));
            } catch (Exception e) {
                System.out.println("Se ha fallado al obtener la ID del usuario");
            }
            
            App.biblioteca.add(libroNuevoSync);
        }



    


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