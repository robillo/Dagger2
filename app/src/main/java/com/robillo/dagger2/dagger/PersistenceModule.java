package com.robillo.dagger2.dagger;

import android.content.Context;

import com.robillo.dagger2.ProductListContract;
import com.robillo.dagger2.temp.TempRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by robinkamboj on 27/09/17.
 */

@Module
public class PersistenceModule {
    @Provides
    public ProductListContract.Repository providesProductRepository(Context context){
        return new TempRepository();
    }

}