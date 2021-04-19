package com.example.fitnessapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class CalorieRecordAdapter2 extends FirebaseRecyclerAdapter<Daily_Calorie_Record,CalorieRecordAdapter2.ViewHolder>{
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public CalorieRecordAdapter2(@NonNull FirebaseRecyclerOptions<Daily_Calorie_Record> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Daily_Calorie_Record model) {
        holder.tv_record_date.setText("Date = " + model.getCurrentDate());
        holder.tv_daily_carb_intake.setText("Total Daily Carbohydrate Intake = " + String.valueOf(model.getCarbIntake() + " g"));
        holder.tv_total_daily_calorie_intake.setText("Total Daily Calorie Intake = " + String.valueOf(model.getDailyCalorieIntake() + " Calories"));
        holder.tv_total_daily_protein_intake.setText("Total Daily Protein Intake = " + String.valueOf(model.getProteinIntake() + " g"));
        holder.tv_daily_fat_intake.setText("Total Daily Fat Intake = " + String.valueOf(model.getFatIntake() + " g"));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calorie_record_row,parent,false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_record_date, tv_total_daily_calorie_intake, tv_total_daily_protein_intake;
        TextView tv_daily_carb_intake, tv_daily_fat_intake;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_record_date = itemView.findViewById(R.id.tv_date_calorie_record_row);
            tv_total_daily_calorie_intake = itemView.findViewById(R.id.tv_calculated_total_daily_calorie_intake_row);
            tv_daily_carb_intake = itemView.findViewById(R.id.tv_calculated_daily_carb_intake_row);
            tv_daily_fat_intake = itemView.findViewById(R.id.tv_calculated_daily_fat_intake_row);
            tv_total_daily_protein_intake = itemView.findViewById(R.id.tv_calculated_daily_protein_intake_row);
        }
    }
}
