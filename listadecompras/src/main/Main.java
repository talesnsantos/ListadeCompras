/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Model.ordenação;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tales
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordenação ord = new ordenação();

        ordenação.i = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de itens na lista de compras"));
        ordenação.adicionar();
        int aux = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para odernar por quantidade, digite 2 para somar o total da compra \n\n digite 0 para sair "));
        
        
        //switch (aux) {
            //case '1':
            if(aux == 1){
                 ordenação.organize(ordenação.quant, ordenação.desc);
                JOptionPane.showMessageDialog(null,ordenação.getOrdem());
            }
               // break;
            //case '2':
            if(aux == 2){
               double som=ord.soma(ord.value, ord.value.length);
                JOptionPane.showMessageDialog(null,som);
                JOptionPane.showMessageDialog(null,ordenação.getSomar());
            }
                
                //break;
            //case '0':
               if(aux == 0){
                 JOptionPane.showMessageDialog(null,"saindo");
               } 
        }

    }


