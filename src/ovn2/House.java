package ovn2;

import oop.Adress;

public class House {

    double squareMeters;
    int floorCount;
    int value;
    int constructionYear;
    Adress adress;

    public House(double squareMeters, int floorCount, int value, int constructionYear, Adress adress) {
        this.squareMeters = squareMeters;
        this.floorCount = floorCount;
        this.value = value;
        this.constructionYear = constructionYear;
        this.adress = adress;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "House{" +
                "squareMeters=" + squareMeters +
                ", floorCount=" + floorCount +
                ", value=" + value +
                ", constructionYear=" + constructionYear +
                ", adress=" + adress +
                '}';
    }
}