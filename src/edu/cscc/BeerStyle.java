package edu.cscc;

//import java.util.HashMap;

public class BeerStyle {
    private String beerStyle;
    private Integer gallonsOfBeer;
    private Integer beerTemperature;

    // Constructor
    public BeerStyle(String beerStyle, Integer gallonsOfBeer, Integer beerTemperature) {
        this.beerStyle = beerStyle;
        this.gallonsOfBeer = gallonsOfBeer;
        this.beerTemperature = beerTemperature;
    }

    //Getters
    public String getBeerStyle() {
        return beerStyle;
    }

    public Integer getGallonsOfBeer() {
        return gallonsOfBeer;
    }

    public Integer getBeerTemperature() {
        return beerTemperature;
    }

    //Setters

    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    public void setGallonsOfBeer(Integer gallonsOfBeer) {
        this.gallonsOfBeer = gallonsOfBeer;
    }

    public void setBeerTemperature(Integer beerTemperature) {
        this.beerTemperature = beerTemperature;
    }


//    // Creating an empty HashMap
//    HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
//    // Mapping int values to String keys
//        hash_map.put("American Amber Ale", 2.3);
//        hash_map.put("American IPA", 2.4);
//        hash_map.put("American Pale Ale", 2.5);
//        hash_map.put("Irish Red Ale", 2.4);
//        hash_map.put("Stout", 2.1);

}
