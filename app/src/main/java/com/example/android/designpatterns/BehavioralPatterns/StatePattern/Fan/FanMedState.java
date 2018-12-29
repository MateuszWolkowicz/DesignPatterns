package com.example.android.designpatterns.BehavioralPatterns.StatePattern.Fan;

class FanMedState extends State {
    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to off.");
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is med";
    }
}
