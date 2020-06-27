package com.rohit.fragment_activity_communication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {

    private static final String TAG ="Communication";
    private FloatingActionButton floatingActionButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.showData);
        floatingActionButton = findViewById(R.id.fab);
        show();
    }

    private void show() {
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainFragment mainFragment = new MainFragment();
                getFragmentManager().beginTransaction().add(R.id.device_fragment, mainFragment).commit();
            }
        });
    }

    @Override
    public void onFragmentInteraction(Person person) {

        textView.setText(person.getname());
        textView.append(String.valueOf(person.getid()));
        textView.append(person.getemail());

        Log.d(TAG, "onFragmentInteraction: person " +person.toString());

    }


}
