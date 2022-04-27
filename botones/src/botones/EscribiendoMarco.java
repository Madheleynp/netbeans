/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EscribiendoMarco {
    public static void main(String[] args) {
        marcobotones mimarco=new marcobotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
    }
    
}
class marcobotones extends JFrame{
    public marcobotones(){
        setTitle("marco botones de colores");
        setBounds(700,300,500,300);
        
        laminabotones milamina=new laminabotones();
        add(milamina);
        
        
    }
}
class laminabotones extends JPanel implements ActionListener{
    JButton botonazul=new JButton("azul");
    JButton botonamarillo=new JButton("amarillo");
    JButton botonrojo=new JButton("rojo");
    JButton botonverde=new JButton("verde");
    JButton botonnaranja=new JButton("naranja");
    JButton botonrosa=new JButton("rosa");
    JButton botonnegro=new JButton("negro");
    JButton botongris=new JButton("gris");
    JButton botonMagenta=new JButton("magenta");
    
    public laminabotones(){
        add(botonazul);
        add(botonamarillo);
        add(botonrojo);
        add(botonverde);
        add(botonnaranja);
        add(botonrosa);
        add(botonnegro);
        add(botongris);
        add(botonMagenta);
        
        botonazul.addActionListener(this);
        botonamarillo.addActionListener(this);
        botonrojo.addActionListener(this);
        botonverde.addActionListener(this);
        botonnaranja.addActionListener(this);
        botonrosa.addActionListener(this);
        botonnegro.addActionListener(this);
        botongris.addActionListener(this);
        botonMagenta.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e){
        Object pulse_aqui=e.getSource();
        if(pulse_aqui==botonazul){
            setBackground(Color.blue);
            
        }
        else 
            if(pulse_aqui==botonamarillo){
                setBackground(Color.YELLOW);
            }
            else{
                setBackground(Color.RED);
            }
        if(pulse_aqui==botonverde){
            setBackground(Color.green);
        }
        else
             if(pulse_aqui==botonnaranja){
                 setBackground(Color.orange);

             }
             else{
                 if(pulse_aqui==botonrosa){
                setBackground(Color.pink);
            }
                 else{
                     if(pulse_aqui==botonnegro){
                setBackground(Color.black);
             
                 }
                     else{
                         if(pulse_aqui==botongris){
                 setBackground(Color.gray);
                         }
                         else{
                             if(pulse_aqui==botonMagenta){
                setBackground(Color.MAGENTA);
                         
                             }
                             
                   
           
                 
                 
                 
       
             }
    }
}        
}      
}

}