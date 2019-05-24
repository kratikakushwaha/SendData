package com.example.senddata;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b;
    MyFragment f;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager =getSupportFragmentManager();

         f= (MyFragment) fragmentManager.findFragmentByTag("tag1");
        fragmentTransaction =fragmentManager.beginTransaction();

        b=findViewById(R.id.btn1);
        e1=findViewById(R.id.ed1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(f==null) {

                    f = new MyFragment();
                    Bundle b2 = new Bundle();
                    b2.putString("name", e1.getText().toString());
                    f.setArguments(b2);
                    fragmentTransaction.add(R.id.frame, f,"tag1");
                    fragmentTransaction.commit();
                }

                else{

                    Bundle b2 = new Bundle();
                    b2.putString("name", e1.getText().toString());
                    f.setArguments(b2);
                    f.setmethod();
                }

            }
        });
    }
}
