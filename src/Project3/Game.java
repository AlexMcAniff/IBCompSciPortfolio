package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Game extends JPanel {
    private JButton[] buttons = new JButton[9];
    private boolean x = true;
    int[] horizontalWin = new int[2];

    public Game() {
        this.setLayout(new GridLayout(3, 3));
        for (JButton b : buttons) {
            b = new JButton();
            b.addActionListener(new ButtonListener());
            b.setText("");
            this.add(b);
        }

    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            JButton buttonClicked = (JButton) e.getSource();
            if (buttonClicked.getText()== "") {
                if (x) {
                    buttonClicked.setText("x");


                } else {
                    buttonClicked.setText("O");

                }
                x = !x;

            }

            winStatement(buttons[0].getText(),buttons[1].getText(),buttons[2].getText());
        }
    }

    public void winStatement(String pointA,String pointB,String pointC) {
        if(pointA == pointB && pointB == pointC){
            System.out.println(pointA+" wins!");
        }

//        int hWin = 0;
//        int line = 0;
//        for (int i = 0; i < 3; i++) {
//            if (i == 1) {
//                hWin = 1;
//                line = 3;
//            } else if (i == 2) {
//                hWin = 2;
//                line = 6;
//            }
//            for (int j = 0; j < 3; j++) {
//                int lineI = i + line;
//                if (buttons[lineI].getText().equals("")) {
//                    break;
//                } else if (buttons[lineI].getText().equals("x")) {
//                    horizontalWin[hWin] += 1;
//                } else {
//                    horizontalWin[1] += 0;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(horizontalWin));
    }
}



