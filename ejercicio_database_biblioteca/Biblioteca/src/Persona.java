public  class Persona {

    String id;
    String nombre;
    String apellido1;
    String apellido2 = null;
    String edad;
    
    Persona(){
        




    }

    @Override
    public boolean equals(Object persona) {
        if (this == persona) {
            return true;
        }
        if (persona == null || getClass() != persona.getClass()) {
            return false;
        }
        Persona personaCompare = new Persona();
        personaCompare = (Persona) persona;
        // Compare the attributes of the Empleado objects
        // Return true if all attributes are equal, otherwise return false
        if (
            this.apellido1 == personaCompare.apellido1 &&
            this.apellido2 == personaCompare.apellido2 &&
            this.edad == personaCompare.edad &&
            this.id == personaCompare.id &&
            this.nombre == personaCompare.nombre


        ) {
            return true;
        }else{
            return false;
        } 
            


    }



}


