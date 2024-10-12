package com.android.exchangeproproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListingManagementActivity extends AppCompatActivity {

    private EditText etTitle, etDescription, etPrice;
    private Button btnUploadImage, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_management);

        // Initialize views
        etTitle = findViewById(R.id.etTitle);
        etDescription = findViewById(R.id.etDescription);
        etPrice = findViewById(R.id.etPrice);
        btnUploadImage = findViewById(R.id.btnUploadImage);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Handle Upload Image button click (if needed)
        btnUploadImage.setOnClickListener(view -> {
            // Logic for uploading image (if required)
            // For now, let's just show a placeholder toast
            Toast.makeText(ListingManagementActivity.this, "Image Upload Placeholder", Toast.LENGTH_SHORT).show();
        });

        // Handle Submit Listing button click
        btnSubmit.setOnClickListener(view -> {
            // Get listing details from the input fields
            String title = etTitle.getText().toString().trim();
            String description = etDescription.getText().toString().trim();
            String price = etPrice.getText().toString().trim();

            // Add validation if required before submission

            // Navigate to TransactionInvoiceActivity
            Intent intent = new Intent(ListingManagementActivity.this, TransactionActivity.class);

            // Pass listing details to TransactionInvoiceActivity if needed
            intent.putExtra("title", title);
            intent.putExtra("description", description);
            intent.putExtra("price", price);

            startActivity(intent);
        });
    }
}
