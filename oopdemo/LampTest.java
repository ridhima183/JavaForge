package oopdemo;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 9:23:13 AM
 * Email : sirinandini.a@gmail.com
 */

// 1. Instance Class (Renamed to Lamp to avoid naming conflict)
class Lamp {

    // stores the value for light
    // true if light is on
    // false if light is off
    private boolean isOn;

    // method to turn on the light
    public void turnOn() {
        isOn = true;
        System.out.println("Light On? " + isOn);
    }

    // method to turn off the light
    public void turnOff() {
        isOn = false;
        System.out.println("Light On? " + isOn);
    }
}

// 2. Main Class (Keeps the filename LampTest)
public class LampTest {

    public static void main(String[] args) {

        // Instantiate objects using the Lamp class
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        System.out.println("--- Turning Lights On ---");
        led.turnOn();
        halogen.turnOn();

        System.out.println("\n--- Turning Lights Off ---");
        led.turnOff();
        halogen.turnOff();
    }
}
