package tebakangka1;

import java.util.Random;

public class Tebakangka1 {
    public static void main(String[] args){
        Random random = new Random();
        game player = new game();
        int AngkaAcak = random.nextInt(100-1)+1;
   
        System.out.println("hallo! Saya Bara, Silahkan anda tebak angka mulai dari 1-100");
        boolean done = false;
    
        while (done == false){
            int tebakan = player.tebak();
            if (tebakan == AngkaAcak){
                System.out.println("Tebakan anda benar !");
                done = true;
            } else if (tebakan > AngkaAcak){
                System.out.println("Angka terlalu besar ! coba lagi !");
            } else if (tebakan < AngkaAcak){
                System.out.println("Angka terlalu kecil ! coba lagi !");
            }
        }
    }
}