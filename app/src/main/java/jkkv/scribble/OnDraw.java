package jkkv.scribble;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Joe on 11/2/17.
 */

public class OnDraw extends View {

    public int width;
    public int height;
    protected boolean canDraw = false;
    private Bitmap mapBitmap;
    private android.graphics.Canvas mapCanvas;
    private Path mapPath;
    protected Paint mapPaint;
    private float mapX;
    private float mapY;
    private static final float TOLERANCE = 5;
    public static String col = "#000000";
    private ArrayList<Path> paths = new ArrayList<>();
    private ArrayList<String> colCol = new ArrayList<String>();
    Context context;


    public OnDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;


        mapPaint = new Paint();
        mapPaint.setAntiAlias(true);
        mapPaint.setColor(Color.parseColor("#000000"));
        colCol.add("#000000");
        mapPaint.setStyle(Paint.Style.STROKE);
        mapPaint.setStrokeJoin(Paint.Join.ROUND);
        mapPaint.setStrokeWidth(12f);

        mapPath = new Path();
        mapCanvas = new android.graphics.Canvas();
        paths.add(mapPath);


    }

    @Override

    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width,height,oldw,oldh);

        mapBitmap = Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888);
        mapCanvas = new android.graphics.Canvas(mapBitmap);

    }

    @Override

    protected void onDraw(android.graphics.Canvas canvas) {
        int count = 0;
        for (Path p : paths) {
            mapPaint.setColor(Color.parseColor(colCol.get(count)));
            canvas.drawPath(p, mapPaint);
            count++;
        }

    }


    private void onStartTouch(float exValue,float whyValue) {
        changeColor(col);
        mapPath.reset();
        mapPath.moveTo(exValue, whyValue);
        mapX = exValue;
        mapY = whyValue;
    }

    private void moveTouch(float exValue, float whyValue) {
        float dx = Math.abs(exValue - mapX);
        float dy = Math.abs(whyValue - mapY);
        if (dx >= TOLERANCE || dy >= TOLERANCE) {
            mapPath.quadTo(mapX, mapY, (exValue + mapX) / 2, (whyValue + mapY) / 2);
            mapX = exValue;
            mapY = whyValue;

        }
    }

    public void changeColor(String string) {
        colCol.add(colCol.size() - 1, string);


    }

    private void upTouch() {
        mapPath.lineTo(mapX, mapY);
        mapCanvas.drawPath(mapPath, mapPaint);

        mapPath = new Path();
        paths.add(mapPath);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float exValue = event.getX();
        float whyValue = event.getY();

        if (canDraw) {
            switch (event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                  onStartTouch(exValue, whyValue);
                  invalidate();
                  break;
              case MotionEvent.ACTION_MOVE:
                  moveTouch(exValue, whyValue);
                  invalidate();
                  break;
              case MotionEvent.ACTION_UP:
                  upTouch();
                  invalidate();
                  break;
              default: break;

            }
        }
        return true;
    }
}