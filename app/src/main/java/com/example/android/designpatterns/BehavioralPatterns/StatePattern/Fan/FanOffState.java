package com.example.android.designpatterns.BehavioralPatterns.StatePattern.Fan;

class FanOffState extends State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getFanLowState());
    }

    public String toString() {
       return "Fan is off";
    }

}
