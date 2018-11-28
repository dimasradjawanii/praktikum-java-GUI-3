import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MouseEventDemo extends Frame implements
        MouseListener, MouseMotionListener {
    
    TextField tf;
    public MouseEventDemo (String title) {
        super(title);
        tf = new TextField(60);
        addMouseListener(this);
    }
    
    public void LaunchFrame(){
        add(tf, BorderLayout.SOUTH);
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[] arg) {
        MouseEventDemo me = new MouseEventDemo("Close Window Example");
        me.LaunchFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String msg = "Mouse Clicked"; //To change body of generated methods, choose Tools | Templates.
        tf.setText(msg);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String msg = "Mouse Pressed"; //To change body of generated methods, choose Tools | Templates.
        tf.setText(msg);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String msg = "Mouse Released"; //To change body of generated methods, choose Tools | Templates.
        tf.setText(msg);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String msg = "Mouse Entered"; //To change body of generated methods, choose Tools | Templates.
        tf.setText(msg);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String msg = "Mouse Exited"; //To change body of generated methods, choose Tools | Templates.
        tf.setText(msg);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String msg = "Mouse Dragged at" + e.getX() + "," + e.getY(); //To change body of generated methods, choose Tools | Templates.
        tf.setText(msg);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String msg = "Mouse Moved"; //To change body of generated methods, choose Tools | Templates.
        tf.setText(msg);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIMAS


