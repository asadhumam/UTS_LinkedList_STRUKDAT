/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_uts_3;

/**
 *
 * @author WIWIN
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;

public class LinkedList_UTS_3 {

    //Linked List
    public static LinkedList<String> DataStorage = new LinkedList<String>();
    
    //Input
    public static Scanner Input() {
        return new Scanner(System.in);
    }
    
    //agar menampilkan data
    public static void Antrian() {
        System.out.println("\nUrutan Antrian:"+DataStorage);
        System.out.println("Total Antrian"+DataStorage.size());
    }
    
    //exit
    public static void Exit() {
        System.exit(0);
    }
    
    public static void Title() {
        System.out.println("Program Antrian Pembayaran SPP & Menabung Pondok Pesantren Nurul Bayan");
    }
    
    //switch
    public static void Switcher() {
        AddList A = new AddList();
        RemoveList R = new RemoveList();
        Search S = new Search();
        
        boolean status = true;
        int indexMenu = 0;
        while (status) {
            try {
                status = false;
                System.out.println("Pilih Menu [1-4]:");
                indexMenu = Input().nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Masukan Harus Berupa Angka!");
                status = true;
            }
        }
        
        switch(indexMenu) {
            case 1: Menu(); break;
            case 2: removeData(); break;
            case 3: S.Search(); break;
            case 4: Exit(); break;
        }
        Menu();
    }
    
    public static void Menu() {
        System.out.println("\n<<<<<Menu Antrian>>>>>"
                +"\n1. Tambah Antrian"
                +"\n2. Hapus Antrian"
                +"\n3. Search Data"
                +"\n4. Exit");
        Switcher();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    private static void removeData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
