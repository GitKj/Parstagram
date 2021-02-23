package com.example.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate()
    {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("u65jiMONyCfdQzFYYyBcrAZbzgrSN4jOQFJdQOGu")
                .clientKey("rKQe76SC3SbQfdaI4i0GwH8CiU9Bl7I5oOqvPqOf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
