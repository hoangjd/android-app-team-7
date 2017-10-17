package jkkv.scribble;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Canvas extends AppCompatActivity {

    public FloatingActionButton menu2, draw2, ie;
    public Animation open, close;
    public Boolean isOpen = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ie = (FloatingActionButton) findViewById(R.id.importExport);
        draw2 = (FloatingActionButton) findViewById(R.id.draw);//make action buttons for draw and menu
        menu2 = (FloatingActionButton) findViewById(R.id.menu);
        open = AnimationUtils.loadAnimation(this, R.anim.butfunction);//wiring to anim folder
        close = AnimationUtils.loadAnimation(this, R.anim.butfunctionclose);



        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateMenu();
            }
        });


        //include onclick listeners once we have functionality to each of menu options
    }


    public void animateMenu() {//says whether or not to open menu
        if (isOpen){
            draw2.startAnimation(close);
            draw2.setClickable(false);
            ie.startAnimation(close);
            ie.setClickable(false);
            isOpen = false;
        }
        else
            draw2.startAnimation(open);
            draw2.setClickable(true);
            ie.startAnimation(open);
            ie.setClickable(true);
            isOpen = true;

    }

}
