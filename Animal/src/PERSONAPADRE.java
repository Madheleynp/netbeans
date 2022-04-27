/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class PERSONAPADRE {
    public class PERSONAPADRE extends Universidad{
    private String CodPERSONAPADRE;
    private String codPERSONAPADRE;

    public PERSONAPADRE(String PERSONAPADRE, String ESTUDIANTE, String DOCENTE) {
        super(PERSONAPADRE, ESTUDIANTE, DOCENTE);
    
   System.out.println("se ejecute el constructor carrera");
  
        System.out.println("el codigo de la carrera es:"+codPERSONAPADRE);
    }
    @Override
    public String getPERSONAPADRE(){
        return CodPERSONAPADRE; 
    }
    @Override
    public void setPERSONAPADRE(String codInformatica){
        this.CodPERSONAPADRE=codPERSONAPADRE;
    }
}
}
