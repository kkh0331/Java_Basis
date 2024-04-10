package day05.practice01;

public class TrashRobot extends TrashMachine implements Moveable {
    private Location base;

    public TrashRobot(Location base) {
        super("ROBOT", null, base);
        this.base = base;
    }

    @Override
    public void moveTo(TrashMachineable trashMachine) {
        this.currentLocation = trashMachine.getCurrentLocation();
    }

    @Override
    public Location getCurrentLocation() {
        return null;
    }
}
