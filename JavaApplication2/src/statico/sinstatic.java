/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statico;


public class sinstatic {
    private int atributo1=0;
    private int atributo2=0;

    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    

    public sinstatic() {
    }
     public sinstatic( int num1, int num2) {
         atributo1=num1;
         atributo2=num2;
     }

    @Override
    public String toString() {
        return "/atributo1=" + atributo1 + "/ atributo2=" + atributo2;
    }
     
    
}
