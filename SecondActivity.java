package com.bignerdranch.android.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Объявляем объекты, которые будем использовать:
    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Привязываем объявленные объекты к созданным нами элементам в activity_second.xml:
        mResult=(TextView)findViewById(R.id.result);

        //Получаем текстовые данные с первого Activity:
        String StartSum = getIntent().getStringExtra("start_sum");
        String Time = getIntent().getStringExtra("time");
        String Procent = getIntent().getStringExtra("procent");
        String Capitalization = getIntent().getStringExtra("capitalization");

        //Преобразуем все строки в переменные типа int:
        int iStartSum = Integer.parseInt(StartSum);
        int iTime = Integer.parseInt(Time);
        int iProcent = Integer.parseInt(Procent);
        int iCapitalization = Integer.parseInt(Capitalization);

        double Result = iStartSum * Math.pow(1 + iProcent/iCapitalization, iTime);

        //Присваиваем созданным элементам TextView значение полученных текстовых данных:
        mResult.setText("" + Result);
    }
}
