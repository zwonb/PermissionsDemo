package com.zwonb.permissionsdemo;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends BaseActivityPermissions {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    private void startActivity() {
        startActivity(new Intent(this, Main3Activity.class));
    }

    public void start3(View view) {
        super.checkPermissions(new PermissionCallBack() {
                                   @Override
                                   public void acceptAll() {
                                       startActivity();
                                   }

                                   @Override
                                   public void dialogCancel() {
                                       Toast.makeText(Main2Activity.this, "取消Dialog", Toast.LENGTH_SHORT).show();
                                   }
                               },
                Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION);
    }


}
