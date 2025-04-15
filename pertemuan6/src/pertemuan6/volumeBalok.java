/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @elsinta
 */
public class VolumeBalok {
        private int panjang,lebar,tinggi;
        private int hasil;
        
        public int valume() {
            this.hasil = this.panjang*this.lebar*this.tinggi;
            return this.hasil;
        }
        public void setPanjang(int pj){
            this.panjang = pj;
            
        }
          public void settinggi(int pj){
            this.tinggi = pj;
         
            
            
          }
          public void setlebar(int pj){
            this.lebar = pj;
          }
          
           public int getpanjang(){
               return this.panjang;
           }
             public int getlebar(){
               return this.lebar;
             }
              public int gettinggi(){
               return this.tinggi;
               
              }
            }

