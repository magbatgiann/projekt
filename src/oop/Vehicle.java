package oop;

public class Vehicle {
    private int passangers;
    private int fuelcap;
    private float mpg;
    private boolean working;

    //default constructor
    public Vehicle( ){
        passangers = 5;
        fuelcap = 50;
        mpg = 2;
        working = true;
    }
    public Vehicle(int passengers, int fuelcap, float mpg, boolean working){
        this.passangers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
        this.working = working;
    }

    public boolean isWorking() {
        return working;
    }

    //<editor-fold desc="Setters">
    public void setPassangers(int p) {
        this.passangers = p;
    }

    public void setFuelcap(int f) {
        this.fuelcap = f;
    }
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
    //</editor-fold>
    //<editor-fold desc="Getters">
    public int getPassangers() {
        return passangers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public float getMpg() {
        return mpg;
    }
    public float getRange(){
        return fuelcap * mpg;
    }
    //</editor-fold>

    public void setWorking(boolean working) {
        this.working = working;
    }

}
