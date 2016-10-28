package com.Stephanie;


public class Butterfly extends Insect{

    private String wingColor;
    private String favoriteFlower;

    public Butterfly(String insectName, int numberOfWings, int numberOfLegs,
                     String wingColor, String favoriteFlower){
        super(insectName,numberOfWings,numberOfLegs);
        this.wingColor= wingColor;
        this.favoriteFlower= favoriteFlower;
    }

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    public String printSpeciesData(){
        return "Insect Name: "+insectName+", "+" Number of Wings: "+numberOfWings+
                ", "+ "Number Of Legs: "+numberOfLegs+", "+"Wing Color: "+wingColor+
                ", "+ insectName+"'s favorite flower: "+ favoriteFlower;

    }
}
