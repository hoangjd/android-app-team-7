package jkkv.scribble;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ColorPick extends AppCompatActivity {

    public FloatingActionButton color1;
    public FloatingActionButton color2;
    public FloatingActionButton color3;
    public FloatingActionButton color4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_pick);

        color1 = (FloatingActionButton) findViewById(R.id.color1);
        color2 = (FloatingActionButton) findViewById(R.id.color2);
        color3 = (FloatingActionButton) findViewById(R.id.color3);
        color4 = (FloatingActionButton) findViewById(R.id.color4);
    }
}
