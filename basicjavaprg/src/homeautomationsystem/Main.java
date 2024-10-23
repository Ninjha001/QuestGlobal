package homeautomationsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeviceController controller = new DeviceController();

        controller.addDevice(1, new Light());
        controller.addDevice(2, new Fan());
        controller.addDevice(3, new ThermoStat());

        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Enter Device ID (1 for Light, 2 for Fan, 3 for Thermostat): ");
        int deviceId = scanner.nextInt();
        
        System.out.println("Enter Command (ON/OFF): ");
        String command = scanner.next();
        
        
        if (deviceId == 1) { 
            System.out.println("Enter Brightness Level (in watts): ");
            int brightness = scanner.nextInt();
            controller.controlDevice(deviceId, command, brightness);
        } else if (deviceId == 2) { 
            System.out.println("Enter Speed Level (in kms): ");
            int speed = scanner.nextInt();
            controller.controlDevice(deviceId, command, speed);
        } else if (deviceId == 3) { 
            System.out.println("Enter Temperature (in °C): ");
            int temperature = scanner.nextInt();
            System.out.println("Enter Mode (Energy Saver/Turbo): ");
            String mode = scanner.next();
            controller.controlDevice(deviceId, command, temperature, mode);
        } else {
            System.out.println("Invalid Device ID.");
        }

        scanner.close();
    }
}
