package com.dcht69.demoapplicationcontext1.demo;

import android.app.Application;

public class App extends Application {
    private static App instance;
    private Storage storage;

    public Storage getStorage() {
        return storage;
    }

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        storage = new Storage();
        instance = this;

    }
}
