/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance() {
        if (business == null){
            return new EcoSystem(); 
        }       
        return business;
    }
    
    public static void setInstance(EcoSystem system) {
        business = system;
    }
    
    public EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }
     
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
     public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            for (Network network : business.getNetworkList()) {

                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }

                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getUsername().equals(username)) {
                                return false;
                            }
                        }
                    }
                }
            }

        }

        return true;
    }
       
}
