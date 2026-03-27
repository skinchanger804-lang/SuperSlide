package Main;

import javax.swing.*;
import java.awt.*;

//esto es como el lienzo del juego
public class PanelJuego extends JPanel {
    public PanelJuego() {

    }

    //con la clase Graphics podemos pintar dentro de la pantalla del juego
    //se tiene que llamar igual que la del padre si no no funciona
    public void paintComponent(Graphics g) {

        //llamamos a jpanel (padre) para que haga lo que necesite
        //si no se hace asi puede dar errores
        super.paintComponent(g);

        //esto dibuja el cuadrado tambien por dentro, no solo los bordes
        g.fillRect(100, 100, 200, 50);


    }
}
