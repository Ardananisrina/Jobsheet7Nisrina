/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7Nisrina;
import java.util.Scanner;
/**
 *
 * @author Nisrina Izdihar
 */
public class cobapercabangan2 {
    public static void main(String[] args) {
        String identitas = "Nisrina Izdihar / XRPL5 / 32";
        System.out.println("identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a <= 5) System.out.println("nilai a kurang dari sama dengan 5");
        
        System.out.println("\nIF.. 2");
        if(a >= 5) System.out.println("nilai a lebih dari sama dengan 5");
        
        System.out.println("isi variabel a : " + a);
        
        
        }
    }
