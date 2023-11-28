/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biodata_prakpro2;

import javax.swing.*;
import dao.BiodataDao;
import biodata.BiodataFrame;
/**
 *
 * @author syhnn
 */
public class Biodata_PrakPro2 extends JFrame{
    private final BiodataDao biodataDao; // Variable biodataDao untuk menyimpan nilai biodataDao
    private final BiodataFrame biodataFrame; // Variable biodataFrame untuk menyimpan nilai biodataFrame

    // Constructor Main
    public Biodata_PrakPro2() {
        // Set judul dari frame
        this.setTitle("Biodata");

        // Set ukuran dari frame
        this.setSize(400, 500);
        
        // Inisialisasi nilai dari biodataDao dan biodataFrame
        this.biodataDao = new BiodataDao();
        this.biodataFrame = new BiodataFrame(biodataDao);

        // Set frame agar tidak dapat di resize
        this.biodataFrame.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Method invokeLater dari SwingUtilities untuk menjalankan objek Runnable yang
        // berguna menangani event dan update UI
        SwingUtilities.invokeLater(new Runnable() {
            // Override method run dari Runnable
            public void run() {
                // Instansiasi StudiKasus dengan nama h
                new Biodata_PrakPro2();
            }
        });
    }
    
}
