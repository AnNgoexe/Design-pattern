package behavioralpattern.interpretor.context;

public class Context {
    private String aircraftModel = "";
    private boolean isAircraft = false;

    public Context(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public String getModel() {
        return this.aircraftModel;
    }

    public int getLength() {
        return this.aircraftModel.length();
    }

    public String getLastChar() {
        return Character.toString(this.aircraftModel.charAt(this.aircraftModel.length() - 1));
    }

    public String getFirstChar() {
        return Character.toString(this.aircraftModel.charAt(0));
    }

    public void setIsAircraft(boolean isAircraft) {
        this.isAircraft = isAircraft;
    }

    public boolean getIsAircraft() {
        return this.isAircraft;
    }
}
