/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class DOCENTE {
    
public class DOCENTE extends Universidad {
    private String CodDOCENTE;
    private String codDOCENTE;

    public DOCENTE(String PERSONAPADRE, String ESTUDIANTE, String DOCENTE) {
        super(PERSONAPADRE, ESTUDIANTE, DOCENTE);
    
   System.out.println("se ejecute el constructor carrera");
  
        System.out.println("el codigo de la carrera es:"+codDOCENTE);
    }
    
    @Override
    public String getESTUDIANTE(){
        return CodDOCENTE; 
    }
    
    @Override
    public void setDOCENTE(String codInformatica){
        this.CodDOCENTE=codDOCENTE;
    }
}
}
