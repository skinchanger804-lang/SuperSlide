package Main;

public class Juego {

    private PantallaJuego pantallaJuego;
    private PanelJuego panelJuego;

    public Juego() {
        panelJuego = new PanelJuego();
        pantallaJuego = new PantallaJuego(panelJuego);


    }
}
