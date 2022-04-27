package reformada;


class padre {
    private int id;
        private String nombre;
        private String apellido;
        
        public padre () {
            
        }
        public padre (int id, String nombre, String apellido){
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            
            System.out.println("id del padre: "+id);
            System.out.println("Nombre del padre: "+nombre);
            System.out.println("Apellido del padre: "+apellido);
            
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