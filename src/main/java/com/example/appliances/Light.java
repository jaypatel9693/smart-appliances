package com.example.appliances;

public class Light implements Appliance {

    private boolean state;

    public Light() {}

    public Light(boolean state) {
        this.state = state;
    }

    public void turnOn() {
        this.state = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turned Off lights");
        this.state = false;
    }

    public boolean getState() {
        return this.state;
    }
    
}
