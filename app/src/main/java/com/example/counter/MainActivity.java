package com.example.counter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView counter_text;
    ImageView quote_image;
    Button btn;

    // Quote and image mapping
    String[] quoteArray = {
            "skibidi rizz",
            "umm actually",
            "what the Sigma",
            "ngl fr imo pcl",
            "hello my name is khan",
            "You are not a sigma",
            "seriously bro ?",
            "BOMBLAAACAAAT",
            "SIX SEVEN",
            "our brains are gone"
    };

    int[] imageArray = {
            R.drawable.quote1,  // Image for "Better days coming"
            R.drawable.quote2,  // Image for "I am better"
            R.drawable.quote3,  // Image for "Skibidi aah rizz"
            R.drawable.quote4,  // Image for "ngl fr imo pcl"
            R.drawable.quote5,
            R.drawable.quote6,
            R.drawable.quote7,
            R.drawable.quote8,
            R.drawable.quote9,
            R.drawable.quote10
    };

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        counter_text = findViewById(R.id.counter_text);
        quote_image = findViewById(R.id.quote_image);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomIndex = random.nextInt(quoteArray.length);
                counter_text.setText(quoteArray[randomIndex]);
                quote_image.setImageResource(imageArray[randomIndex]);
            }
        });
    }
}
