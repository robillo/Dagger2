package com.robillo.dagger2;

import com.robillo.dagger2.model.LineItem;
import com.robillo.dagger2.model.Product;

import javax.inject.Inject;

/**
 * Created by robinkamboj on 14/09/17.
 */

public class ProductPresenter {

    //We are creating a class member variable for the
    //Shopping cart that we will be injecting to this class
    @SuppressWarnings("WeakerAccess")
    @Inject
    ShoppingCart mCart;

    public ProductPresenter(){
        //Here is where the actual injection takes place
        Dagger2Application.getInstance().getAppComponent().inject(this);
    }

    //Here is an example of how we are using the injected shopping cart
    public void onItemQuantityChanged(LineItem item, int qty) {
        mCart.updateItemQty(item, qty);
    }

    //Another example of using the shopping cart
    public void onAddToCartButtonClicked(Product product) {
        //perform add to checkout button here
        LineItem item = new LineItem(product, 1);
        mCart.addItemToCart(item);
    }

    public void onClearButtonClicked() {
        mCart.clearShoppingCart();
    }

    public void onDeleteItemButtonClicked(LineItem item) {
        mCart.removeItemFromCart(item);
    }
}
