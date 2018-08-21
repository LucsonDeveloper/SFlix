package com.lucsoninfotech.sflix.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.lucsoninfotech.sflix.R;

public class Mobile_Verification_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_verification);
        EditText verifymobile = findViewById(R.id.editTextCode);
        String Verify = verifymobile.toString().trim();
        if (Verify.equals("")) {
            verifymobile.setError(getString(R.string.enter_verification_code));
        } else {
            if (Config.isOnline(this)) {

            } else {
                Toast.makeText(this, "Please Check Your Network Connection", Toast.LENGTH_SHORT).show();
            }

        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
