package lesson8;

import javax.swing.*;
import java.awt.*;

public class GameOverDraw extends JFrame {
    static final int WINDOW_OVER_X = 300;
    static final int WINDOW_OVER_Y = 100;
    static final int WINDOW_OVER_WIDTH = 305;
    static final int WINDOW_OVER_HEIGHT = 155;

    private BattleField battleField;
    private GameWindow gameWindow;

    public GameOverDraw() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WINDOW_OVER_X, WINDOW_OVER_Y, WINDOW_OVER_WIDTH, WINDOW_OVER_HEIGHT);
        setTitle("GAME OVER");
        add(new JLabel("    Ничья   "), BorderLayout.CENTER);
        setVisible(true);
    }

}
