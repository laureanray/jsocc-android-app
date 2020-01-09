package com.laureanray.csc.app;

import android.app.Application;

public class App extends Application {
    private StateManager stateManager = new StateManager();

    public StateManager getStateManager() {
        return stateManager;
    }
}
