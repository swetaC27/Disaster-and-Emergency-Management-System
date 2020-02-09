/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Sweta Chowdhury
 */
public class HousingWorkRequest extends WorkRequest {
    private int shelter;
    private String result;
    private String noOfPeople;

    public String getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(String noOfPeople) {
        this.noOfPeople = noOfPeople;
    }    

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getShelter() {
        return shelter;
    }

    public void setShelter(int shelter) {
        this.shelter = shelter;
    }  
     @Override
    public String toString() {
        return result;
    }
    
}
