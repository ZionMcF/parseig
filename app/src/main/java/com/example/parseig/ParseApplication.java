package com.example.parseig;
import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iTDit6uBVIN6wjqB0swExTAdpOFY0tbNGG9qcnOv")
                .clientKey("geCy24Y8eItOuwkjzqXnvj5awXuvUUNF4Y8MnqY9")
                .server("https://parseapi.back4app.com")
                .enableLocalDataStore()
                .build()
        );
    }
}
