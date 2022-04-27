/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class PruebaEventos {
    package botones;

import java.awt.;
import javax.swing.;
import java.awt.event.;

public class pruebaeventos {
    public static void main(String[] args) {
        marcobotones mimarco=new marcobotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
    }
    
}
class marcobotones extends JFrame{
    public marcobotones(){
        setTitle(marco botones de colores);
        setBounds(700,300,500,300);
        
        laminabotones milamina=new laminabotones();
        add(milamina);
        
        
    }
}
class laminabotones extends JPanel implements ActionListener{
    JButton botonazul=new JButton(azul);
    JButton botonamarillo=new JButton(amarillo);
    JButton botonrojo=new JButton(rojo);
    JButton botonverde=new JButton(verde);
    JButton botonnaranja=new JButton(naranja);
    JButton botonrosado=new JButton(Rosado);
    JButton botonGrisclaro=new JButton(Gris claro);
    JButton botonGrisoscuro=new JButton(Gris oscuro);
    JButton botonMagenta=new JButton(Magenta);

    
    public laminabotones(){
        add(botonazul);
        add(botonamarillo);
        add(botonrojo);
        add(botonverde);
        add(botonnaranja);
        add(botonrosado);
        add(botonGrisclaro);
       add(botonGrisoscuro);
       add(botonMagenta);
        
        botonazul.addActionListener(this);
        botonamarillo.addActionListener(this);
        botonrojo.addActionListener(this);
        botonverde.addActionListener(this);
        botonnaranja.addActionListener(this);
        botonrosado.addActionListener(this);
        botonGrisclaro.addActionListener(this);
        botonGrisoscuro.addActionListener(this);
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
             
                if (pulse_aqui==botonverde){
                        setBackground(Color.GREEN);
                }
                    else 
                        if(pulse_aqui==botonnaranja){
                            setBackground(Color.ORANGE);    
                        }
                if (pulse_aqui==botonrosado){
                        setBackground(Color.PINK);
                }
                    else 
                        if(pulse_aqui==botonGrisclaro){
                            setBackground(Color.LIGHT_GRAY);
                        }
                 if (pulse_aqui==botonGrisoscuro){
                        setBackground(Color.darkGray);
                 }
                 else 
                        if(pulse_aqui==botonMagenta){
                            setBackground(Color.MAGENTA);
                            
    }
}
}
}
