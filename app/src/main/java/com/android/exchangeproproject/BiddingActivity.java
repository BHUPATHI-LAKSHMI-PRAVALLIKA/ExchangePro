package com.android.exchangeproproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class BiddingActivity extends AppCompatActivity {

    private SearchView searchBar;
    private ListView resultsListView;
    private TextView currentBid;
    private Button placeBidButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidding);

        // Initialize views
        searchBar = findViewById(R.id.search_bar);
        resultsListView = findViewById(R.id.results_list_view);
        currentBid = findViewById(R.id.current_bid);
        placeBidButton = findViewById(R.id.place_bid_button);

        // sample items to display in the ListView
        List<String> dummyItems = new ArrayList<>();
        dummyItems.add("Item 1 - $100");
        dummyItems.add("Item 2 - $150");
        dummyItems.add("Item 3 - $200");
        dummyItems.add("Item 4 - $250");
        dummyItems.add("Item 5 - $300");

        // Adapter for the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dummyItems
        );

        // Set the adapter to the ListView
        resultsListView.setAdapter(adapter);

        // Handle item clicks on the ListView
        resultsListView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = (String) parent.getItemAtPosition(position);
            Toast.makeText(BiddingActivity.this, "Selected: " + selectedItem, Toast.LENGTH_LONG).show();
        });

        // Handle Place Bid Button Click
        placeBidButton.setOnClickListener(view -> {
            Toast.makeText(BiddingActivity.this, "Bid Placed", Toast.LENGTH_LONG).show();
        });
    }
}