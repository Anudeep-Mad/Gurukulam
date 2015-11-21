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


public class ArrayList extends Activity {
    ListView listView ;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view );
        
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);
        
        // Defined Array values to show in ListView
        String[] values = new String[] { "Chapter 01", 
        		"Chapter 02", 
        		"Chapter 02", 
        		"Chapter 03", 
        		"Chapter 04", 
        		"Chapter 05", 
        		"Chapter 06", 
        		"Chapter 07"       
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
                if(itemValue.equals("Chapter 01"))
                {
                	Intent intent = new Intent(ArrayList.this,Pdf1.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Chapter 02"))
                {
                	Intent intent = new Intent(ArrayList.this,Pdf2.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Chapter 03"))
                {
                	Intent intent = new Intent(ArrayList.this,Pdf3.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Chapter 04"))
                {
                	Intent intent = new Intent(ArrayList.this,Pdf4.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Chapter 05"))
                {
                	Intent intent = new Intent(ArrayList.this,Pdf5.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Chapter 06"))
                {
                	Intent intent = new Intent(ArrayList.this,Pdf6.class);
                    startActivity(intent);
                }
                else if(itemValue.equals("Chapter 06"))
                {
                	Intent intent = new Intent(ArrayList.this,Pdf6.class);
                    startActivity(intent);
                }
             
              }

         });   
    }

}
