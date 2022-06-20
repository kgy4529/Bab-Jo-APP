package com.amitshekhar.tflite;


import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.amitshekhar.tflite.recipe.RecipePage;
import com.amitshekhar.tflite.refri.AddPage;
import com.amitshekhar.tflite.refri.MyRefrigerator;
import com.amitshekhar.tflite.users.MyPage;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class RealMain extends AppCompatActivity {

    final String TAG = "Realmain";


    LinearLayout page;
    BottomNavigationView bottomNavigationView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_main);

        init(); //객체 정의
        SettingListener(); //리스너 등록

        bottomNavigationView.setSelectedItemId(R.id.my_ref); //맨처음 시작할 때 탭 설정


    }

    private void init(){
        page=findViewById(R.id.page);
        bottomNavigationView=findViewById(R.id.navigation);
    }

    private void SettingListener(){
        //선택 리스너 등록
        bottomNavigationView.setOnItemSelectedListener(new TabSelectedListener());
    }


    private class TabSelectedListener implements NavigationBarView.OnItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.my_ref:{
                    getSupportFragmentManager().beginTransaction().replace(R.id.page, new MyRefrigerator()) .commit();
                    //Fragment로 사용할 main 내의 layout 공간 선택
                    Log.i(TAG, "내 냉장고");
                    return true;
                }
                case R.id.add_f: {
                    getSupportFragmentManager().beginTransaction() .replace(R.id.page, new AddPage()) .commit();
                    Log.i(TAG, "재료추가");
                    return true;
                }
                case R.id.recipe: {
                    getSupportFragmentManager().beginTransaction() .replace(R.id.page, new RecipePage()) .commit();
                    Log.i(TAG, "레시피추천");
                    return true;
                }
                case R.id.mypage: {
                    getSupportFragmentManager().beginTransaction() .replace(R.id.page, new MyPage()) .commit();
                    Log.i(TAG, "마이페이지");
                    return true;
                }

            }
            return false;
        }
    }
}