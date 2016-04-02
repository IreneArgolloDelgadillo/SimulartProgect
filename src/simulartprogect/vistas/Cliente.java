package simulartprogect.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Cliente {
    
    private Image persona;
    private int X;       
    private int Y = 50;

    private int velocidad_X;

    private int limite_izquierda=0;
    private int limite_derecha;

     public Cliente(int x, int y) {
        X = x; Y = y;
        persona = new ImageIcon(getClass().getResource("cliente.PNG")).getImage();
    }

    //dado las dimensiones del contendor JPanel
   public void LimitesXY(int width, int height) {
        limite_derecha  = width  - persona.getWidth(null);
    }

   public void move() {
        X += velocidad_X;
        if (X < this.limite_izquierda) {
            X = 0;     
            velocidad_X = -velocidad_X; 
        } else if (X > limite_derecha) {
            X = limite_derecha; 
            velocidad_X =  0; 
        }
    }

    public void setVelocidadXY(){
        velocidad_X = getNumberRandom(4);
    }
    
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.drawImage(persona, X, Y, null);
    }

    private int getNumberRandom(int Max){
        return (int) (Math.random()*Max+1);
    }
}
