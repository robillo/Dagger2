package com.robillo.dagger2.dagger;

import android.content.Context;

import com.robillo.dagger2.Dagger2Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by robinkamboj on 14/09/17.
 */

@Module
public class AppModule {

    private final Dagger2Application app;

    public AppModule(Dagger2Application app){
        this.app = app;
    }

    @Provides @Singleton
    public Context provideContext() {
        return app;
    }
}
