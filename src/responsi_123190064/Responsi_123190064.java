/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi_123190064;

import Movie.DataMovie;
import Movie.Koneksi;

/**
 *
 * @author USER
 */
public class Responsi_123190064 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi db = new Koneksi();
        DataMovie dataMovie = new DataMovie(db);
        dataMovie.setVisible(true);
    }
    
}
