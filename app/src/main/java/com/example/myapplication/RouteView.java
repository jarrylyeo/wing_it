package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class RouteView extends AppCompatActivity {

    // this class should show the order for users to proceed their days in

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routeview);

        Intent incomingIntent = getIntent();
        ArrayList<String> incoming_List222 = incomingIntent.getStringArrayListExtra("name");
        //calculateSSSP(list);
    }

    /*private void calculateSSSP(ArrayList<String> list) {

    }
    */
}
