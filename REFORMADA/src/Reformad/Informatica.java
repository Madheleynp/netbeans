
package Reformad;

/**
 *
 * @author Madhe
 */
public class Informatica extends Persona{

    private String CodInformatica;
    
    public Informatica(String nom, String ape, int ed, String CodInfor) {
        super(nom, ape, ed);
        System.out.println("Se ejecutae el constructor carrera");
        CodInformatica = CodInfor;
        System.out.println("El codigo de la carrera es:" +CodInfor);
    }

    public String getCodInformatica() {
        return CodInformatica;
    }

    public void setCodInformatica(String CodInformatica) {
        this.CodInformatica = CodInformatica;
    }  
}
