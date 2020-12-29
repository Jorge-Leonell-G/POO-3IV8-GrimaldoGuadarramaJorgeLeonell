/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplomouse;

/**
 *
 * @author rash2
 */

//recordemos que hay eventos de teclado, de mouse
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class Mouse implements MouseMotionListener {
    
    JLabel lbl;
    
    public Mouse(JLabel lbl){
        this.lbl = lbl;
    }
    
    public void mouseDragged(MouseEvent e){
        System.out.println(e.getX()+" ; "+e.getY()+" - "
        + lbl.getX() + " ; " + lbl.getY());
        //inicializo con setBounds
        lbl.setBounds(e.getX() - lbl.getY(),
                e.getY() - lbl.getY(),
                lbl.getWidth(), lbl.getHeight());
    }
    
    public void mouseMoved(MouseEvent e){
        
    }
    
}
