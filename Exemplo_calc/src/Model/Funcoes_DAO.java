/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static View.Inicio_GUI.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Funcoes_DAO {
    public static int val1= 0,val2=0, res=0;

    public static void soma (){
        val1= Integer.parseInt(VALOR1_TXT.getText());
         val2= Integer.parseInt(VALOR2_TXT.getText());
         res = val1+ val2;
         
         RESULTADO_TXT.setVisible(true);
         RESULTADO_TXT.setText(String.valueOf(res));
         RESULTADO_TXT.setBackground(Color.red);
         
         
         
    }  
        
    
     
    public static void menos (){
    int val1= Integer.parseInt(VALOR1_TXT.getText());
         int val2= Integer.parseInt(VALOR1_TXT.getText());
         JOptionPane.showMessageDialog(null, val1-val2);                     
    }
    
     public static void multiplicar (){
    int val1= Integer.parseInt(VALOR1_TXT.getText());
         int val2= Integer.parseInt(VALOR1_TXT.getText());
         JOptionPane.showMessageDialog(null, val1*val2);   
    }
     
     public static void dividir (){
    int val1= Integer.parseInt(VALOR1_TXT.getText());
         int val2= Integer.parseInt(VALOR1_TXT.getText());
         JOptionPane.showMessageDialog(null, val1*val2);  
     }
     
    public static void limpar (){
    VALOR1_TXT.setText("");
    VALOR2_TXT.setText("");
     }}
