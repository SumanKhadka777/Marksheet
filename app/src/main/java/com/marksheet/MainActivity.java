package com.marksheet;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.marksheet.result.Result;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etName,etAndroid,etIPC,etAPI;
    Button btnCalculate;
    TextView txtResult;

    String name;
    double android,IPC,API,percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName=findViewById(R.id.etName);
        etAndroid=findViewById(R.id.etAndroid);
        etIPC=findViewById(R.id.etIPC);
        etAPI=findViewById(R.id.etAPI);
        btnCalculate=findViewById(R.id.btnCalculate);
        txtResult=findViewById(R.id.txtResult);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if (TextUtils.isEmpty(etName.getText().toString()))
        {
            etName.setError("Enter Name");
            return;
        }else if(TextUtils.isEmpty(etAndroid.getText().toString()))
        {
            etAndroid.setError("Enter Android Mark");
            return;
        }
        else if(TextUtils.isEmpty(etAPI.getText().toString()))
        {
            etAPI.setError("Enter API Mark");
            return;
        }
        else if(TextUtils.isEmpty(etIPC.getText().toString()))
        {
            etIPC.setError("Enter IPC");
            return;
        }


        //
        name=etName.getText().toString();
        android=Double.parseDouble(etAndroid.getText().toString());
        IPC=Double.parseDouble(etAndroid.getText().toString());
        API=Double.parseDouble(etAndroid.getText().toString());

        //oject of class Result
        Result res=new Result(android,IPC,API);
        percent=res.percentage();
        txtResult.append("Name: " +name + "     Percentage: " + (int) percent +"%" +"\n"+ "\n");
        //clearing edit text
        etName.setText("");
        etAndroid.setText("");
        etIPC.setText("");
        etAPI.setText("");

    }
}