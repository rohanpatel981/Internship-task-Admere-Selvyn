package com.example.hunger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Login_screen_3 extends AppCompatActivity {
    Button btnproceed;
    EditText editTextphone,editTextpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen_3);

        Button btnproceed = findViewById(R.id.btn_proceed);
         editTextphone = findViewById(R.id.editTextPhone);

         editTextpass = findViewById(R.id.editTextTextPassword);


        btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postRequest();
            }
        });

    }

    public void postRequest(){
        RequestQueue requestQueue = Volley.newRequestQueue(Login_screen_3.this);
        String url = "https://mekvahan.com/api/android_intern_task";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(Login_screen_3.this, response, Toast.LENGTH_SHORT).show();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Login_screen_3.this, error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("mobile",editTextphone.getText().toString());
                params.put("password",editTextpass.getText().toString());
                return params;

            }

            @Override
            public Map<String,String> getHeaders() throws AuthFailureError{
                Map<String,String> params = new HashMap<String, String>();
                params.put("Context-Type","application/x-www-form-urlencoded");
                return params;

            }
        };

        requestQueue.add(stringRequest);


    }
}