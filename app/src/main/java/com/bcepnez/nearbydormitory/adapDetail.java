package com.bcepnez.nearbydormitory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BenzRST on 19-Oct-17.
 */

public class adapDetail extends  BaseAdapter {
        Context mContext;
        String[] strName;
        int[] resId;

        public adapDetail(Context context, String[] strName, int[] resId) {
            this.mContext= context;
            this.strName = strName;
            this.resId = resId;
        }

        public int getCount() {
            return strName.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater mInflater =
                    (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if(view == null)
                view = mInflater.inflate(R.layout.activity_detail, parent, false);

            TextView textView = (TextView)view.findViewById(R.id.Name);
            textView.setText(strName[position]);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            imageView.setBackgroundResource(resId[position]);

            return view;
        }
}
