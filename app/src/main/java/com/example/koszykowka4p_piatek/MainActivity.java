package com.example.koszykowka4p_piatek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.koszykowka4p_piatek.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private PunktyViewModel punktyViewModel;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);


        binding.textViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(1);
                        binding.textViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(2);
                        binding.textViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(3);
                        binding.textViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
    }


}