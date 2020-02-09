/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DisasterRegistry;

import Business.Enterprise.ReliefOrganizationEnterprise;
import Business.Organization.Organization;
import java.io.File;
import javax.swing.Icon;

/**
 *
 * @author mamta
 */
public class DisasterVictim {
    String name;
    int age;
    String gender;
    private File file;
    private Icon image;
    long contact;
    String address;
    String nationality;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
 
    

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     @Override
    public String toString() {
        return name;
    }
    
}
