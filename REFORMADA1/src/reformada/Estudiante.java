/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reformada;

/**
 *
 * @author Unireformada
 */
public class Estudiante {
    public class estudiante  {
    
        private int id;
        private String nombre;
        private String apellido;
        
        public estudiante () {
            
        }
        public estudiante (int id, String nombre, String apellido){
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            
            System.out.println("Id del estudfiante: "+id);
            System.out.println("Nombre del estudiante: "+nombre);
            System.out.println("Apellido del estudiante: "+apellido);
            
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        
    }
}
