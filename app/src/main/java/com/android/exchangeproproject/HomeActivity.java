package com.android.exchangeproproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    private Button btnBrowse, btnCreateListing, btnProfile;
    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize views
        btnBrowse = findViewById(R.id.btnBrowse);
        btnCreateListing = findViewById(R.id.btnCreateListing);
        btnProfile = findViewById(R.id.btnProfile);
        tvWelcome = findViewById(R.id.tvWelcome);

        // Handle Browse Listings Button Click
        btnBrowse.setOnClickListener(view -> {
            // Navigate to SearchBiddingActivity
            Intent intent = new Intent(HomeActivity.this, BiddingActivity.class);
            startActivity(intent);
        });

        // Handle Create Listing Button Click
        btnCreateListing.setOnClickListener(view -> {
            // Navigate to CreateListingActivity
            Intent intent = new Intent(HomeActivity.this, ListingManagementActivity.class);
            startActivity(intent);
        });

        // Handle Manage Profile Button Click
        btnProfile.setOnClickListener(view -> {
            // Navigate to ProfileActivity
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}

