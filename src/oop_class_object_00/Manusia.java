/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_class_object_00;

/**
 *
 * @author LAB
 */
public class Manusia {
    String nama;
    String alamat;
    Integer umur;
    
    public Manusia(){
        this.nama = "Belum Ada Nama";
        this.alamat = "Apalagi Alamat";   
    }
    
     public void inputData(String nm){
         this.nama = nm;
         this.alamat = "Belum ada Alamat";
    }
     
    public void inputData(String nm, String alamat){
         this.nama = nm;
         this.alamat = alamat;
    }
    
    public void inputData(String nm, String alamat, int umur){
         this.nama = nm;
         this.alamat = alamat;
         this.umur = umur;
    }
     
    
    public String getNama(){
        return this.nama;
        
    }
    public String getAlamat(){
        return this.alamat;
    }
    
    public Integer getUmur(){
        return this.umur;
    }
    
   
    
}
