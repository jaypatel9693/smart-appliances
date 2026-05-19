package com.example.appliances;

import java.util.List;

public class SmartHome {
    private List<Appliance> appliances;

    public SmartHome(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public void turnOffAllDevices() {
        this.appliances.forEach(appliances -> appliances.turnOff());
        System.out.println("Turned Off All devices");
    }

}
