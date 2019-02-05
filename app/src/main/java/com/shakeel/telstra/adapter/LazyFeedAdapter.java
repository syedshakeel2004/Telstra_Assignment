package com.shakeel.telstra.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.shakeel.telstra.R;
import com.shakeel.telstra.constants.Constant;
import com.shakeel.telstra.lazyload.ImageLoader;
import com.shakeel.telstra.model.Feed;
import com.shakeel.telstra.model.Row;

public class LazyFeedAdapter extends BaseAdapter {

    private Activity activity;
    private List<Row> data;
    private static LayoutInflater inflater = null;
    public ImageLoader imageLoader;

    public LazyFeedAdapter(Activity activity, List<Row> data) {
        this.activity = activity;
        this.data=data;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);

        TextView title = (TextView)vi.findViewById(R.id.title); // title
        TextView description = (TextView)vi.findViewById(R.id.description);
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.thumbnail);

        Row feed_row = data.get(position);

        // Setting all values in listview
        if(feed_row.getTitle() != null || feed_row.getDescription()!= null || feed_row.getImageHref()!= null) {
            title.setText(feed_row.getTitle());
            description.setText(feed_row.getDescription());
            imageLoader.DisplayImage(feed_row.getImageHref(), thumb_image);
        }
        return vi;
    }
}