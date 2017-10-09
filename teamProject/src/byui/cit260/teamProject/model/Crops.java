/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.teamProject.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Darren
 */
public class Crops implements Serializable{
    
    private Integer year;
    private Integer population;
    private Integer acres;
    private Integer cropYield;
    private Integer wheatInStore;
    private Integer numberWhoDied;
    private Integer newPeople;
    private Integer harvest;
    private Integer pharaohShare;
    private Integer fed;
    private Integer planted;
    private Game game;

    public Crops() {
    }

    
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getAcres() {
        return acres;
    }

    public void setAcres(Integer acres) {
        this.acres = acres;
    }

    public Integer getCropYield() {
        return cropYield;
    }

    public void setCropYield(Integer cropYield) {
        this.cropYield = cropYield;
    }

    public Integer getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(Integer wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public Integer getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(Integer numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public Integer getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(Integer newPeople) {
        this.newPeople = newPeople;
    }

    public Integer getHarvest() {
        return harvest;
    }

    public void setHarvest(Integer harvest) {
        this.harvest = harvest;
    }

    public Integer getPharaohShare() {
        return pharaohShare;
    }

    public void setPharaohShare(Integer pharaohShare) {
        this.pharaohShare = pharaohShare;
    }

    public Integer getFed() {
        return fed;
    }

    public void setFed(Integer fed) {
        this.fed = fed;
    }

    public Integer getPlanted() {
        return planted;
    }

    public void setPlanted(Integer planted) {
        this.planted = planted;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.year);
        hash = 71 * hash + Objects.hashCode(this.population);
        hash = 71 * hash + Objects.hashCode(this.acres);
        hash = 71 * hash + Objects.hashCode(this.cropYield);
        hash = 71 * hash + Objects.hashCode(this.wheatInStore);
        hash = 71 * hash + Objects.hashCode(this.numberWhoDied);
        hash = 71 * hash + Objects.hashCode(this.newPeople);
        hash = 71 * hash + Objects.hashCode(this.harvest);
        hash = 71 * hash + Objects.hashCode(this.pharaohShare);
        hash = 71 * hash + Objects.hashCode(this.fed);
        hash = 71 * hash + Objects.hashCode(this.planted);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crops other = (Crops) obj;
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        if (!Objects.equals(this.population, other.population)) {
            return false;
        }
        if (!Objects.equals(this.acres, other.acres)) {
            return false;
        }
        if (!Objects.equals(this.cropYield, other.cropYield)) {
            return false;
        }
        if (!Objects.equals(this.wheatInStore, other.wheatInStore)) {
            return false;
        }
        if (!Objects.equals(this.numberWhoDied, other.numberWhoDied)) {
            return false;
        }
        if (!Objects.equals(this.newPeople, other.newPeople)) {
            return false;
        }
        if (!Objects.equals(this.harvest, other.harvest)) {
            return false;
        }
        if (!Objects.equals(this.pharaohShare, other.pharaohShare)) {
            return false;
        }
        if (!Objects.equals(this.fed, other.fed)) {
            return false;
        }
        if (!Objects.equals(this.planted, other.planted)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Crops{" + "year=" + year + ", population=" + population + ", acres=" + acres + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", pharaohShare=" + pharaohShare + ", fed=" + fed + ", planted=" + planted + '}';
    }
    
    
    
}
