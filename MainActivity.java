package com.bignerdranch.android.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Объявляем объекты, которые будем использовать:
    private Button mCalculateButton;
    private EditText mStartSum;
    private EditText mTime;
    private EditText mProcent;
    private EditText mCapitalization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Привязываем объявленные объекты к созданным элементам в activity_main.xml:
        mStartSum = (EditText) findViewById(R.id.StartSum);
        mTime = (EditText) findViewById(R.id.Time);
        mProcent = (EditText) findViewById(R.id.Procent);
        mCapitalization = (EditText) findViewById(R.id.Capitalization);
        mCalculateButton = (Button) findViewById(R.id.butCalculate);
    }

        //Обрабатываем нажатие кнопки "Рассчитать"
        public void onClick(View view) {
        switch (view.getId()) {
            case R.id.butCalculate:
                //Создаем переход:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //Создаем данные для передачи:
                intent.putExtra("start_sum", mStartSum.getText().toString());
                intent.putExtra("time", mTime.getText().toString());
                intent.putExtra("procent", mProcent.getText().toString());
                intent.putExtra("capitalization", mCapitalization.getText().toString());
                //Запускаем переход:
                startActivity(intent);
                break;
            default: break;
        }
    }}
