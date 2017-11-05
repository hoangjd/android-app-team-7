package jkkv.scribble;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import android.content.Intent;

import static android.content.ClipData.newIntent;

public class Canvas extends AppCompatActivity {

    public FloatingActionButton menu;//, draw, paintbrush, eraser, port, background, movinghand, color, reflection, home;
    public FloatingActionButton draw;
    public FloatingActionButton paintbrush;
    public FloatingActionButton eraser;
    public FloatingActionButton port;
    public FloatingActionButton background;
    public FloatingActionButton movinghand;
    public FloatingActionButton color;
    public FloatingActionButton reflection;
    public FloatingActionButton home;
    public Animation open;
    public Animation close;
    public Boolean isOpen = false;
    public static Boolean backgroundOrDraw = false;

    private OnDraw actualCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actualCanvas = (OnDraw) findViewById(R.id.actualCanvas);

        //action buttons for canvas activity
        menu = (FloatingActionButton) findViewById(R.id.menu);//make action buttons for draw and menu
        draw = (FloatingActionButton) findViewById(R.id.draw);//drawing
        paintbrush = (FloatingActionButton) findViewById(R.id.paintbrush);//paintbrush button
        eraser = (FloatingActionButton) findViewById(R.id.eraser);//eraser button
        movinghand = (FloatingActionButton) findViewById(R.id.movinghand);//moving hand function
        background = (FloatingActionButton) findViewById(R.id.background);//background button
        port = (FloatingActionButton) findViewById(R.id.port);//import and/or export button
        color = (FloatingActionButton) findViewById(R.id.color);//change color button
        reflection = (FloatingActionButton) findViewById(R.id.reflection);//reflect image
        home = (FloatingActionButton) findViewById(R.id.home);

        open = AnimationUtils.loadAnimation(this, R.anim.butfunctionopen);//wiring to anim folder
        close = AnimationUtils.loadAnimation(this, R.anim.butfunctionclose);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toHome = new Intent(Canvas.this,HomeScreen.class);
                startActivity(toHome);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateMenu();
            }
        });
        

        draw.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                actualCanvas.canDraw = true;//ability to draw
                animateMenu();
                Toast.makeText(Canvas.this, "draw", Toast.LENGTH_SHORT).show();
            }
        });

        paintbrush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateMenu();
                Toast.makeText(Canvas.this, "brush", Toast.LENGTH_SHORT).show();
            }
        });

        eraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualCanvas.canDraw = false;
                animateMenu();
                Toast.makeText(Canvas.this, "eraser", Toast.LENGTH_SHORT).show();
            }
        });

        movinghand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualCanvas.canDraw = false;
                animateMenu();
                Toast.makeText(Canvas.this, "moving hand", Toast.LENGTH_SHORT).show();
            }
        });

        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundOrDraw = true; // need this for color choosing
                Intent colorPickAct = new Intent(Canvas.this, ColorPick.class);
                startActivity(colorPickAct);
                animateMenu();
            }
        });

        port.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Canvas.this, "import/export", Toast.LENGTH_SHORT).show();
                animateMenu();
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundOrDraw = false;
                Intent colorPickAct = new Intent(Canvas.this, ColorPick.class);//go to ColorPick
                startActivity(colorPickAct);

                animateMenu();
            }
        });


        reflection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Canvas.this, "reflect image", Toast.LENGTH_SHORT).show();
                animateMenu();
            }
        });
    }


    public void animateMenu() { //says whether or not to open menu
        if (isOpen) { //not open

            //to abide with espresso visibility standards view must be 90% visible
            findViewById(R.id.home).setVisibility(View.INVISIBLE);
            findViewById(R.id.draw).setVisibility(View.INVISIBLE);
            findViewById(R.id.paintbrush).setVisibility(View.INVISIBLE);
            findViewById(R.id.eraser).setVisibility(View.INVISIBLE);
            findViewById(R.id.movinghand).setVisibility(View.INVISIBLE);
            findViewById(R.id.background).setVisibility(View.INVISIBLE);
            findViewById(R.id.port).setVisibility(View.INVISIBLE);
            findViewById(R.id.color).setVisibility(View.INVISIBLE);
            findViewById(R.id.reflection).setVisibility(View.INVISIBLE);

            home.startAnimation(close);
            home.setClickable(false);

            draw.startAnimation(close);
            draw.setClickable(false);

            paintbrush.startAnimation(close);
            paintbrush.setClickable(false);

            eraser.startAnimation(close);
            eraser.setClickable(false);

            movinghand.startAnimation(close);
            movinghand.setClickable(false);

            background.startAnimation(close);
            background.setClickable(false);

            port.startAnimation(close);
            port.setClickable(false);

            color.startAnimation(close);
            color.setClickable(false);

            reflection.startAnimation(close);
            reflection.setClickable(false);

            isOpen = false;

        } else { //open

            //to abide with espresso visibility standards view must be 90% visible
            findViewById(R.id.home).setVisibility(View.VISIBLE);
            findViewById(R.id.draw).setVisibility(View.VISIBLE);
            findViewById(R.id.paintbrush).setVisibility(View.VISIBLE);
            findViewById(R.id.eraser).setVisibility(View.VISIBLE);
            findViewById(R.id.movinghand).setVisibility(View.VISIBLE);
            findViewById(R.id.background).setVisibility(View.VISIBLE);
            findViewById(R.id.port).setVisibility(View.VISIBLE);
            findViewById(R.id.color).setVisibility(View.VISIBLE);
            findViewById(R.id.reflection).setVisibility(View.VISIBLE);

            home.startAnimation(open);
            home.setClickable(true);

            draw.startAnimation(open);
            draw.setClickable(true);

            paintbrush.startAnimation(open);
            paintbrush.setClickable(true);

            eraser.startAnimation(open);
            eraser.setClickable(true);

            movinghand.startAnimation(open);
            movinghand.setClickable(true);

            background.startAnimation(open);
            background.setClickable(true);

            port.startAnimation(open);
            port.setClickable(true);

            color.startAnimation(open);
            color.setClickable(true);

            reflection.startAnimation(open);
            reflection.setClickable(true);

            isOpen = true;

        }
    }
}
