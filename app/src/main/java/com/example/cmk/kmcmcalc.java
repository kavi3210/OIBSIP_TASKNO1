package com.example.cmk;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Formatter;

public class kmcmcalc extends Fragment {
    View view;
    EditText edit;
    String str;
    TextView text,tv;
    Button Calculate;
    double a = 0.0, b = 0.0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.calculate_kmcmcalc, container, false);

        edit = view.findViewById(R.id.edit);
        Calculate = view.findViewById(R.id.Calculate);
        text = view.findViewById(R.id.dis);
        tv = view.findViewById(R.id.tv);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                str = edit.getText().toString();
                if (TextUtils.isEmpty(str)) {
                    edit.setError("Enter value");
                } else {
                    a = Float.parseFloat(str);
                    b = (float) (a * 100000);
                    Formatter fm = new Formatter();
                    fm.format("%.4f",b);
                    text.setText(str + " km = " + fm + " cm");
                    text.setVisibility(View.VISIBLE);
                }
            }

        });
        return view;
    }
}
