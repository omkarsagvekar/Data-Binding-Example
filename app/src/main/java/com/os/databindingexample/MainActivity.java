package com.os.databindingexample;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.os.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    //View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //view = binding.main.getRootView();
        InfoModel infoModel = new InfoModel("Steve", "Harrington", "helloworld@gmail.com");
        binding.setTestData(infoModel);

    }
}