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
public class saranbahan2resep {
    public static void main(String[] args) {
        String identitas = "Nisrina Izdihar / XRPL5 / 32";
        System.out.println("identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("bahan pertama : ");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        System.out.print("masukkan no pilihan anda : ");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("bahan kedua : ");
            if(bahan1 == 1) {
                System.out.println("1. susu");
                System.out.println("2. minyak goreng");
                System.out.println("3. tidak ada");
            }else{
                System.out.println("1. minyak goreng");
                System.out.println("2. roti");
                System.out.println("3. tidak ada");
            }
            System.out.print("masukkan no pilihan anda :");
            
        }else
            System.out.println("mohon maaf, pilihan tidak ditemukan," + "tidak dapat memberikan saran resep");
        
        int bahan2 = scanner.nextInt();
        if(bahan2 >= 1 && bahan2 <= 3);
        {
            if(bahan1==1)
                switch(bahan1)
                {
                    case 1 : System.out.println("anda dapat membuat milk shake banana"); break;
                    case 2 : System.out.println("anda dapat membuat pisang goreng"); break;
                    case 3 : System.out.println("anda bisa membuat pisang rebus"); break;
                }
            else
                switch(bahan1)
                {
                    case 1 : System.out.println("anda dapat membuat telur mata sapi"); break;
                    case 2 : System.out.println("anda dapat membuat sandwich telur"); break;
                    case 3 : System.out.println("anda dapat mebuat telur rebus"); break;
                    
                }
        }else
          System.out.println("mohon maaf, pilihan tidak ditemukan," + "tidak dapat memberikan saran resep");
        }
    }
    

