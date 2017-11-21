package jkkv.scribble;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnDrawTest {
    //@Rule
    //IMPORTANT COMMENT PLEASE LOOK FIXME!!!!!!!!!!!!!!!!!
    //how can we create a rule when OnDraw cannot be used as a parameter due to the class not being extended to AppCompactActivity, example of the rule below:
    //public ActivityTestRule<OnDraw> OnDrawUnitTest = new ActivityTestRule<OnDraw>(OnDraw.class);

    //we tried to extend the class OnDrawTest extends AppCompatActivity, but it still produced errors regardless.

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void onSizeChanged() throws Exception {
    }

    @Test
    public void changeColor() throws Exception {
    }

    @Test
    public void onTouchEvent() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}