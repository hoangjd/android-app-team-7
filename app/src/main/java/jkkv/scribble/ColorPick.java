package jkkv.scribble;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.AttributeSet;
import android.widget.Toast;

public class ColorPick extends AppCompatActivity {

    public FloatingActionButton color1;
    public FloatingActionButton color2;
    public FloatingActionButton color3;
    public FloatingActionButton color4;
    public FloatingActionButton color5;
    public FloatingActionButton color6;
    public FloatingActionButton color7;
    public FloatingActionButton color8;
    public FloatingActionButton color9;
    public FloatingActionButton color10;
    public FloatingActionButton color11;
    public FloatingActionButton color12;
    public FloatingActionButton color13;
    public FloatingActionButton color14;
    public FloatingActionButton color15;
    public FloatingActionButton color16;
    public FloatingActionButton color17;
    public FloatingActionButton color18;
    public FloatingActionButton color19;
    public FloatingActionButton color20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_pick);

        color1 = (FloatingActionButton) findViewById(R.id.color1);
        color2 = (FloatingActionButton) findViewById(R.id.color2);
        color3 = (FloatingActionButton) findViewById(R.id.color3);
        color4 = (FloatingActionButton) findViewById(R.id.color4);
        color5 = (FloatingActionButton) findViewById(R.id.color5);
        color6 = (FloatingActionButton) findViewById(R.id.color6);
        color7 = (FloatingActionButton) findViewById(R.id.color7);
        color8 = (FloatingActionButton) findViewById(R.id.color8);
        color9 = (FloatingActionButton) findViewById(R.id.color9);
        color10 = (FloatingActionButton) findViewById(R.id.color10);
        color11 = (FloatingActionButton) findViewById(R.id.color11);
        color12 = (FloatingActionButton) findViewById(R.id.color12);
        color13 = (FloatingActionButton) findViewById(R.id.color13);
        color14 = (FloatingActionButton) findViewById(R.id.color14);
        color15 = (FloatingActionButton) findViewById(R.id.color15);
        color16 = (FloatingActionButton) findViewById(R.id.color16);
        color17 = (FloatingActionButton) findViewById(R.id.color17);
        color18 = (FloatingActionButton) findViewById(R.id.color18);
        color19 = (FloatingActionButton) findViewById(R.id.color19);
        color20 = (FloatingActionButton) findViewById(R.id.color20);


        changeColorOnClick();
    }

    public void changeColorOnClick() {
        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#00ffff";
                //  OnDraw.mPaintVals();

            }
        });
        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#cc99ff";
                //  OnDraw.mPaintVals();

            }
        });
        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ffcccc";
                //  OnDraw.mPaintVals();

            }
        });
        color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ffffcc";
                //  OnDraw.mPaintVals();

            }
        });
        color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ffffff";
                //  OnDraw.mPaintVals();

            }
        });
        color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#00ccff";
                //  OnDraw.mPaintVals();

            }
        });
        color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#a64dff";
                //  OnDraw.mPaintVals();

            }
        });
        color8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ff6666";
                //  OnDraw.mPaintVals();

            }
        });
        color9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ffff00";
                //  OnDraw.mPaintVals();

            }
        });
        color10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ccffcc";
                //  OnDraw.mPaintVals();

            }
        });
        color11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#0052cc";
                //  OnDraw.mPaintVals();

            }
        });
        color12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#8000ff";
                //  OnDraw.mPaintVals();

            }
        });
        color13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ff0000";
                //  OnDraw.mPaintVals();

            }
        });
        color14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#ffcc00";
                //  OnDraw.mPaintVals();

            }
        });
        color15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#66ff66";
                //  OnDraw.mPaintVals();

            }
        });
        color16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#0000cc";
                //  OnDraw.mPaintVals();

            }
        });
        color17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#6600cc";
                //  OnDraw.mPaintVals();

            }
        });
        color18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#cc0000";
                //  OnDraw.mPaintVals();

            }
        });
        color19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#cc9900";
                //  OnDraw.mPaintVals();

            }
        });
        color20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnDraw.col = "#009933";
                //  OnDraw.mPaintVals();

            }
        });

    }
}

//}
