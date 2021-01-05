package com.example.adopet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class GotoMyProfileActivity<DeleteSnow> extends AppCompatActivity {

    private Button DeleteSnow, DeleteFluffy, EditSnow, EditFluffy;
    private ProgressDialog loadingBar;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goto_my_profile);

        DeleteSnow = (Button) findViewById(R.id.btn_delete_Snow);
        DeleteFluffy = (Button) findViewById(R.id.btn_delete_Fluffy);
        EditSnow = (Button) findViewById(R.id.btn_edit_Snow);
        EditFluffy = (Button) findViewById(R.id.btn_edit_Fluffy);
    }

    public void deleteSnow(View v){

    }
}