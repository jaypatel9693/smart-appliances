package com.example.appliances;

public class Fan implements Appliance {

    private int speed;

    public Fan(int speed) {
        setSpeed(speed);
    }

    public Fan() {

    }

    @Override
    public void turnOff() {
        System.out.println("Turned Off Fan");
        this.speed = 0;
    }

    // By factor of 1
    public void increaseSpeedBy1() {
        if (this.speed < 2) {
            this.speed = this.speed + 1;
        } else {
            System.out.println("Already at full speed");
        }
    }

    public void decreaseSpeedBy1() {
        if (this.speed > 0) {
            this.speed = this.speed - 1;
        }
    }
    
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (this.speed >= 0 && this.speed <= 2) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Speed cannot be more than 2 or less than 0");
        }
    }
}
