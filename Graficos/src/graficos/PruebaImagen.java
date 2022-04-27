package Graficos;
import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;



public class PruebaImagen {
    
    
    
    public static void main(String [] args){
        MarcoImagen mimarco=new MarcoImagen();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("MimaroImagen");
        setBounds(400,300,300,200);
        LaminaConImagen milamina=new LaminaConImagen();
        add(milamina);
        
    }
   
}
class LaminaConImagen extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
            File miimagen= new File("src/Graficos/i.PNG");
            File miimagen2= new File("src/Graficos/o.PNG");

        
                try{
                    imagen=ImageIO.read(miimagen);
                     imagen2=ImageIO.read(miimagen2);
                }
                catch(IOException e){
                    System.out.print("La imagen no aparece");
                }
                g.drawImage(imagen, 0, 0, null);
                g.drawImage(imagen2, 20, 20, null);

    }
    private Image imagen; 
    private Image imagen2;
}

  
