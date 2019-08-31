package com.iconicdev.android.recyclerdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeopleAdapter   extends RecyclerView.Adapter<PeopleAdapter.Viewholder> {

    List<Person> personList;

    public PeopleAdapter(List<Person> personList) {

        this.personList = personList;
    }

    @NonNull
    @Override
    public PeopleAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.person_viewholder, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleAdapter.Viewholder holder, int position) {

        Person person = personList.get(position);

        holder.tvName.setText(person.name);
        holder.tvAge.setText(person.age);



    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        TextView tvAge;
        TextView tvName;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            tvAge = itemView.findViewById(R.id.ageTv);
            tvName = itemView.findViewById(R.id.nameTv);
        }
    }
}
