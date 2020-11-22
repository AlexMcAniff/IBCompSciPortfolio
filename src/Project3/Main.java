package Project3;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame("TicTacToe");
        window.setBounds(400,400,400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new Game());
        window.setVisible(true);
    }
}
