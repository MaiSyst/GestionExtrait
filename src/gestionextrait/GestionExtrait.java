/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionextrait;

import java.awt.Frame;

/**
 *
 * @author orion90
 */
public class GestionExtrait {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtraitForm extraitForm=new ExtraitForm();
        extraitForm.setExtendedState(Frame.MAXIMIZED_BOTH);
                extraitForm.setVisible(true);
    }
    
}
