package com.example.serenitea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {
/* Trang Profile của user
- Trang này chỉ để show info, nếu muốn update info thì gọi hàm SendUserToSetupActivity() để chuyển sang trang Setup
* Hàm chính:
- Lấy từ database, show ra màn hình các info user
- Một số hàm SendUserTo...Activity()
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}