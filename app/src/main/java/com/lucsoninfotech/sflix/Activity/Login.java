package com.lucsoninfotech.sflix.Activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.lucsoninfotech.sflix.R;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_facebook = findViewById(R.id.btn_facebook);
        Button btn_gmail = findViewById(R.id.btn_gmail);
        Button btn_twitter = findViewById(R.id.btn_twitter);
        Button btn_flix = findViewById(R.id.btn_flix);

        btn_facebook.setOnClickListener(this);
        btn_gmail.setOnClickListener(this);
        btn_twitter.setOnClickListener(this);
        btn_flix.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_flix:
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_mobile_login);
                dialog.setTitle("Login Using" + getString(R.string.app_name));
                // set the custom dialog components - text, image and button
                final EditText mobile = dialog.findViewById(R.id.editTextMobile);
                Button dialogButton = dialog.findViewById(R.id.buttonContinue);
                dialog.setCancelable(false);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String Mobile = mobile.toString().trim();
                        if (Mobile.equals("")) {
                            mobile.setError(getString(R.string.error_mobile_number));
                        } else {
                           // VerifyMobile(Mobile);
                            dialog.dismiss();
                        }
                        //                dialog.dismiss();
                    }
                });

                dialog.show();

                break;
        }
    }

    private void VerifyMobile(String mobile) {

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
