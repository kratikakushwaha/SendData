package com.example.senddata;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MyFragment extends Fragment {
    TextView t1;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my, container, false);
        t1 = v.findViewById(R.id.text1);
        Bundle b3 = getArguments();
        String name = b3.getString("name");
        t1.setText(name);
        Log.w("msg","Oncreate()");
        setRetainInstance(true);
        return v;
    }


    void setmethod() {
      String daa=getArguments().getString("name");
       t1.setText(daa);
        Toast.makeText(getActivity(), "Method()", Toast.LENGTH_SHORT).show();

    }
}
