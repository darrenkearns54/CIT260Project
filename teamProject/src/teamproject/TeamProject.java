/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import byui.cit260.teamProject.model.Crops;
import byui.cit260.teamProject.model.InventoryItem;
import byui.cit260.teamProject.model.Location;
import byui.cit260.teamProject.model.Map;
import byui.cit260.teamProject.model.Player;

/**
 *
 * @author Darren
 */
public class TeamProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        
        String playerOneName = playerOne.getName();
        
        InventoryItem corn = new InventoryItem();
        
        corn.setDescription("Corn");
        corn.setQuantity(7);
        
        String cornDescription = corn.getDescription();
        double cornQuantity = corn.getQuantity();
        
        Map test = new Map();
        
        test.setRowCount(87);
        test.setColCount(45);
        
        double testRowCount = test.getRowCount();
        double testColCount = test.getColCount();
        
        Location loc = new Location();
        
        loc.setRow(4);
        loc.setColumn(56);
        loc.setDescription("test");
        loc.setSymbol("test1");
        
        double locRow = loc.getRow();
        double locColumn = loc.getColumn();
        String locDescription = loc.getDescription();
        String locSymbol = loc.getSymbol();
        
        Crops crop = new Crops();
        
        crop.setYear(2017);
        crop.setPopulation(56);
        crop.setAcres(14);
        crop.setCropYield(97);
        crop.setWheatInStore(8);
        crop.setNumberWhoDied(1776);
        crop.setNewPeople(2);
        crop.setHarvest(64);
        crop.setPharaohShare(12);
        crop.setFed(1);
        crop.setPlanted(10001);
        
        double cropYear = crop.getYear();
        double cropPopulation = crop.getPopulation();
        double cropAcres = crop.getAcres();
        double cropCropYield = crop.getCropYield();
        double cropWheatInStore = crop.getWheatInStore();
        double cropNumberWhoDied = crop.getNumberWhoDied();
        double cropNewPeople = crop.getNewPeople();
        double cropHarvest = crop.getHarvest();
        double cropPharaohShare = crop.getPharaohShare();
        double cropFed = crop.getFed();
        double setPlanted = crop.getPlanted();
        
        
        System.out.println(playerOne.toString());
        System.out.println(corn.toString());
        System.out.println(test.toString());
        System.out.println(loc.toString());
        System.out.println(crop.toString());
        
        
    }
    
}
