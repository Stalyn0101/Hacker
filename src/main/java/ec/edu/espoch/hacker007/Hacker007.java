/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.hacker007;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Hacker007 {

    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Ingrese la Edad");
        int edad = e.nextInt();
        if (edad >= 0 && edad < 120) {
            if (edad >= 0 && edad <= 12) {
                System.out.println("Eres un niño");
            } else if (edad >= 13 && edad <= 35) {
                System.out.println("Eres un joven");
            } else {
                System.out.println("Eres un Adulto");
            }
        } else {
            System.out.println("Error: Edad inválida");
        }
    }
}
