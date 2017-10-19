package jkkv.scribble;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by viyatpatel on 10/19/17.
 */
public class CanvasTest2 {

    @Rule
    public ActivityTestRule<HomeScreen> homeScreenActivityTestRule = new ActivityTestRule<HomeScreen>(HomeScreen.class);

    private HomeScreen homeScreen = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Canvas.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        homeScreen = homeScreenActivityTestRule.getActivity();
    }

    //Canvas: Senario 1
    @Test
    public void testLaunchOfCanvasOnButtonClick() {

        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

        assertNotNull(canvas.findViewById(R.id.menu));

    }

    @After
    public void tearDown() throws Exception {
        homeScreen = null;
    }

}