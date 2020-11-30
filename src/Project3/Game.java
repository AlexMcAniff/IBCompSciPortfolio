package Project3;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game extends JPanel {
    private JButton[] buttons = new JButton[9];
    int winCounter = 0;
    private Turn turn = Turn.X;



    public Game() {
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.addActionListener(new ButtonListener());
            button.setText("");
            this.add(button);
            buttons[i] = button;
        }

    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JButton buttonClicked = (JButton) e.getSource();
            if (buttonClicked.getText().equals("")) {

                switch (turn) {
                    case O -> buttonClicked.setText("o");
                    case X -> buttonClicked.setText("x");
                }

                turn = turn.takeTurn();

            }

            winStatement(buttons[0].getText(),buttons[1].getText(),buttons[2].getText());
            winStatement(buttons[3].getText(),buttons[4].getText(),buttons[5].getText());
            winStatement(buttons[6].getText(),buttons[7].getText(),buttons[8].getText());
            winStatement(buttons[0].getText(),buttons[3].getText(),buttons[6].getText());
            winStatement(buttons[1].getText(),buttons[4].getText(),buttons[7].getText());
            winStatement(buttons[2].getText(),buttons[5].getText(),buttons[8].getText());
            winStatement(buttons[0].getText(),buttons[4].getText(),buttons[8].getText());
            winStatement(buttons[2].getText(),buttons[4].getText(),buttons[6].getText());


        }
    }

    private void winStatement(String pointA,String pointB,String pointC) {
        if (pointA.equals(pointB) && pointB.equals(pointC) && !pointA.equals("")) {
            System.out.println(pointA + " wins!");
        }


    }
    private enum Turn {
        X,
        O;

        private Turn takeTurn() {
            switch (this) {
                case X -> {return O;}
                case O -> {return X;}
            }

            return null;
        }
    }
}
