package com.example.android.designpatterns.StructuralPatterns.BridgePattern.RemoteControlersAndDevices;

import com.example.android.designpatterns.StructuralPatterns.BridgePattern.RemoteControlersAndDevices.devices.Device;
import com.example.android.designpatterns.StructuralPatterns.BridgePattern.RemoteControlersAndDevices.devices.Radio;
import com.example.android.designpatterns.StructuralPatterns.BridgePattern.RemoteControlersAndDevices.devices.TV;
import com.example.android.designpatterns.StructuralPatterns.BridgePattern.RemoteControlersAndDevices.remotes.AdvancedRemote;
import com.example.android.designpatterns.StructuralPatterns.BridgePattern.RemoteControlersAndDevices.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
