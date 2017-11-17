package jkkv.scribble;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Keri on 11/17/2017.
 */
public class BackgroundUnitTests {
    @Rule
    public ActivityTestRule<ColorPick> BackgroundUnitTest = new ActivityTestRule<ColorPick>(ColorPick.class);
    private ColorPick background = null;

    @Before
    public void setUp() throws Exception {
        background = BackgroundUnitTest.getActivity();
    }
    @Test
    public void testLaunchBackgroundofColor1(){ // Unit Test to launch background color1
        View view = background.findViewById(R.id.color1);
        assertTrue(String.valueOf(Canvas.backgroundOrDraw), true);
        assertNotNull(view);
    }

    @Test
    public void testLaunchBackgroundOfColor13(){ // Unit Test to launch background color 13
        View view = background.findViewById(R.id.color13);
        assertTrue(String.valueOf(Canvas.backgroundOrDraw), true);
        assertNotNull(view);
    }

    @Test
    public void testLaunchBackgroundOfColor9(){ // Unit Test to launch background color 9
        View view = background.findViewById(R.id.color9);
        assertTrue(String.valueOf(Canvas.backgroundOrDraw), true);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        background  = null;
    }

}