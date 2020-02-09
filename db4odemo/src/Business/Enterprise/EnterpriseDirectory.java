/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, String networkName, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.ReliefOrganization){
            enterprise = new ReliefOrganizationEnterprise(name, networkName);
        }
        else if(type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
        }
        else if(type == Enterprise.EnterpriseType.Shelter) {
            enterprise = new ShelterEnterprise(name);
        }
        else if(type == Enterprise.EnterpriseType.Alerts) {
            enterprise = new AlertsEnterprise(name);
        }
        else if(type == Enterprise.EnterpriseType.Sensors) {
            enterprise = new SensorsEnterprise(name);
        }
        if (enterprise != null){
            enterpriseList.add(enterprise);
        }      
        return enterprise;
    }
   
    
}
