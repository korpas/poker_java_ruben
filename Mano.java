/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author Rubén
 */
public class Mano {
  
    private ArrayList<Carta> mano;
    
    public Mano(){
    
    this.mano = new ArrayList<Carta>();
    
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }
    
      @Override
    public String toString() {
        return "Mano{" + "mano=" + mano + '}';
    }
    
    public void cogerCarta(Carta carta){
    
    this.mano.add(carta);
    }
    
    public int cartasEnMano(){
    
        return this.mano.size();
    }
    
    public void Descartar(){
    
    for (double y = 0; y < 2 ; y++){
        this.mano.remove(0);
    }
    }  
    public Carta getCarta(int aCard){
    
        return this.mano.get(aCard);
    }
}
