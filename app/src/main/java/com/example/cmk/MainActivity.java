package com.example.cmk;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cmm(View view){
        calculate(new cmmcalc());
    }                   // CM to M
    public void mcm(View view){
        calculate(new mcmcalc());
    }                   // M to CM
    public void kmm(View view){
        calculate(new kmmcalc());
    }                   // KM to M
    public void mkm(View view){
        calculate(new mkmcalc());
    }                   // M to KM
    public void kmcm(View view){
        calculate(new kmcmcalc());
    }                 // KM to CM
    public void cmkm(View view){
        calculate(new cmkmcalc());
    }                 // KM to CM

    private void calculate(Fragment fragment) {

        FragmentManager fm = getFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.lay, fragment);
        fragmentTransaction.commit();
    }
}