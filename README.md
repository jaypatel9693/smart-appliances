# Smart Home Appliance System

## Overview

A maven/java-based smart home appliance system.  
It controls different home appliances such as:

- Light
- Fan
- Air Conditioner

Each appliance has its own unique way of turning off.

The system also supports a yearly automatic update. During the update, all devices are turned off. The update happens every year on **January 1st at 1:00 AM local time**.

---

## Appliance Turn-Off Logic

### 1. Light
The light is turned off by toggling the switch to the **OFF** position.

```java
switchOn = false;

### 2. Fan
The fan is turned off by reducing the speed to 0.

Fan speed values:

- 0 = Off
- 1 = Low speed
- 2 = High speed

```java
speed = 0;

### 3. Air Conditioner
The air conditioner is turned off by setting the thermostat mode to OFF.

```java
thermostatMode = "off";

Compile Java files
```bash
mvn clean install

Run java program
```bash
java -jar target/smart-appliances-1.0-SNAPSHOT.jar