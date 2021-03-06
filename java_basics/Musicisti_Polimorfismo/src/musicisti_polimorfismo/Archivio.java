/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package musicisti_polimorfismo;

import java.util.Random;

/**
 *
 * @author kaisersource
 */
public class Archivio {
    Musicista V[];
    
    public Archivio (int n, int m){ //n professionisti, m dilettanti
        V = new Musicista[n+m];
        Random r = new Random();
        for (int i=0; i < n ; i++){
            V[i]= new Professionista((int) (Math.random()*20), "professionista"+i,(int) (Math.random()*20)+18 );
        }
         for (int i=n; i < n+m ; i++){
            V[i]= new Dilettante(r.nextBoolean(), "dilettante"+i,(int) (Math.random()*20)+18 );
        }
    }
         public int numeroMusicisti(double n){
             int c=0;
             for (int i=0; i<V.length; i++)
                 if (V[i].rimborsoSpese()>n ){ //se il rimborso spese supera n=100
                     c++; //contatore dei musicisti
                 }
         return c; 
    }
}
