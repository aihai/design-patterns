public class APP {
    public static void main(String[] args) {
        Room myLivingRoom = Room.createRoom("LivingRoom");
        Door livingDoor = myLivingRoom.createDoor();
        System.out.println(livingDoor.getName().equals("LivingRoomDoor"));
        Wall livingWall = myLivingRoom.createWall();
        System.out.println(livingWall.getName().equals("LivingRoomWall"));

        Room myBedRoom = Room.createRoom("BedRoom");
        Door BedDoor = myBedRoom.createDoor();
        System.out.println(BedDoor.getName().equals("BedRoomDoor"));
        Wall BedWall = myBedRoom.createWall();
        System.out.println(BedWall.getName().equals("BedRoomWall"));
    }
}
