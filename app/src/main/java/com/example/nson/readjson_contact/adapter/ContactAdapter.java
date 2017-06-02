package com.example.nson.readjson_contact.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nson.readjson_contact.R;
import com.example.nson.readjson_contact.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NSON on 02/06/2017.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {
    Context context;
    int resource;
    List<Contact> list;
    public ContactAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.list= objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder= new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.activity_contact, parent, false);
            viewHolder.imgAvartar= (ImageView) convertView.findViewById(R.id.imgAvatar);
            viewHolder.name= (TextView) convertView.findViewById(R.id.txtName);
            viewHolder.phone= (TextView) convertView.findViewById(R.id.txtphoneNumber);

            Contact contact= list.get(position);
            viewHolder.name.setText(contact.getName());
            viewHolder.phone.setText(contact.getPhoneMobile());
            if(contact.getGender().equalsIgnoreCase("male")){
                viewHolder.imgAvartar.setImageResource(R.drawable.male);
            }
            else if(contact.getGender().equalsIgnoreCase("female")){
                viewHolder.imgAvartar.setImageResource(R.drawable.female);
            }
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        return convertView;
    }
}
class ViewHolder{
    ImageView imgAvartar;
    TextView name, phone;
}
