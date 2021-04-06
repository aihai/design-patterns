public interface Room {

    Wall createWall();

    Door createDoor();

    static Room createRoom(String roomType) {
        switch (roomType) {
            case "LivingRoom":
                return new LivingRoom();
            case "BedRoom":
                return new BedRoom();
            default:
                throw new IllegalArgumentException("type not supported");
        }
    }
}