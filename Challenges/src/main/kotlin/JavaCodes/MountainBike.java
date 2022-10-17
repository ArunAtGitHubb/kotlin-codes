package JavaCodes;

public class MountainBike extends Bicycle{
    private int seatHeight;
    public MountainBike(int gear, int cadence, int speed, int seatHeight ){
        super(gear, cadence, speed);
        this.seatHeight = seatHeight;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The Mountain Bike has seat height of " + seatHeight);
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
