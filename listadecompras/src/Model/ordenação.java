/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import main.Main;

/**
 *
 * @author tales
 */
public class ordenação {

    // Main main = new Main();
    public static int i;
    private static String[] produtos;
    private static int[] quantidades;
    private static String ordem = "";
    public static int[] quant;
    public static int cont = 0;
    public static String[] desc;
    public static double[] value;
    private static double somar;

    public static void adicionar() {
        quant = new int[i];
        desc = new String[i];
        value = new double[i];

        String x = "";
        for (int a = 0; a < quant.length; a++) {
            desc[cont] = (JOptionPane.showInputDialog("digite O Nome do item comprado ou 0 para sair"));
            quant[cont] = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade do item comprado"));
            value[cont] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Item"));
            value[cont] = value[cont] * quant[cont];
            x += desc[cont] + "   " + quant[cont] + "    " + value[cont] + "\n";
            cont++;
        }
        JOptionPane.showMessageDialog(null, x);

    }

    public static void organize(int[] quant, String[] prod) {
        int aux = 0;
        String aux2 = "";

        for (int i = 0; i < quant.length; ++i) {
            for (int j = 0; j < quant.length - 1; ++j) {

                if (quant[j] > quant[j + 1]) {
                    aux = quant[j];
                    quant[j] = quant[j + 1];
                    quant[j + 1] = aux;

                    aux2 = prod[j];
                    prod[j] = prod[j + 1];
                    prod[j + 1] = aux2;

                }
            }
        }
        produtos = prod;
        quantidades = quant;
        for (int i = 0; i < quant.length; i++) {
            ordem += produtos[i] + "   " + quantidades[i] + "    " + value[i] + "\n";
        }

    }

    public static double soma(double[] value, int tamArray) {

        /*if (w < value.length) {
            somar = value[w] + soma(value, (w + 1));
            
            return somar ;
        } else {
            return 30;
        }*/
        if (tamArray > 0) {
            double somar = value[tamArray - 1] + soma(value, tamArray - 1);
            return somar;
        } else {
            return 0;
        }

    }

    /**
     * @return the somar
     */
    public static double getSomar() {
        return somar;
    }

    /*public static ArrayList organize(ArrayList<Integer> quant){
        int aux = 0;
        ArrayList<Integer> quant2 = new ArrayList(quant.size()); 
        
        for(int i = 0;i<quant.size();++i){
            for(int j = 0;j<quant.size()-1;++j){
                
                 if (quant.get(j) > quant.get(j+1)) {
                    aux = quant.get(j);
                    quant.add(j, quant.get(j+1));
                    quant.add(j+1, aux);
                
                
                }}
        }
        quant2 = quant;
        return quant;
    }*/
    /**
     * @return the ordem
     */
    public static String getOrdem() {
        return ordem;
    }

    /**
     * @return the produtos
     */
    public static String[] getProdutos() {
        return produtos;
    }

    /**
     * @return the quants
     */
    public static int[] getQuants() {
        return quantidades;
    }

    /**
     * @return the produtos
     */
}
