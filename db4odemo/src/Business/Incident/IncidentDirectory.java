/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Incident;

import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class IncidentDirectory {
    private ArrayList<Incident> incidentList;

    public IncidentDirectory() {
        incidentList = new ArrayList<>();
    }

    public ArrayList<Incident> getIncidentList() {
        return incidentList;
    }

    public void setIncidentList(ArrayList<Incident> incidentList) {
        this.incidentList = incidentList;
    }

    public Incident addIncident() {
        Incident incident = new Incident();
        this.incidentList.add(incident);
        return incident;
    }

}
