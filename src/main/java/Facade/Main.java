package Facade;

public class Main {
    public static void main(String[] args) {
        DoorOpen doorOpen = new DoorOpen();
        DoorClose doorClose = new DoorClose();
        DoorLock doorLock = new DoorLock();

       DoorFacade doorFacade = new DoorFacade(doorOpen, doorClose, doorLock);
       doorFacade.controlDoor();


    }
}
