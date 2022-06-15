package com.gzeinnumer.b5d7.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.gzeinnumer.b5d7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainVM vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        vm = new ViewModelProvider(this).get(MainVM.class);

//        vm.setStr("Zein");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                vm.setStr("Zein");
            }
        }, 2000);


        vm.getStr().observe(this, resource -> {
            Toast.makeText(getApplicationContext(), resource, Toast.LENGTH_LONG).show();
        });
    }

}