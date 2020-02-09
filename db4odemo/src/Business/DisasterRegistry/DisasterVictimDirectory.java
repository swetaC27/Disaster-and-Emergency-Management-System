/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DisasterRegistry;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author mamta
 */
public class DisasterVictimDirectory {
    private ArrayList<DisasterVictim> victimList;
    
    public DisasterVictimDirectory(){
        victimList = new ArrayList<DisasterVictim>();
    }

    public ArrayList<DisasterVictim> getVictimList() {
        return victimList;
    }

    public void setVictimList(ArrayList<DisasterVictim> victimList) {
        this.victimList = victimList;
    }
    public DisasterVictim createVictimRegistry(String name, int age, String gender,long contact,String address,String nationality,File file,String type){
        DisasterVictim disasterVictim = new DisasterVictim();
        disasterVictim.setName(name);
        disasterVictim.setAge(age);
        disasterVictim.setGender(gender);
        disasterVictim.setContact(contact);
        disasterVictim.setAddress(address);
        disasterVictim.setNationality(nationality);
        disasterVictim.setFile(file);
        disasterVictim.setType(type);
        victimList.add(disasterVictim);
        return disasterVictim;
    }
    
}
