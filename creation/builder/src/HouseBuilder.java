public interface HouseBuilder {
    void BuildRoom(int roomNo);

    void BuildDoor(int room1, int room2);

    House getHouse();
}