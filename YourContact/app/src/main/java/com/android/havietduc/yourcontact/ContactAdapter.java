package com.android.havietduc.yourcontact;

import android.app.Activity;
//import android.content.Context;
//mport android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
//import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by havietduc on 12/2/16.
 */

public class ContactAdapter extends ArrayAdapter {

    private Activity context;
    private int resource;
    private List objects;

    private TextView tvName, tvPhone,tvEmail;
    private ImageButton btnCall, btnMsg;

  public ContactAdapter(Activity context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View item = inflater.inflate(this.resource, null);

        tvName = (TextView) item.findViewById(R.id.tvwName);
        tvPhone = (TextView) item.findViewById(R.id.tvwPhone);
        tvEmail = (TextView) item.findViewById(R.id.tvwEmail);

        btnCall = (ImageButton) item.findViewById(R.id.btnCall);
        btnMsg = (ImageButton) item.findViewById(R.id.btnEmail);

        Contact contact = (Contact) this.objects.get(position);
        tvName.setText(contact.getFname());
        tvPhone.setText(contact.getPhone());
        tvEmail.setText(contact.getEmail());
        
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallAnyoneProcess();
            }
        });
        
        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendMsg4AnyoneProcess();
            }
        });
;       return item;
    }

    private void SendMsg4AnyoneProcess() {
    }

    private void CallAnyoneProcess() {
    }
}
