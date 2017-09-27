package com.robillo.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.robillo.dagger2.model.Product;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ProductListContract.View{

    //Implementing View Corresponding To The Dagger Implementation

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showProducts(List<Product> products) {

    }

    @Override
    public void showAddProductForm() {

    }

    @Override
    public void showEditProductForm(Product product) {

    }

    @Override
    public void showDeleteProductPrompt(Product product) {

    }

    @Override
    public void showGoogleSearch(Product product) {

    }

    @Override
    public void showEmptyText() {

    }

    @Override
    public void hideEmptyText() {

    }

    @Override
    public void showMessage(String message) {

    }
}
