package app.media.vn.appsin.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import app.media.vn.appsin.R;

public class LoginActivity extends AppCompatActivity {
    private EditText mEdtUsername;
    private EditText mEdtPassword;
    private Button mBtnLogin;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEdtUsername = findViewById(R.id.mEdtUsername);
        mEdtPassword = findViewById(R.id.mEdtPassword);
        mBtnLogin = findViewById(R.id.mBtnLogin);
        login();
    }

    private void login() {
        username = mEdtUsername.getText().toString().trim();
        password = mEdtPassword.getText().toString().trim();
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.isEmpty() || password.isEmpty()) {
                    showToast("Vui lòng nhập đầy đủ thông tin");
                } else {

                }
            }
        });
    }

    private void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
