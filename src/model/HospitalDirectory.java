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
public class HospitalDirectory {
    private ArrayList<Hospital> hospital;
    public HospitalDirectory()
    {
        this.hospital = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }
    
    public Hospital addNewH(){
        Hospital newH = new Hospital();
        hospital.add(newH);
        return newH;
    }
    public void deleteH(Hospital d){
        hospital.remove(d);
    
  }  
    
  public String[] HospitalArray(){
        String[] c = new String[hospital.size()+1];
        int count=1;
        c[0] = "Select";
        for(Hospital cc: hospital){
            c[count] = cc.getName();
            count++ ;
        }
        return c;
     }
    
   
    
}
