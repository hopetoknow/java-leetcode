package com.hopetoknow._1603_design_parking_system;

class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1 -> {
                if (big > 0) {
                    big--;
                    return true;
                }
            }
            case 2 -> {
                if (medium > 0) {
                    medium--;
                    return true;
                }
            }
            case 3 -> {
                if (small > 0) {
                    small--;
                    return true;
                }
            }
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */

class ParkingSystem2 {
    private int[] slots;

    public ParkingSystem2(int big, int medium, int small) {
        slots = new int[] {big, medium, small};
    }

    public boolean addCar(int carType) {
        return slots[carType - 1]-- > 0;
    }
}
