package com.example.appliances;

public class AirConditioner implements Appliance {

    private String thermostateMode;

    public AirConditioner() {

    }

    public AirConditioner(String thermostateMode) {
        setThermostateMode(thermostateMode);
    }

    @Override
    public void turnOff() {
        System.out.println("Turned Off AC");
        this.thermostateMode = "off";
    }
    
    public void setThermostateMode(String mode) {
        if(isValidThermostateMode(mode)) {
            this.thermostateMode = mode;
        } else {
            throw new IllegalArgumentException("Mode can only be [Cool, Heat, Off]");
        }
    }

    public String getThermostateMode() {
        return this.thermostateMode;
    }

    private boolean isValidThermostateMode(String mode) {
        return "cool".equalsIgnoreCase(mode) ||
            "heat".equalsIgnoreCase(mode) ||
            "off".equalsIgnoreCase(mode);
    }
    
}
