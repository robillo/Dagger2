package com.robillo.dagger2;

import android.app.Application;

import com.robillo.dagger2.dagger.AppComponent;
import com.robillo.dagger2.dagger.AppModule;
import com.robillo.dagger2.dagger.DaggerAppComponent;

/**
 * Created by robinkamboj on 14/09/17.
 */

public class Dagger2Application extends Application {

    private static Dagger2Application instance = new Dagger2Application();
    private static AppComponent appComponent;

    public static Dagger2Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent();
    }

    public AppComponent getAppComponent() {
        if(appComponent == null){
            appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        }
        return appComponent;
    }
}
