package ui;

import data.Conversion;
import game.Game;

import javax.swing.*;
import java.awt.*;

public class DrawGame extends JLabel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Game.currentBlock.getColor());
        for (int i = 0; i <Game.currentBlock.getBounds()[Game.currentBlock.getRotation()].length; i++) {
            for (int j = 0; j <Game.currentBlock.getBounds()[Game.currentBlock.getRotation()].length; j++) {
                if(Game.currentBlock.getBounds()[Game.currentBlock.getRotation()] [i][j] == 1) {

                    g.fillRect(Conversion.cellToCoord(Game.currentBlock.getX() + i),
                            Conversion.cellToCoord(Game.currentBlock.getY() + j), 32, 32);

                }
            }
        }

        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 18; j++) {
                g.drawRect(i * 32, j * 32, 32 ,32);
            }
        }

        g.setColor(Color.BLACK);
        g.drawRect(0, 0, Gui.width, Gui.height);

        repaint();
    }

}
