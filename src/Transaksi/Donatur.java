/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaksi;

/**
 *
 * @author USER
 */
public class Donatur extends Trans_Donasi{
    
    String Nama, Alamat, Telpon;
    
    public Donatur(){}
    
    public Donatur(String nama, String alamat, String telp){
        this.Nama = nama;
        this.Alamat = alamat;
        this.Telpon = telp;
    }
    
    
    public void inputName(String nama){
        this.Nama = nama;
    }
    
    public String ambilName(){
        return this.Nama;
    }
    
    public void inputAlamat(String alamat){
        this.Alamat = alamat;
    }
    
    public String ambilAlamat(){
        return this.Alamat;
    }
    
    public void inputTelp(String telp){
        this.Telpon = telp;
    }
    
    public String ambilTelp(){
        return this.Telpon;
    }
    
}
