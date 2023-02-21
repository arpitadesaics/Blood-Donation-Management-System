/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arpid
 */
public class HotelDirectory {

    public ArrayList<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(ArrayList<Hotel> hotel) {
        this.hotel = hotel;
    }
    
    private ArrayList<Hotel> hotel;
    
     public HotelDirectory()
    {
        this.hotel = new ArrayList<Hotel>();
    }
    
    public Hotel addNewHotel(){
        Hotel newH = new Hotel();
        hotel.add(newH);
        return newH;
    }
    public void deleteHotel(Hotel d){
        hotel.remove(d);
    
  }  
    public String[] HotelnameArray(){
        String[] c = new String[hotel.size()+1];
        int count=1;
        c[0] = "Select";
        for(Hotel cc: hotel){
            c[count] = cc.getName();
            count++ ;
        }
        return c;
     }
     
     public String[] HotelusernameArray(){
        String[] c = new String[hotel.size()+1];
        int count=1;
        c[0] = "Select";
        for(Hotel cc: hotel){
            c[count] = cc.getUsername();
            count++ ;
        }
        return c;
     }
    
}
