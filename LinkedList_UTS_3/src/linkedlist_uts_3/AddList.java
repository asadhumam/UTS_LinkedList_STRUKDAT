/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_uts_3;

import java.util.InputMismatchException;
import static linkedlist_uts_3.LinkedList_UTS_3.Antrian;
import static linkedlist_uts_3.LinkedList_UTS_3.DataStorage;
import static linkedlist_uts_3.LinkedList_UTS_3.Input;

/**
 *
 * @author WIWIN
 */
public class AddList {

    private static void addData() {
        System.out.println("Masukan Data:");
        String tempData = Input().nextLine();
        DataStorage.add(tempData);
        Antrian();
    }
    
    //Add_data2
    private static void adAdDataAtLocation() {
        Boolean status = true;
        int indexData = 0;
        Antrian();
        while(status) {
            System.out.println("Pilih index data yang ingin disisipi data:[0-"+(DataStorage.size()-1+"]:"));
            try {
                status = false;
                indexData = Input().nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Data yang ingin disisipkan pada index data ke-"+ indexData + ":");
                String tempData = Input().nextLine();
                DataStorage.add(indexData, tempData);
                Antrian();
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
