package com.anudeep.intermediate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class GridMenu extends Activity {
	GridView gridview;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.gridmenu);
      
      gridview = (GridView) findViewById(R.id.gridview);
      gridview.setAdapter(new ImageAdapter(this));
      
      gridview.setOnItemClickListener(new OnItemClickListener() {

          @Override
          public void onItemClick(AdapterView<?> parent, View view,
             int position, long id) {
            
           // ListView Clicked item index
           int itemPosition     = position;
           
           // ListView Clicked item value
           String  itemValue    = (String) gridview.getItemAtPosition(position);
              
            // Show Alert 
            Toast.makeText(getApplicationContext(),
              " "+itemPosition+" " +itemValue , Toast.LENGTH_LONG)
              .show();
            if(itemPosition==1)
            {
            	Intent intent = new Intent(GridMenu.this,Eamcet.class);
                startActivity(intent);
            }
            else if(itemPosition==0)
            {
            	Intent intent = new Intent(GridMenu.this,Marks.class);
                startActivity(intent);
            }
            else if(itemPosition==5)
            {
            	Intent intent = new Intent(GridMenu.this,Material.class);
                startActivity(intent);
            }
            else if(itemPosition==4)
            {
            	Intent intent = new Intent(GridMenu.this,TimeTable.class);
                startActivity(intent);
            }
            else if(itemPosition==3)
            {
            	Intent intent = new Intent(GridMenu.this,HouseMaster.class);
                startActivity(intent);
            }
           
            else if(itemPosition==2)
            {
            	Intent intent = new Intent(GridMenu.this,YouTube.class);
            	startActivity(intent);
            }
          }

     });   
   
   
   }
   
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }
}
