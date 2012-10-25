package dam2.trbl.rrodriguezapp1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class Respuesta1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta1);
     //   getActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        float numero=intent.getFloatExtra(MainActivity.PUNTUACION_INFO, 0);
        
        TextView Mitexto  = (TextView)findViewById(R.id.texto1);
        Mitexto.setTextSize(40);
        Mitexto.setText(String.valueOf(numero));
       
        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
    //    LayoutParams lp =new LayoutParams();
     //   lp.gravity=Gravity.BOTTOM;
        // Set the text view as the activity layout
      //  addContentView(textView,lp);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_respuesta1, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
