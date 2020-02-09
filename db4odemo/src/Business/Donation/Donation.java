/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import java.util.Date;

/**
 *
 * @author Sweta Chowdhury
 */
public class Donation 
{
    private float food_quantity;
    private float cloth_quantity;
    private float moneyDonation;
    
    private String donatedTo;
    private Date donatedDate;
    

   
    public float getFood_quantity() 
    {
        return food_quantity;
    }

    public void setFood_quantity(float food_quantity) {
        this.food_quantity = food_quantity;
    }

    public float getCloth_quantity() {
        return cloth_quantity;
    }

    public void setCloth_quantity(float cloth_quantity) {
        this.cloth_quantity = cloth_quantity;
    }

    public float getMoneyDonation() {
        return moneyDonation;
    }

    public void setMoneyDonation(float moneyDonation) {
        this.moneyDonation = moneyDonation;
    }

    public String getDonatedTo() {
        return donatedTo;
    }

    public void setDonatedTo(String donatedTo) {
        this.donatedTo = donatedTo;
    }

    public Date getDonatedDate() {
        return donatedDate;
    }

    public void setDonatedDate(Date donatedDate) {
        this.donatedDate = donatedDate;
    }
    
    
    
    
}
