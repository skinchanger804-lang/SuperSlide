package Main;

import inputs.keyBoardInputs;
import inputs.mouseInputs;

import javax.swing.*;
import java.awt.*;

//esto es como el lienzo del juego
public class PanelJuego extends JPanel {

    private mouseInputs MouseInputs;
    private int xDelta = 100, yDelta = 100;

    public PanelJuego() {

        MouseInputs = new mouseInputs(this);
        addKeyListener(new keyBoardInputs(this));
        addMouseListener(MouseInputs);
        addMouseMotionListener(MouseInputs);

    }

    //gracias a este metodo se podra mover el rectangulo en una direccion
    public void changeXDelta(int valor){
        this.xDelta += valor;
        repaint();
    }

    //gracias a este metodo se podra mover el rectangulo en una direccion
    public void changeYDelta(int valor){
        this.yDelta += valor;
        repaint();
    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    //con la clase Graphics podemos pintar dentro de la pantalla del juego
    //se tiene que llamar igual que la del padre si no no funciona
    public void paintComponent(Graphics g) {

        //llamamos a jpanel (padre) para que haga lo que necesite
        //si no se hace asi puede dar errores
        super.paintComponent(g);

        //esto dibuja el cuadrado tambien por dentro, no solo los bordes
        g.fillRect(xDelta, yDelta, 200, 50);
    }
}
