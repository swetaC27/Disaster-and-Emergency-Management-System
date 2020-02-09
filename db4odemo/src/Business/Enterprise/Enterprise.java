/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Incident.IncidentDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Sweta Chowdhury
 */
public abstract class Enterprise extends Organization {
    private String networkName;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private IncidentDirectory incidentDirectory;

    public Enterprise(String name, EnterpriseType enterpriseType, String networkName) {
        super(name);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
        incidentDirectory = new IncidentDirectory();
        this.networkName = networkName;
    }

    public enum EnterpriseType {
        ReliefOrganization("ReliefOrganization"),
        Hospital("Hospital"),
        Shelter("Shelter"),
        Alerts("Alerts"),
        Sensors("Sensors");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }
    
    public String getNetworkName() {
        return networkName;
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
      public IncidentDirectory getIncidentDirectory() {
        return incidentDirectory;
    }

}
