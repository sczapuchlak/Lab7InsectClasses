package com.Stephanie;

public class Bee extends Insect{

    protected String beesColor;
    protected Boolean Honey;
    protected String favoriteFlower;

    public Bee(String insectName, int numberOfWings, int numberOfLegs,
                 String beesColor,Boolean makesHoney,String favoriteFlower){
        super(insectName,numberOfWings,numberOfLegs);
        this.beesColor=beesColor;
        this.Honey=makesHoney;
        this.favoriteFlower=favoriteFlower;
    }

    public String getBeesColor() {
        return beesColor;
    }

    public void setBeesColor(String beesColor) {
        this.beesColor = beesColor;
    }

    public Boolean getMakesHoney() {
        return Honey;
    }

    public void setMakesHoney(Boolean makesHoney) {
        this.Honey = makesHoney;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    public String printSpeciesData(){
        String makesHoney= "";
        if(Honey){makesHoney= "Makes honey";}
        else{makesHoney="Does not make honey";}

        return "Insect Name: "+insectName+", "+" Number of Wings: "+numberOfWings+
                ", "+ "Number Of Legs: "+numberOfLegs+", "+"Color of Bee: "+beesColor+
                ", "+"Does it make honey? "+makesHoney+","+ insectName+"'s favorite flower: "+favoriteFlower;
}}


