/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Donation.Donation;


/**
 *
 * @author Sweta Chowdhury
 */
public class DonationWorkRequest extends WorkRequest{
    
    private Donation donation;
    private DonationType donationType;
    
    public enum DonationType
    {
            Emergency("EmergencyDonation"),NonEmergency("NonEmergencyDonation");
        
            private String value;

            private DonationType(String value) 
            {
                this.value = value;
            }

            public String getValue() 
            {
                return value;
            }

            @Override
            public String toString() 
            {
                return value;
            }
    }
    
    public DonationWorkRequest(){
        donation = new Donation();
    }

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }

    public DonationType getDonationType() {
        return donationType;
    }

    public void setDonationType(DonationType donationType) {
        this.donationType = donationType;
    }
   
    
    
}
