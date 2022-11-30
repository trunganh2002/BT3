package com.example.bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvThi;
    ArrayList<Thi> thiList;
    ThiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        thiList = new ArrayList<>();

        thiList.add(new Thi("Nam Cao", "Nam Cao là một nhà văn và cũng là một chiến sĩ, liệt sĩ người Việt Nam",R.drawable.namcao));
        thiList.add(new Thi("Xuân Diệu", "Ngô Xuân Diệu, là nhà thơ, nhà báo, nhà văn viết truyện ngắn và nhà phê bình văn học người Việt Nam.",R.drawable.home));
        thiList.add(new Thi("Mạc Ngôn", "Mạc Ngôn là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ ",R.drawable.macngon));
        thiList.add(new Thi("Huy Cận", "Cù Huy Cận, bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam",R.drawable.huycan));
        thiList.add(new Thi("Xuân Quỳnh", "Xuân Quỳnh, tên đầy đủ là Nguyễn Thị Xuân Quỳnh, là một nữ nhà thơ người Việt Nam. Bà nổi tiếng với nhiều bài thơ được nhiều người biết đến như Thuyền và biển",R.drawable.speaker));



        adapter = new ThiAdapter(this, thiList);
        lvThi.setAdapter(adapter);

        lvThi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Thi thi = thiList.get(position);

                Bundle bundle = new Bundle();

                bundle.putString("tenThi", thi.getTenThi());

                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
    }

    private void AnhXa(){
        lvThi = findViewById(R.id.listViewThi);
    }

}