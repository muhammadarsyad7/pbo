/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yayasansehabatyatim;
import Transaksi.*;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class YayasanSehabatYatim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Donatur Saya = new Donatur();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Name : ");
        Saya.inputName(input.nextLine());
        System.out.print("Masukkan Alamat : ");
        Saya.inputAlamat(input.nextLine());
        System.out.print("Masukkan Telpon : ");
        Saya.inputTelp(input.nextLine());
        System.out.print("Masukkan Nominal : ");
        Saya.inputNominal(input.nextLine());
        System.out.print("Masukkan Status(Terkirim/Belum) : ");
        Saya.inputStatus(input.nextLine());
        
        if(Saya.getStatus().equals("Terkirim")){
            System.out.print("Masukkan Jumlah Barang : ");
            Saya.inputBarang(input.nextInt());
        }else{
            Saya.inputBarang(0);
        }
        System.out.print("Masukkan Jumlah Barang : ");
        Saya.inputBarang(input.nextInt());
        
        System.out.println("===========================");
        System.out.println("Transaksi Total : " + Saya.TransaksiTotal());
    }
    
}
