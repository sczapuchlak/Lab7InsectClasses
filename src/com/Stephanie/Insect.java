package com.Stephanie;

public abstract class Insect {
    protected String insectName;
    protected int numberOfWings;
    public final int numberOfLegs = 6;

   public Insect(String insectName,int numberOfWings,int numberOfLegs){
       this.insectName = insectName;
       this.numberOfWings = numberOfWings;
   }

    public String getInsectName() {
        return insectName;
    }

    public void setInsectName(String insectName) {
        this.insectName = insectName;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public abstract String printSpeciesData();
}
