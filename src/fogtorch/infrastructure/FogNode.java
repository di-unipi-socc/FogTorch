/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fogtorch.infrastructure;

import fogtorch.application.ExactThing;
import java.util.Collection;
import java.util.HashSet;
import fogtorch.application.SoftwareComponent;
import fogtorch.application.ThingRequirement;
import fogtorch.utils.Hardware;

/**
 *
 * @author stefano
 */
public class FogNode extends ComputationalNode{
    public HashSet<String> connectedThings;
    private Hardware hw;
    
    public FogNode(String identifier, Collection<String> software, Hardware hw, double x, double y){
        super.setId(identifier);
        this.hw = new Hardware(hw);
        super.setSoftware(software);
        super.setCoordinates(x,y);
        connectedThings = new HashSet<>();
    }


    public void setHardware(Hardware h){
       hw = new Hardware(h);
    }
    
    public Hardware getHardware(){
        return hw;
    }
    
    @Override
    public boolean isCompatible(SoftwareComponent component){
        Hardware hardwareRequest = component.getHardwareRequirements();
        Collection<String> softwareRequest = component.getSoftwareRequirements();
        
        return hw.supports(hardwareRequest) && 
                softwareRequest.stream().noneMatch(
                        (s) -> (!super.getSoftware().contains(s))
                );
    }
   

    @Override
    public void deploy(SoftwareComponent s) {
        hw.deploy(s.getHardwareRequirements());
    }

    @Override
    public void undeploy(SoftwareComponent s) {
        hw.undeploy(s.getHardwareRequirements());
    }
    
        @Override
    public String toString(){
        String result = "<";
        result = result + getId() + ", " + super.getSoftware() + ", "+ hw +", "+this.getCoordinates();        
        result += ">";
        return result; 
    }


    public double distance(Thing t) {
        return t.getCoordinates().distance(super.getCoordinates());
    }

    @Override
    public double computeHeuristic(SoftwareComponent s) {
        this.heuristic = this.hw.cores/8 + this.hw.ram/8 + this.hw.storage/500;
        
        for( ThingRequirement r: s.getThingsRequirements()){
            ExactThing e = (ExactThing) r;
            if (this.connectedThings.contains(e.getId())){
                heuristic++;
            }
        }
        return heuristic;
    }


    
}
