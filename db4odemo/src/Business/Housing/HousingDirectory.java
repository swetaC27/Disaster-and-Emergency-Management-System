/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Housing;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Prathamesh
 */
public class HousingDirectory {
    private ArrayList<Housing> housingList;

    public HousingDirectory() {
        housingList = new ArrayList<Housing>();
    }
    
    public ArrayList<Housing> getHousingList() {
        return housingList;
    }

    public Housing createAndAddHousing(){
        Housing house = new Housing();
        housingList.add(house);
        return house;
    }
    

}
