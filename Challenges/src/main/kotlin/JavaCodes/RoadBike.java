package JavaCodes;

public class RoadBike extends Bicycle{
    private int tireWidth;
    public RoadBike(int gear, int cadence, int speed, int tireWidth){
        super(gear, cadence, speed);
        this.tireWidth = tireWidth;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The Road Bike has tire width of " + tireWidth);
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }
}
