package com.example.listviewforjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ListViewに表示するリスト項目をArrayListで準備する
        ArrayList<String> data = new ArrayList<>();
        data.add("国語");
        data.add("社会");
        data.add("算数");
        data.add("理科");
        data.add("生活");
        data.add("音楽");
        data.add("図画工作");
        data.add("家庭");
        data.add("体育");

        // リスト項目とListViewを対応付けるArrayAdapterを用意する
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        // ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}