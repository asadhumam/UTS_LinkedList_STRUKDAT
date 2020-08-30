/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_uts_3;

import static linkedlist_uts_3.LinkedList_UTS_3.Antrian;
import static linkedlist_uts_3.LinkedList_UTS_3.DataStorage;
import static linkedlist_uts_3.LinkedList_UTS_3.Input;


public class Search {
    public static boolean searchData(String data) {
        return DataStorage.contains(data);
    }
    
    public static void Search () {
        Antrian();
        System.out.println("Masukan Nama Yang Ingin Dicarai:");
        String data = Input().nextLine();
        if(searchData(data)) {
            System.out.println("\n\nHasil Pencarian ="+data);
        }
        else {
            System.out.println("Anda Memasukan Nama Yang Salah");
        }
        
        Antrian();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
