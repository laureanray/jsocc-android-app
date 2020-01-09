package com.laureanray.csc.app;

public class StateManager {

    private boolean isLoggedIn;

    StateManager() {
        // Do things here
        isLoggedIn = true;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
