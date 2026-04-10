package Facade;

public class DoorFacade {
    private DoorOpen doorOpen;
    private DoorClose doorClose;
    private DoorLock doorLock;

    public DoorFacade(DoorOpen doorOpen, DoorClose doorClose, DoorLock doorLock) {
        this.doorOpen = doorOpen;
        this.doorClose = doorClose;
        this.doorLock = doorLock;
    }

    public void controlDoor() {
        doorOpen.open();
        doorClose.close();
        doorLock.lock();
    }

}
