package com.example.sqlitedemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.sqlitedemo.R;
import com.example.sqlitedemo.entity.Insert;

import java.util.List;

public class InsertAdapter  extends BaseAdapter {
    private List<Insert> inserts;
    private int selectItem=-1;
    @Override
    public int getCount() {
        return inserts.size();
    }

    @Override
    public Object getItem(int position) {
        return inserts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);

        return convertView;
    }
}
