
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio 2
 */
public class NewClass1 {
     public static void main(String[] args) {
      
        double[]precio = new  double[3];
        double acu = 0;
        
        int bandera = 0;
        do{
        for (int i = 0; i < precio.length; i++) {
            precio[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la cantidad"));
            acu += precio[i];
        }
        
        JOptionPane.showMessageDialog(null,"el total es: "+ acu);
        
        bandera = JOptionPane.showConfirmDialog(null,"Desea Salir del programa?", "confirmar",JOptionPane.YES_NO_OPTION);
       
    }while( bandera == JOptionPane.YES_OPTION);
        
    }
}
