public class BedRoom implements Room {
    public BedRoom() {

    }

    @Override
    public Wall createWall() {
        return new BedRoomWall();
    }

    @Override
    public Door createDoor() {
        return new BedRoomDoor();
    }
}