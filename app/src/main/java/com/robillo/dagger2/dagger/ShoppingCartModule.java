package com.robillo.dagger2.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.robillo.dagger2.ShoppingCart;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by robinkamboj on 14/09/17.
 */

@Module
public class ShoppingCartModule {

    @Provides @Singleton
    SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides @Singleton
    ShoppingCart provideShoppingCart(SharedPreferences preferences) {
        return new ShoppingCart(preferences);
    }
}
