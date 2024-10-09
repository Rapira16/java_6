package bikeproject;

public class MountainBike extends Bike implements MountainParts {
    private String suspension;
    private String type;

    public MountainBike() {
        super();
        this.suspension = "default";
        this.type = "default";
    }

    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears, String suspension, String type) {
        super(handleBars, frame, tyres, seatType, numGears);
        this.suspension = suspension;
        this.type = type;
    }

    @Override
    public void setSuspension(String newValue) {
        this.suspension = newValue;
    }

    @Override
    public String getSuspension() {
        return this.suspension;
    }

    @Override
    public void setType(String newValue) {
        this.type = newValue;
    }

    @Override
    public String getType() {
        return this.type;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("This Mountain Bike has " + this.suspension + " suspension and is of type " + this.type + ".");
    }
}