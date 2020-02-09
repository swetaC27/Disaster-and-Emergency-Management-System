/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Housing;

import Business.Organization.Organization;

/**
 *
 * @author Prathamesh
 */
public class Housing {
    private String houseName;
    private String housePhone;
    private String houseEmail;
    private String houseCapacity;
    private String houseType;
    private String houseAddress;
    private String houseStatus;

    public Housing() {
        
    }
    
    public enum shelterType {
        Permanent("Permanent Camp"), 
        Spontaneous("Spontaneous Site"),
        Temporary("Temporary Camp"),
        Transition("Transition Site");

        private String value;

        private shelterType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum statusType {
        Active("Active"), 
        Inactive("In Active");

        private String value;

        private statusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
/*    public HousingOrganization() {
        super(Organization.OrganizationType.Housing.getValue());
    }*/
    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHousePhone() {
        return housePhone;
    }

    public void setHousePhone(String housePhone) {
        this.housePhone = housePhone;
    }

    public String getHouseEmail() {
        return houseEmail;
    }

    public void setHouseEmail(String houseEmail) {
        this.houseEmail = houseEmail;
    }

    public String getHouseCapacity() {
        return houseCapacity;
    }

    public void setHouseCapacity(String houseCapacity) {
        this.houseCapacity = houseCapacity;
    }
    
    @Override
    public String toString() {
        return houseName;
    }
    
}
