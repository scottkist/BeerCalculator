package edu.cscc;
import java.lang.Math;

public class PrimingSugar extends BeerStyle {
        private String primingSugar;
        private Double co2Volume;

        public PrimingSugar(String beerStyle, Integer gallonsOfBeer, Integer beerTemperature, String primingSugar, Double co2Volume) {
                super(beerStyle, gallonsOfBeer, beerTemperature);
                this.primingSugar = primingSugar;
        }
        //Getters and Setters
        public String getPrimingSugar() {
                return primingSugar;
        }

        public void setPrimingSugar(String primingSugar) {
                this.primingSugar = primingSugar;
        }

        public Double getCo2Volume() {
                return co2Volume;
        }

        public void setCo2Volume(Double co2Volume) {
                this.co2Volume = co2Volume;
        }
        //Other Methods

        public double calcAmountOfPrimingSugar() {
                //Priming Sugar Amount = 15.195 * BeerVolume * (CO2 Volume - 3.0378 + (0.050062 * BeerTemp) - (0.00026555 * (BeerTemp)squared))
                Double amountOfSugar = 15.195 * getGallonsOfBeer() * (co2Volume - 3.0378 + (0.050062 * Math.sqrt(getBeerTemperature())));
                System.out.println("Amount of Sugar" + amountOfSugar);
                return amountOfSugar;

                //Testing Pull Requests.....
        }
}
