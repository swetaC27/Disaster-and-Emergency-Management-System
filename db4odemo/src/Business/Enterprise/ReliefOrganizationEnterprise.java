/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class ReliefOrganizationEnterprise extends Enterprise {
     
    public ReliefOrganizationEnterprise(String name, String networkName) {
        super(name, EnterpriseType.ReliefOrganization, networkName);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
