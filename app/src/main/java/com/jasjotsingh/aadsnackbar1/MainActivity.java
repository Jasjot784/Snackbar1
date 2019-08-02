package com.jasjotsingh.aadsnackbar1;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup ConstraintLayout = findViewById(R.id.ConstraintLayout);
        Snackbar snackbar = Snackbar
                .make(ConstraintLayout, "Jasjot Singh", Snackbar.LENGTH_INDEFINITE);
        snackbar.show();
    }
}
