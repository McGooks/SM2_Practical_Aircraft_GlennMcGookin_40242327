public class FighterJet extends Aircraft {
    private double machSpeed;

    public double getMachSpeed() {
        return machSpeed;
    }

    public void setMachSpeed(double machSpeed) {
        this.machSpeed = machSpeed;
    }


    public FighterJet(double machSpeed) {
        this.machSpeed = machSpeed;
    }

    public FighterJet(String name, boolean fixedWing, int wingSpan, double machSpeed) {
        super(name, fixedWing, wingSpan);
        this.machSpeed = machSpeed;
    }

    public FighterJet(){

    }

    @Override
    public void displayAll() {
        System.out.println("Aircraft" +
                "\nName\t\t" + getName() + "\nFixed wing\t\t" + isFixedWing() +
                "\nWingSpan\t\t" + getWingSpan() + "\nMach\t\t" + machSpeed);
    }

}
