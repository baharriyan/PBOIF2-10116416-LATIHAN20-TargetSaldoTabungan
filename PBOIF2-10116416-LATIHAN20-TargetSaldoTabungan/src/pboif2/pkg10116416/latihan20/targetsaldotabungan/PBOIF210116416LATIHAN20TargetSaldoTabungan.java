/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116416.latihan20.targetsaldotabungan;

/**
 *
 * @author Riyan bahar
 * nim: 10116416
 * PBOIF2
 */
public class PBOIF210116416LATIHAN20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int i,total,bunga;
        total=3500000;
        bunga= (int) (total*0.08);
        total = total+bunga;
        i=1;
        do{
            System.out.println("Saldo dibulan ke- " +i + " Rp. " +total);
            i++;
            bunga =(int)(total * 0.08);
            total+=bunga;
        }while(i<=8);
    }  
}
