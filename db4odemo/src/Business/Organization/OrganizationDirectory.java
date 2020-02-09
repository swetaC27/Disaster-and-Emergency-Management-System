/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Organization.Organization.OrganizationType;

import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(OrganizationType type) {
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.StaffAndVolunteer.getValue())){
              organization = new StaffOrganization();
              organizationList.add(organization);
        }
//        else if (type.getValue().equals(OrganizationType.Volunteer.getValue())){
////            organization = new LabOrganization();
////            organizationList.add(organization);
//        }
        else  if (type.getValue().equals(OrganizationType.DisasterVictimRegistry.getValue())){
              organization = new DisasterVictimOrganization();
              organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.Housing.getValue())){
            organization = new HousingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.FoodClothing.getValue())){
            organization = new FoodClothingOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
    
    
}
