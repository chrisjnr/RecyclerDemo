package com.iconicdev.android.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person("Chris", "80");
        Person person2 = new Person("Bayo", "87");
        Person person3 = new Person("Temi", "67");
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        PeopleAdapter peopleAdapter = new PeopleAdapter(personList);
        peopleAdapter.notifyDataSetChanged();

        recyclerView.setAdapter(peopleAdapter);

    }
}
