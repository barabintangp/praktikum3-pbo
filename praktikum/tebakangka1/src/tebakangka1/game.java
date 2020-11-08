package tebakangka1;
import java.util.Scanner;

public class game {
    int tebak(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tebakan Anda : ");
        int tebakan = input.nextInt();
        return tebakan;
    }
}