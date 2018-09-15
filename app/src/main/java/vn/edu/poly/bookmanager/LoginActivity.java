package vn.edu.poly.bookmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = edtUsername.getText().toString().trim();

                username = " ab c";
                if (username.equals("")) {
                    edtUsername.setError(getString(R.string.notify_empty_username));
                    return;
                }

                // Bo sung them cac buoc check du lieu khac


                // kiem tra hoan tat se chuyen sang man hinh


                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);


                // ket thuc man hinh Login
                finish();


            }
        });


    }

    public void initViews() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

    }

}


