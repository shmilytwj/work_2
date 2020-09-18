package com.example.work_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final int REQUEST_CODE_STUDENT_ZHANGSAN = 0;
    final int REQUEST_CODE_STUDENT_LISI = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1=(Button)findViewById(R.id.Button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("text","zhangsan");
                startActivityForResult(intent,REQUEST_CODE_STUDENT_ZHANGSAN);
            }
        });
        Button bt2=(Button)findViewById(R.id.Button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,TeacherActivity.class);
                intent.putExtra("text","lisi");
                startActivityForResult(intent,REQUEST_CODE_STUDENT_LISI);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str, Toast.LENGTH_LONG).show();

        }
        else if(requestCode==1 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str, Toast.LENGTH_LONG).show();
    }
}
}