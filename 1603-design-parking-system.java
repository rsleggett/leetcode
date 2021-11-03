class ParkingSystem {
    private int bigMax = 0;
    private int bigCount = 0;
    private int mediumMax = 0;
    private int mediumCount = 0;
    private int smallMax = 0;
    private int smallCount = 0;
    
    public ParkingSystem(int big, int medium, int small) {
        this.bigMax = big;
        this.mediumMax = medium;
        this.smallMax = small;
    }
    
    public boolean addCar(int carType) {
        boolean canPark = false;
        if (carType == 1 && bigCount < bigMax)
        {
            bigCount++;
            canPark = true;
        }
        else if (carType == 2 && mediumCount < mediumMax)
        {
            mediumCount++;
            canPark = true;
        }
        else if (carType == 3 && smallCount < smallMax)
        {
            smallCount++;
            canPark = true;
        }
        return canPark;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
