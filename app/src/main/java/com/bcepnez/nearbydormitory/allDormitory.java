package com.bcepnez.nearbydormitory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class allDormitory extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_dormitory);

        int[] resId = { R.drawable.logo_kmutt
                , R.drawable.cpe30th, R.drawable.logo_kmutt
                , R.drawable.cpe30th, R.drawable.logo_kmutt
                , R.drawable.cpe30th, R.drawable.logo_kmutt
                , R.drawable.cpe30th, R.drawable.logo_kmutt
                , R.drawable.cpe30th, R.drawable.logo_kmutt };

        String[] list = { "คอสโมแมนชั่น", "สราญสุข การ์เด้น คอร์ท", "My place 1"
                , "My place 2", "รัชสิทธิ์ วิว", "สุขวัฒน์อพาร์ทเมนท์", "มาเรียน"
                , "เดอะเรสซิเดนท์", "หอพักหญิงเฌอบุญ", " U residence"
                , "44 Garden Place"};
        Adapter adapter = new Adapter(getApplicationContext(),list,resId);
        ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent I = new Intent(allDormitory.this,Detail.class);
                startActivity(I);
            }
        });
    }
}
