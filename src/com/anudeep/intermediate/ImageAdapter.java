package com.anudeep.intermediate;

import android.content.Context;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
   private Context mContext;
   
   // Constructor
   public ImageAdapter(Context c) {
      mContext = c;
   }
   
   public int getCount() {
      return mThumbIds.length;
   }

   public Object getItem(int position) {
      return null;
   }

   public long getItemId(int position) {
      return 0;
   }
   
   // create a new ImageView for each item referenced by the Adapter
   public View getView(int position, View convertView, ViewGroup parent) {
      ImageView imageView;
      
      if (convertView == null) {
         imageView = new ImageView(mContext);
         imageView.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT,
                 GridView.LayoutParams.MATCH_PARENT));
         imageView.setScaleType(ImageView.ScaleType.FIT_XY);
         imageView.setPadding(8, 8, 8, 8);
      } 
      else 
      {
         imageView = (ImageView) convertView;
      }
      imageView.setImageResource(mThumbIds[position]);
      return imageView;
   }
   
   
   // Keep all Images in array
   public Integer[] mThumbIds = {
      R.drawable.marks, R.drawable.eamcet,
      R.drawable.arch, R.drawable.hm,
      R.drawable.timetable,R.drawable.books
      
      
     
   };
}