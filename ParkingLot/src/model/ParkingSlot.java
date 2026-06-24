package model;

public class ParkingSlot extends BaseEntity{

    private String slotNumber;

    private VehicleType allowedType;

    private ParkingSlotStatus status;

    private Vehicle vehicle;

    // bidirectional
    private ParkingFloor floor;
}
