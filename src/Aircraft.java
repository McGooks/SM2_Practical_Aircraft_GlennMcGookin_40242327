public class Aircraft {
    private String name;
    private boolean fixedWing;
    private int wingSpan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFixedWing() {
        return fixedWing;
    }

    public void setFixedWing(boolean fixedWing) {
        this.fixedWing = fixedWing;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        if(wingSpan < 1 || wingSpan > 80){
            this.wingSpan = 1;
            System.out.println("Wing Span is outside of the acceptable range");
        }
        this.wingSpan = wingSpan;
    }

    public Aircraft(String name, boolean fixedWing, int wingSpan) {
        this.name = name;
        this.fixedWing = fixedWing;
        this.wingSpan = wingSpan;
    }

    public Aircraft(){

    }

    @Override
    public void displayAll() {
        System.out.println("Aircraft" +
                "\nName\t\t" + name + "\nFixed wing\t\t" + fixedWing +
                "\nWingSpan\t\t" + wingSpan);
    }
}
