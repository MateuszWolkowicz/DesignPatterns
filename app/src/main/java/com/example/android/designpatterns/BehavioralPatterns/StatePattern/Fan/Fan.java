package com.example.android.designpatterns.BehavioralPatterns.StatePattern.Fan;

class Fan {
    State fanOffState;
    State fanLowState;
    State fanMedState;

    State state;


    public Fan() {
        this.fanOffState = new FanOffState(this);
        this.fanLowState = new FanLowState(this);
        this.fanMedState = new FanMedState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public void setState(State state) {
        this.state = state;

    }
}
