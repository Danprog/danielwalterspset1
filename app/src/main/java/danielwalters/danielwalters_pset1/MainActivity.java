package danielwalters.danielwalters_pset1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Hat, Eyes, Eyebrows, Mustache, Nose, Ears, Shoes, Arms, Glasses, Mouth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    Hat = findViewById(R.id.img_Hat);
    Eyes = findViewById(R.id.img_Eyes);
    Eyebrows = findViewById(R.id.img_Eyebrows);
    Mustache = findViewById(R.id.img_Mustache);
    Nose = findViewById(R.id.img_Nose);
    Ears = findViewById(R.id.img_Ears);
    Shoes = findViewById(R.id.img_Shoes);
    Arms = findViewById(R.id.img_Arms);
    Glasses = findViewById(R.id.img_Glasses);
    Mouth = findViewById(R.id.img_Mouth);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox_Eyes:
                if (checked)
                    Eyes.setVisibility(View.VISIBLE);
                else
                    Eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Ears:
                if (checked)
                    Ears.setVisibility(View.VISIBLE);
                else
                    Ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Arms:
                if (checked)
                    Arms.setVisibility(View.VISIBLE);
                else
                    Arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Eyebrows:
                if (checked)
                    Eyebrows.setVisibility(View.VISIBLE);
                else
                    Eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Glasses:
                if (checked)
                    Glasses.setVisibility(View.VISIBLE);
                else
                    Glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Mustache:
                if (checked)
                    Mustache.setVisibility(View.VISIBLE);
                else
                    Mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Hat:
                if (checked)
                    Hat.setVisibility(View.VISIBLE);
                else
                    Hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Nose:
                if (checked)
                    Nose.setVisibility(View.VISIBLE);
                else
                    Nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Mouth:
                if (checked)
                    Mouth.setVisibility(View.VISIBLE);
                else
                    Mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_Shoes:
                if (checked)
                    Shoes.setVisibility(View.VISIBLE);
                else
                    Shoes.setVisibility(View.INVISIBLE);
                break;
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Arms_vis", Arms.getVisibility());
        outState.putInt("Eyes_vis", Eyes.getVisibility());
        outState.putInt("Eyebrows_vis", Eyebrows.getVisibility());
        outState.putInt("Glasses_vis", Glasses.getVisibility());
        outState.putInt("Mustache_vis", Mustache.getVisibility());
        outState.putInt("Hat_vis", Hat.getVisibility());
        outState.putInt("Nose_vis", Nose.getVisibility());
        outState.putInt("Shoes_vis", Shoes.getVisibility());
        outState.putInt("Mouth_vis", Mouth.getVisibility());
        outState.putInt("Ears_vis", Ears.getVisibility());

    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        int value_stored = inState.getInt("Arms_vis");
        Arms.setVisibility(value_stored);

        value_stored = inState.getInt("Eyes_vis");
        Eyes.setVisibility(value_stored);

        value_stored = inState.getInt("Eyebrows_vis");
        Eyebrows.setVisibility(value_stored);

        value_stored = inState.getInt("Glasses_vis");
        Glasses.setVisibility(value_stored);

        value_stored = inState.getInt("Mustache_vis");
        Mustache.setVisibility(value_stored);

        value_stored = inState.getInt("Hat_vis");
        Hat.setVisibility(value_stored);

        value_stored = inState.getInt("Nose_vis");
        Nose.setVisibility(value_stored);

        value_stored = inState.getInt("Shoes_vis");
        Shoes.setVisibility(value_stored);

        value_stored = inState.getInt("Mouth_vis");
        Mouth.setVisibility(value_stored);
        
        value_stored = inState.getInt("Ears_vis");
        Ears.setVisibility(value_stored);

    }
}
