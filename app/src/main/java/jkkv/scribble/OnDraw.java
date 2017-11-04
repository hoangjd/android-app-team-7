package jkkv.scribble;

import android.content.Context;
import android.graphics.*;
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
    protected boolean canDraw= false;
    private Bitmap mBitmap;
    private android.graphics.Canvas mCanvas;
    private Path mPath, nextPath;
    protected Paint mPaint;
    private float mX, mY;
    private static final float TOLERANCE = 5;
    public static String col = "#ff0000";
    private ArrayList<Path> paths = new ArrayList<>();
    Context context;


    public OnDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

        //mPath = new Path();

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.parseColor("#ff0000"));
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeWidth(4f);
        mPath = new Path();
        mCanvas = new android.graphics.Canvas();
        paths.add(mPath);


    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh){
        super.onSizeChanged(w,h,oldw,oldh);

        mBitmap = Bitmap.createBitmap(w,h,Bitmap.Config.ARGB_8888);
        mCanvas = new android.graphics.Canvas(mBitmap);
    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas){
       // super.onDraw(canvas);
        for (Path p : paths) {
            //Determine Paint color Here.
            changeColor(col); // where myColor is your variable to use for this layer.
            // This could be from an array/List of colors matching to Paths.
            canvas.drawPath(p, mPaint);
        }
    }


    private void onStartTouch(float x,float y){
        mPath.reset();
        mPath.moveTo(x, y);
        mX = x;
        mY = y;
    }

    private void moveTouch(float x, float y){
        float dx = Math.abs(x-mX);
        float dy = Math.abs(y-mY);
        if(dx>= TOLERANCE || dy>= TOLERANCE){
            mPath.quadTo(mX,mY, (x+mX) / 2, (y+mY)/2);
            mX = x;
            mY = y;

        }
    }

    public void changeColor(String s){
      //  nextPath = new Path(mPath);
       // mPath = new Path();
      //  nextPaint = new Paint(mPaint);
        mPaint.setColor(Color.parseColor(s));

    }

    private void upTouch(){
        mPath.lineTo(mX,mY);
        mCanvas.drawPath(mPath,mPaint);
       // paths.add(mPath);
        mPath = new Path();
        paths.add(mPath);
    }

    @Override
    public boolean onTouchEvent (MotionEvent event){
        float x = event.getX();
        float y = event.getY();

        if (canDraw) {

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    onStartTouch(x, y);
                    invalidate();
                    break;
                case MotionEvent.ACTION_MOVE:
                    moveTouch(x, y);
                    invalidate();
                    break;
                case MotionEvent.ACTION_UP:
                    upTouch();
                    invalidate();
                    break;

            }
        }
        return true;
    }
}
