package jkkv.scribble;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Keri on 11/17/2017.
 */
public class ColorPickUnitTests {
    @Rule
    public ActivityTestRule<ColorPick> ColorPickUnitTest = new ActivityTestRule<ColorPick>(ColorPick.class);
    private ColorPick cPick = null;
    @Before
    public void setUp() throws Exception {
        cPick = ColorPickUnitTest.getActivity();
    }
    @Test
    public void testLaunchofColor1(){ // Unit Test to launch color1
        View view = cPick.findViewById(R.id.color1);
        assertNotNull(view);
    }

    @Test
    public void testLaunchOfColor13(){ // Unit Test to launch color 13
        View view =cPick.findViewById(R.id.color13);
        assertNotNull(view);
    }

    @Test
    public void testLaunchOfColor9(){ // Unit Test to launch color 9
        View view = cPick.findViewById(R.id.color9);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        cPick = null;
    }


}
