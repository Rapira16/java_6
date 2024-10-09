package bikeproject;

public class Bike implements BikeParts {
    private String handleBars;
    private String frame;
    private String tyres;
    private String seatType;
    private int NumGears;
    private final String make;

    public Bike() {
        this.make = "Oracle Cycles";
    }

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        this.NumGears = numGears;
        this.make = "Oracle Cycles";
    }

    protected void printDescription() {
        System.out.println("\n" + this.make + "\n" + "This bike has " + this.handleBars + " handlebars on a " + this.frame + " frame with " + this.NumGears + " gears." + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
    }

    @Override
    public String getMake() {
        return this.make;
    }
}