package com.example.junjian20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abc(View view){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        frg1 f1=new frg1();
        frg2 f2=new frg2();
        frg3 f3=new frg3();
        frg4 f4=new frg4();

        switch (view.getId()){
            case R.id.faxian:
                ft.replace(R.id.lv,f1);
                break;
            case R.id.zixun:
                ft.replace(R.id.lv,f2);
                break;
            case R.id.kepu:
                ft.replace(R.id.lv,f3);
                break;
            case R.id.wode:
                ft.replace(R.id.lv,f4);
                break;
        }
        ft.commit();


    }




    }