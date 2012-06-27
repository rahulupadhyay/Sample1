package rahul.upadhyay.dailerDemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DailerDemoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView numberField = (TextView) findViewById(R.id.number);
    	Intent intent = new Intent();
    	intent.setAction(Intent.ACTION_DIAL);
    	//intent.setAction(Intent.ACTION_CALL);
    	intent.setData(Uri.parse("tel:"+ numberField.getText())); // set the Uri
    	startActivity(intent);
        }
    }
   