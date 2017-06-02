package com.example.nson.readjson_contact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nson.readjson_contact.adapter.ContactAdapter;
import com.example.nson.readjson_contact.model.Contact;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements readJsonFromInternetListener{
    ListView lvContact;
    Button btnXemChitiet;
    ContactAdapter contactContactAdapter;
    ArrayList<Contact> arrayList= new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact= (ListView) findViewById(R.id.lv_contact);
        btnXemChitiet= (Button) findViewById(R.id.btnDetail);
        ReadJsonFromInternet readJsonFromInternet= new ReadJsonFromInternet();
        readJsonFromInternet.setReadJsonFromInternetListener(this);
        readJsonFromInternet.execute("http://api.androidhive.info/contacts/");
        contactContactAdapter= new ContactAdapter(this, R.layout.activity_contact, arrayList);
        lvContact.setAdapter(contactContactAdapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });

    }

    public void DocJSonContact(String s){
        try {
            JSONObject rootObject= new JSONObject(s);
            JSONArray jsonArray= rootObject.getJSONArray("contacts");
            for(int i= 0; i<jsonArray.length(); i++){
                JSONObject jsonObject= jsonArray.getJSONObject(i);
                String id= jsonObject.getString("id");
                String name= jsonObject.getString("name");
                String gender= jsonObject.getString("gender");
                JSONObject jsonObjectPhone= jsonObject.getJSONObject("phone");
                    String mobile = jsonObjectPhone.getString("mobile");
                arrayList.add(new Contact(id, name, gender, mobile));
                contactContactAdapter.notifyDataSetChanged();
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xulyJson(String s) {
        DocJSonContact(s);
    }
}
