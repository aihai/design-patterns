public class LivingRoom implements Room {
    public LivingRoom() {
    }

    @Override
    public Wall createWall() {
        return new LivingRoomWall();
    }

    @Override
    public Door createDoor() {
        return new LivingRoomDoor();
    }
}