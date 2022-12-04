package ctisgolproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class GOLDrawer extends JFrame{
    public GOLDrawer() {
        super("Square");
        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void drawSquare(Graphics g, int x, int y, int size){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(x, y, size,size);
        
    }
    
    public void drawGrid(Graphics g, int x, int y, int gridSize, int n){
        Graphics2D g2d = (Graphics2D) g;
        drawSquare(g,50,50,100);
        /*find square size with gridSize/n
        loop drawSquare() n^2 times with i and j loops
        drawSquare(i*squareSize,j*squareSize) or something else depending on how it draws
        
        for the last step you can implement a fill parameter in drawSquare
        where it does drawRect if false and fillRect if true
        */
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawSquare(g,50,50,50);
        drawGrid(g,0,0,0,0);
    }
}
