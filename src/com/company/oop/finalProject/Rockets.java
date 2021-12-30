package com.company.oop.finalProject;

public class Rockets implements SpaceShip{
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return true;

    }
//    @Override
//    public Item carry(Item item) {
//        return item.;
//    }
}
