package com.anudeep.intermediate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Eamcet extends Activity {
    ListView listView ;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view );
        
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);
        
        // Defined Array values to show in ListView
        String[] values = new String[] { "Paper 01", 
        		"Paper 02", 
        		"Paper 03", 
        		"Paper 04", 
        		"Paper 05",
        		"Paper 06",
        		"Paper 07"
                                        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter); 
        
        // ListView Item Click Listener
        listView.setOnItemClickListener(new OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id) {
                
               // ListView Clicked item index
               int itemPosition     = position;
               
               // ListView Clicked item value
               String  itemValue    = (String) listView.getItemAtPosition(position);
                  
                // Show Alert 
                Toast.makeText(getApplicationContext(),
                  "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                  .show();
                if(itemValue.equals("Paper 01"))
                {
                	Intent intent = new Intent(Eamcet.this,E1.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Paper 02"))
                {
                	Intent intent = new Intent(Eamcet.this,E2.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Paper 03"))
                {
                	Intent intent = new Intent(Eamcet.this,E3.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Paper 04"))
                {
                	Intent intent = new Intent(Eamcet.this,E4.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Paper 05"))
                {
                	Intent intent = new Intent(Eamcet.this,E5.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Paper 06"))
                {
                	Intent intent = new Intent(Eamcet.this,E6.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Paper 07"))
                {
                	Intent intent = new Intent(Eamcet.this,E7.class);
                    startActivity(intent);
                }
             
              }

         });   
    }

}
