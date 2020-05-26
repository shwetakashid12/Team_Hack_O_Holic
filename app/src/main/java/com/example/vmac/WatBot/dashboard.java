package com.example.vmac.WatBot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class dashboard extends AppCompatActivity {
ImageView I1,I2,I3,I4;
Button bot,b2;
ViewFlipper v_flip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        v_flip = findViewById(R.id.a);


        I1=findViewById(R.id.count);
        I2=findViewById(R.id.News);
        I3=findViewById(R.id.Stress);
        I4=findViewById(R.id.Helpline);

        bot=findViewById(R.id.btn_bot);

        int img1[] = {R.drawable.mask, R.drawable.sanitize, R.drawable.soap, R.drawable.wash_hands, R.drawable.handshake, R.drawable.social_distancing};

        for (int image : img1) {
            Slideimgs(image);
        }

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,MainActivity.class);
                startActivity(i);
            }
        });
        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,Rumour.class);
                startActivity(i);
            }
        });
        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,MainActivity.class);
                startActivity(i);
            }
        });
        I4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,helpline.class);
                startActivity(i);
            }
        });
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
    public void Slideimgs(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flip.addView(imageView);
        v_flip.setFlipInterval(3000);
        v_flip.setAutoStart(true);
    }
}
