/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Member.MemberDirectory;
import Business.Role.Role;
import Business.Role.StaffAndVolunteerAdminRole;
import Business.Role.StaffRole;
import Business.Role.VolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class StaffOrganization extends Organization {
    private MemberDirectory memberDirectory;
      
    public StaffOrganization() {
        super(OrganizationType.StaffAndVolunteer.getValue());
        memberDirectory = new MemberDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StaffAndVolunteerAdminRole());
        roles.add(new StaffRole());
        roles.add(new VolunteerRole());
        return roles;
    }

    public MemberDirectory getMemberDirectory() {
        return memberDirectory;
    }
   
    
    
}
