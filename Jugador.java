/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;


/**
 *
 * @author Rubén
 */
public class Jugador {
    
   private String jugador;
   private Mano cartas;
   private int puntuacion;
   
   public Jugador(String jugador, Mano cartas, int puntuacion){
   this.jugador = jugador;
   this.cartas = cartas;
   this.puntuacion = puntuacion;
   }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public Mano getCartas() {
        return cartas;
    }

    public void setCartas(Mano cartas) {
        this.cartas = cartas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
   
}
