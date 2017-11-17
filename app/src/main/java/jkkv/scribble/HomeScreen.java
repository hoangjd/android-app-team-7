package jkkv.scribble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    Button newProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        canvasAct();
        loadAct();
    }

    public void canvasAct() {
        newProject = (Button)findViewById(R.id.newProject);
        newProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canvasAct = new Intent(HomeScreen.this,Canvas.class);
                startActivity(canvasAct);
            }
        });
    }

    public void loadAct() {
        newProject = (Button)findViewById(R.id.loadExisiting);
        newProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadAct = new Intent(HomeScreen.this,LoadExisting.class);
                startActivity(loadAct);
            }
        });
    }
}
