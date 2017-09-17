package com.robillo.dagger2.dagger;

import com.robillo.dagger2.MainActivity;
import com.robillo.dagger2.ProductListPresenter;
import com.robillo.dagger2.ProductListener;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by robinkamboj on 14/09/17.
 */

@Singleton
@Component(
        modules = {
                AppModule.class,
                ShoppingCartModule.class
        }
)
public interface AppComponent {
    void inject(ProductListener presenter);
    void inject(MainActivity activity);
    void inject(ProductListPresenter presenter);
}
