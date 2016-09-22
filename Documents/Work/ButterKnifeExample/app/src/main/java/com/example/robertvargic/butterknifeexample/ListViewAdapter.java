package com.example.robertvargic.butterknifeexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robigroza on 21/09/16.
 */

public class ListViewAdapter extends Activity {

    private List<Plane> mPlaneList;

    public ListView mListView;
    public LayoutInflater mInflater;
    public ListAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);

        mListView = (ListView) findViewById(R.id.activity_example_list_view);
        mInflater = LayoutInflater.from(this);
        mAdapter = new ListAdapter();

        initPlanes();

    }

    private class ListAdapter extends BaseAdapter {

        public void setData(List<Plane> list) {
            list = mPlaneList;
        }

        @Override
        public int getCount() {
            return mPlaneList.size();
        }

        @Override
        public Object getItem(int position) {
            return mPlaneList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View view, ViewGroup parent) {

            ViewHolder holder = null;

            if (view == null) {
                holder = new ViewHolder();

                view = mInflater.inflate(R.layout.list_item, parent, false);

                holder.flightNumber = (TextView) view.findViewById(R.id.flight_number);
                holder.locationName = (TextView) view.findViewById(R.id.flight_name);

                view.setTag(holder);

            } else {
                holder = (ViewHolder) view.getTag();
            }

            holder.flightNumber.setText(Integer.toString(mPlaneList.get(position).number));
            holder.locationName.setText(mPlaneList.get(position).place);

            return view;
        }
    }

    class ViewHolder {
        TextView flightNumber;
        TextView locationName;
    }

    void initPlanes() {
        mPlaneList = new ArrayList<>();
        mPlaneList.add(new Plane(1001, "Timbuktu"));
        mPlaneList.add(new Plane(2456, "Siberia"));
        mPlaneList.add(new Plane(234, "Paris"));
        mPlaneList.add(new Plane(1123, "Budapest"));
        mPlaneList.add(new Plane(5678, "Zagreb"));
        mPlaneList.add(new Plane(4355, "London"));
        mPlaneList.add(new Plane(0000, "Wherever"));

        mListView.setAdapter(mAdapter);
        mAdapter.setData(mPlaneList);
        mAdapter.notifyDataSetChanged();
    }

    private class Plane {
        int number;
        String place;

        Plane(int i, String timbuktu) {
        }
    }
}
