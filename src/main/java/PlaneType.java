public enum PlaneType {

    BOEING747(312,800),
    DREAMLINER787(400, 1000),
    BOEING737(122,300);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getPlaneTypeCapacity(){
        return this.capacity;
    }

    public int getPlaneTypeTotalWeight(){
        return this.totalWeight;
    }
}
