package jkkv.scribble;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.AttributeSet;
import android.widget.Toast;

public class ColorPick extends AppCompatActivity {

    public FloatingActionButton yourColor;
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
    public FloatingActionButton color21;
    public FloatingActionButton color22;
    public FloatingActionButton color23;
    public FloatingActionButton color24;
    public FloatingActionButton color25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_pick);

        yourColor = (FloatingActionButton) findViewById(R.id.yourColor);
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
        color21 = (FloatingActionButton) findViewById(R.id.color21);
        color22 = (FloatingActionButton) findViewById(R.id.color22);
        color23 = (FloatingActionButton) findViewById(R.id.color23);
        color24 = (FloatingActionButton) findViewById(R.id.color24);
        color25 = (FloatingActionButton) findViewById(R.id.color25);

        changeColorPicker();

    }



    public void changeColorPicker() {

        if (Canvas.backgroundOrDraw == false) {
            yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(OnDraw.col)));
        } else {
            yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ffffff")));
        }

        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#00ffff";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#00ffff");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#00ffff")));
            }
        });

        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#cc99ff";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#cc99ff");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#cc99ff")));

            }
        });

        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ffcccc";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ffcccc");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ffcccc")));

            }
        });

        color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ffffcc";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ffffcc");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ffffcc")));

            }
        });

        color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ffffff";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ffffff");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ffffff")));

            }
        });

        color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#00ccff";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#00ccff");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#00ccff")));

            }
        });

        color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#a64dff";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#a64dff");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a64dff")));

            }
        });

        color8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ff6666";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ff6666");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff6666")));

            }
        });

        color9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ffff00";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ffff00");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ffff00")));

            }
        });

        color10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ccffcc";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ccffcc");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ccffcc")));

            }
        });

        color11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#0052cc";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#0052cc");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0052cc")));

            }
        });

        color12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#8000ff";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#8000ff");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#8000ff")));

            }
        });

        color13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ff0000";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ff0000");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff0000")));

            }
        });

        color14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#ffcc00";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#ffcc00");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ffcc00")));

            }
        });

        color15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#66ff66";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#66ff66");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#66ff66")));

            }
        });

        color16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#0000cc";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#0000cc");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0000cc")));

            }
        });

        color17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#5900b3";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#5900b3");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#5900b3")));

            }
        });

        color18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#cc0000";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#cc0000");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#cc0000")));

            }
        });

        color19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#cc9900";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#cc9900");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#cc9900")));

            }
        });

        color20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#009933";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#009933");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#009933")));

            }
        });

        color21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#000000";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#000000");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

            }
        });

        color22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#330066";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#330066");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#330066")));

            }
        });

        color23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#800000";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#800000");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#800000")));

            }
        });

        color24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#663300";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#663300");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#663300")));

            }
        });

        color25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Canvas.backgroundOrDraw == false) {
                    OnDraw.col = "#004d00";
                }
                if (Canvas.backgroundOrDraw == true) {
                    Intent intent = new Intent();
                    intent.putExtra("Data","#004d00");
                    setResult(RESULT_OK,intent);
                    finish();
                }
                yourColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#004d00")));

            }
        });

    }

}




