package dam2.trbl.rrodriguezapp1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "Extra Mensaje";
	public final static String PUNTUACION_INFO = "Captura puntuacion";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void configMain(View view) {
      
    	
    	//Intent intent = new Intent(this, Respuesta1.class);
    	Intent intent = new Intent(this, ItemListActivity.class);
        EditText editText = (EditText) findViewById(R.id.textointroducido);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        
        RatingBar puntuacion= (RatingBar) findViewById(R.id.ratingBar1);
        float p=puntuacion.getRating();
        intent.putExtra(PUNTUACION_INFO, p);

        
        
        startActivity(intent);
    	
    	
    }
    
    
    
}
