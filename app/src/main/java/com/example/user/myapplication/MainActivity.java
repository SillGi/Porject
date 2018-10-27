package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String str;
    EditText editText;
    TextView textView;
    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView3);
        editText=(EditText)findViewById(R.id.findtext);
        Button button=(Button)findViewById(R.id.findbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=editText.getText().toString();
                search(str);
            }
        });

    }

    public void search(String charText) {
        for(int i = 0;i < arrayList.size(); i++)
        {
            // arraylist의 모든 데이터에 입력받은 단어(charText)가 포함되어 있으면 true를 반환한다.
            if (arrayList.get(i).toLowerCase().contains(charText))
            {
                // 검색된 데이터를 리스트에 추가한다.
                Log.i("qwe", "search: "+arrayList.get(i).toString());
            }
        }
    }

}
