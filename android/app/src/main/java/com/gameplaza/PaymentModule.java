package com.gameplaza;

import com.globalcharge.android.PaymentListener;
import com.globalcharge.android.BillingManager;
import android.support.v7.app.AppCompatActivity;
import com.globalcharge.android.products.Product;

import android.widget.Toast;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


import java.util.List;
import java.util.Random;

public class PaymentModule extends ReactContextBaseJavaModule implements PaymentListener {
    public PaymentModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public String getName() {
        return "PaymentModule";
    }


    @ReactMethod
    public void onFailure(String message) {
        Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @ReactMethod
    public void onProductsReceived(List products) {
        //no-op
    }

    @ReactMethod
    public void onProductSelected(Product product) {

    }

    @ReactMethod
    public void onCancelled() {

    }

    @ReactMethod
    public void onSuccess(int subscriptionID) {

    }

    @ReactMethod
    public void onPaymentStateChanged(String state) {

    }

    @ReactMethod
    public void onSubscriptionCancelSuccess(String a, String b, String c) {

    }

    @ReactMethod
    public void onSubscriptionCancelFailure(String a, String b, String c) {

    }


}