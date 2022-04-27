Package 
public class Universidad {

   private String PERSONAPADRE;
    private String ESTUDIANTE;
        private String DOCENTE;
        
       
        public Universidad (String PERSONAPADRE,String ESTUDIANTE,String DOCENTE){
            this.PERSONAPADRE=PERSONAPADRE;
            this.ESTUDIANTE=ESTUDIANTE;
            this.DOCENTE=DOCENTE;
            
            System.out.println("se ejecuta el constructor UNIVERSIDAD");
            System.out.println("LA PERSONAPADRE es:"+PERSONAPADRE);
            System.out.println("la ESTUIDANTE es "+ESTUDIANTE);
            System.out.println("el DOCENTE es:"+DOCENTE);
            
        }

    public String getPERSONAPADRE() {
        return PERSONAPADRE;
    }

    public void setPERSONAPADRE(String PERSONAPADRE) {
        this.PERSONAPADRE = PERSONAPADRE;
    }

    public String getESTUDIANTE() {
        return ESTUDIANTE;
    }

    public void setESTUDIANTE(String ESTUDIANTE) {
        this.ESTUDIANTE = ESTUDIANTE;
    }

    public String getDOCENTE() {
        return DOCENTE;
    }

    public void setDOCENTE(String DOCENTE) {
        this.DOCENTE = DOCENTE;
    }
    }
