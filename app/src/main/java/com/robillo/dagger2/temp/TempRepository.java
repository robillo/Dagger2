package com.robillo.dagger2.temp;

import com.robillo.dagger2.ProductListContract;
import com.robillo.dagger2.model.Product;

import java.util.List;

/**
 * Created by robinkamboj on 27/09/17.
 */

public class TempRepository implements ProductListContract.Repository{

    public TempRepository() {
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }
}
