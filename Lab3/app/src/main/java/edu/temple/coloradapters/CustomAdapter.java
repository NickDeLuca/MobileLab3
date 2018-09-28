package edu.temple.coloradapters;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context c;
    int count;
    String[] colors;

    public CustomAdapter(Context c, int count, String[] colors){
        this.c = c;
        this.colors = colors;
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView t = new TextView(c);
        t.setBackgroundColor(Color.parseColor(colors[i]));
        t.setText(colors[i]);
        return t;
    }
}
