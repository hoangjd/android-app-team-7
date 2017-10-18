package jkkv.scribble;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class Canvas extends AppCompatActivity {

    public FloatingActionButton menu, draw, paintbrush, eraser, port, background, movinghand;
    public Animation open, close;
    public Boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //action buttons for canvas activity
        menu = (FloatingActionButton) findViewById(R.id.menu);//make action buttons for draw and menu
        draw = (FloatingActionButton) findViewById(R.id.draw);//drawing
        paintbrush = (FloatingActionButton) findViewById(R.id.paintbrush);//paintbrush button
        eraser = (FloatingActionButton) findViewById(R.id.eraser);//eraser button
        movinghand = (FloatingActionButton) findViewById(R.id.movinghand);//moving hand function
        background = (FloatingActionButton) findViewById(R.id.background);//background button
        port = (FloatingActionButton) findViewById(R.id.port);//import and/or export button


        open = AnimationUtils.loadAnimation(this, R.anim.butfunctionopen);//wiring to anim folder
        close = AnimationUtils.loadAnimation(this, R.anim.butfunctionclose);


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateMenu();
            }
        });

        draw.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view) {
                animateMenu();
                Toast.makeText(Canvas.this, "draw", Toast.LENGTH_SHORT).show();}
        });

        paintbrush.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                animateMenu();
                Toast.makeText(Canvas.this, "brush", Toast.LENGTH_SHORT).show();}
        });

        eraser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                animateMenu();
                Toast.makeText(Canvas.this, "eraser", Toast.LENGTH_SHORT).show();
            }
        });

        movinghand.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                animateMenu();
                Toast.makeText(Canvas.this, "moving hand", Toast.LENGTH_SHORT).show();
            }
        });

        background.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                animateMenu();
                Toast.makeText(Canvas.this, "background", Toast.LENGTH_SHORT).show();}
        });

        port.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(Canvas.this, "import/export", Toast.LENGTH_SHORT).show();
                animateMenu();
            }
        });
    }


    public void animateMenu() {//says whether or not to open menu
        if (isOpen){ //not open

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

            isOpen = false;
        }
        else{ //open

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

            isOpen = true;

    }}

}
