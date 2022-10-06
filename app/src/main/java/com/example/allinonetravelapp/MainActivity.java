package com.example.allinonetravelapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView maketrip_logo, goib_logo, irctc_logo, redbus_logo, yatra_logo,
            trivago_logo, airhub_logo, cleantrip_logo, expedia_logo,
            uber_logo, travelguru_logo, bookingcom_logo;
    String[] urls = new String[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initbind();
        inclick();
    }

    private void inclick() {

        urls[0] = "https://www.makemytrip.com/";
        urls[1] = "https://www.goibibo.com/";
        urls[2] = "https://www.irctc.co.in/";
        urls[3] = "https://m.redbus.in/";
        urls[4] = "https://www.yatra.com/";
        urls[5] = "https://www.trivago.in/";
        urls[6] = "https://www.airbnb.co.in/";
        urls[7] = "https://www.cleartrip.com/";
        urls[8] = "https://www.expedia.co.in/";
        urls[9] = "https://m.uber.com";
        urls[10] ="https://www.travelguru.com/";
        urls[11] = "https://www.booking.com/";
        maketrip_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[0]);
                startActivity(intent);
            }
        });
        goib_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[1]);
                startActivity(intent);
            }
        });
        irctc_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[2]);
                startActivity(intent);
            }
        });
        redbus_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[3]);
                startActivity(intent);
            }
        });
        yatra_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[4]);
                startActivity(intent);
            }
        });
        trivago_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[5]);
                startActivity(intent);
            }
        });
        airhub_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[6]);
                startActivity(intent);
            }
        });
        cleantrip_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[7]);
                startActivity(intent);
            }
        });
        expedia_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[8]);
                startActivity(intent);
            }
        });
        uber_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[9]);
                startActivity(intent);
            }
        });
        travelguru_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[10]);
                startActivity(intent);
            }
        });
        bookingcom_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                intent.putExtra("links", urls[11]);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialogp);


        Button yes  = dialog.findViewById(R.id.yes);
        Button no = dialog.findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


        dialog.show();
    }
    

    private void initbind() {
        maketrip_logo = findViewById(R.id.maketrip_logo);
        goib_logo = findViewById(R.id.goib_logo);
        irctc_logo = findViewById(R.id.irctc_logo);
        redbus_logo = findViewById(R.id.redbus_logo);
        yatra_logo = findViewById(R.id.yatra_logo);
        trivago_logo = findViewById(R.id.trivago_logo);
        airhub_logo = findViewById(R.id.airhub_logo);
        cleantrip_logo = findViewById(R.id.cleantrip_logo);
        expedia_logo = findViewById(R.id.expedia_logo);
        uber_logo = findViewById(R.id.uber_logo);
        travelguru_logo = findViewById(R.id.travelguru_logo);
        bookingcom_logo = findViewById(R.id.bookingcom_logo);


    }
}