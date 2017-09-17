package com.robillo.dagger2;

import com.robillo.dagger2.model.Product;

import java.util.List;

/**
 * Created by robinkamboj on 17/09/17.
 */

public class ProductListContract {

    public interface View {
        void showProducts(List<Product> products);
        void showAddProductForm();
        void showEditProductForm(Product product);
        void showDeleteProductPrompt(Product product);
        void showGoogleSearch(Product product);
        void showEmptyText();
        void hideEmptyText();
        void showMessage(String message);
    }

    public interface Actions {
        void loadProducts();
        void onAddProductButtonClicked();
        void onAddToCartButtonClicked(Product product);
        Product getProduct(long id);
        void addProduct(Product product);
        void onDeleteProductButtonClicked(Product product);
        void deleteProduct(Product product);
        void onEditProductButtonClicked(Product product);
        void updateProduct(Product product);
    }

    public interface Repository {
        List<Product> getAllProducts();
        Product getProductById(long id);
        void deleteProduct(Product product);
        void addProduct(Product product);
        void updateProduct(Product product);

    }
}
