/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Housing.Housing;
import Business.Housing.HousingDirectory;
import Business.Role.HousingAdminRole;
import Business.Role.Role;
import Business.Role.StaffRole;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class HousingOrganization extends Organization {
    
    private HousingDirectory housingDirectory;

    public HousingOrganization() {
        super(OrganizationType.Housing.getValue());
        housingDirectory = new HousingDirectory();
    }

    public HousingDirectory getHousingDirectory() {
        return housingDirectory;
    }

   
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HousingAdminRole());
        return roles;
    }
    
}
