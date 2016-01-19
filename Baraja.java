/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Collections;
import java.util.*;




/**
 *
 * @author Rubén
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    
    public Baraja(){
        //int contador = 0;
        this.cartas = new ArrayList<Carta>();
        for(int i = 0;i<4;i++)
            {
                for(int j = 0;j < 13;j++)
                {
                    this.cartas.add(/*contador,*/new Carta(i,j));
                    /*contador++;*/
                }
            }
    }
    public void barajar()
    {
        Collections.shuffle(this.cartas);
    }
    
     /**
     *
     * @param numero
     * @return cartas
     */
    
public Mano Repartir(Mano mano){
    
        while (mano.cartasEnMano()<5){
        mano.cogerCarta(this.cartas.get(0));
        this.cartas.remove(0);
        }
        return mano;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    

}
