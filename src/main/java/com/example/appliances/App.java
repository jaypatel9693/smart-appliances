package com.example.appliances;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Appliance> appliances = new ArrayList<>();

        Appliance light = new Light(true);
        Appliance fan = new Fan(2);
        Appliance airConditioner = new AirConditioner("Cool");

        appliances.add(light);
        appliances.add(fan);
        appliances.add(airConditioner);

        SmartHome home = new SmartHome(appliances);

        // This can be called on Jan 1st
        home.turnOffAllDevices();
    }
}
