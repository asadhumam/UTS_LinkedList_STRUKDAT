/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_uts_3;

import java.util.InputMismatchException;
import static linkedlist_uts_3.LinkedList_UTS_3.Antrian;
import static linkedlist_uts_3.LinkedList_UTS_3.Input;
import static linkedlist_uts_3.LinkedList_UTS_3.DataStorage;
import static linkedlist_uts_3.Search.searchData;

/**
 *
 * @author WIWIN
 */
public class RemoveList {

    public static void RemoveData() {
        boolean status = true;
        int indexData = 0;
        Antrian();
        while(status) {
            System.out.println("Pilih Antrian yang ingin dihapus: [0-"+(DataStorage.size()-1)+"]:");
            try {
                status = false;
                indexData = Input().nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Data harus berupa angka!");
                status = true;
            }
            DataStorage.remove(indexData);
            Antrian();
        }
    }
    
     private static void removeDataAtFirst() {
        DataStorage.removeFirst();
        Antrian();
    }
    
    private static void removeDataAtLast() {
        DataStorage.removeLast();
        Antrian();
    }
    
    private static void removeDataByContent() {
        Antrian();
        System.out.println("Masukan data yang ingin dihapus:");
        String data = Input().nextLine();
        if(searchData(data)){
            DataStorage.remove(data);
        }
        else {
            System.out.println("Anda memasukan data yang tidak tersimpan didalam list");
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
