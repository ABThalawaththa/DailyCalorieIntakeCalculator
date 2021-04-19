package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class MyCalorieRecords2 extends AppCompatActivity {
    private DatabaseReference databaseReference;
    private FirebaseAuth userAuth;
    private FirebaseUser currentUser;
    private CalorieRecordAdapter2 adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calorie_records2);

        userAuth = FirebaseAuth.getInstance();
        currentUser = userAuth.getCurrentUser();

        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        Query query =  FirebaseDatabase.getInstance().getReference("Calorie Records").child(currentUser.getUid());
        FirebaseRecyclerOptions<Daily_Calorie_Record> options = new FirebaseRecyclerOptions.Builder<Daily_Calorie_Record>().
                setQuery(query,Daily_Calorie_Record.class).build();
        adapter2 = new CalorieRecordAdapter2(options);

        RecyclerView recyclerView = findViewById(R.id.rv_calorie_record_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter2.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter2.stopListening();
    }
}