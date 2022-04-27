/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class ESTUDIANTE {
    
public class ESTUDIANTE extends Universidad{
    private String CodESTUDIANTE;
    private String codESTUDIANTE;

    public ESTUDIANTE(String PERSONAPADRE, String ESTUDIANTE, String DOCENTE) {
        super(PERSONAPADRE, ESTUDIANTE, DOCENTE);
    
   System.out.println("se ejecute el constructor carrera");
  
        System.out.println("el codigo de la carrera es:"+codESTUDIANTE);
    }
    
    @Override
    public String getESTUDIANTE(){
        return CodESTUDIANTE; 
    }
    
    @Override
    public void setESTUDIANTE(String codInformatica){
        this.CodESTUDIANTE=codESTUDIANTE;
    }
}
}
