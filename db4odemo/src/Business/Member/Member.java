/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class Member {
    private String Name;
    private String phoneNumber;
    private String address;
    private String gender;
    private String type;
    private String email;
    private ArrayList<String> skillSet;
    
    public enum MemberType {
        Staff("Staff"),
        Volunteer("Volunteer");


        private String value;

        private MemberType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(ArrayList<String> skillSet) {
        this.skillSet = skillSet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    @Override
    public String toString() {
        return Name;
    }
    
    
                      
}
