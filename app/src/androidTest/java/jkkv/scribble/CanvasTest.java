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
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

/**
 * Created by viyatpatel on 10/19/17.
 */
public class CanvasTest {

    @Rule
    public ActivityTestRule<Canvas> canvasActivityTestRule = new ActivityTestRule<Canvas>(Canvas.class);

    private Canvas canvas = null;


    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(HomeScreen.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        canvas = canvasActivityTestRule.getActivity();
    }


    //Canvas: Senario 2
    @Test
    public void testGoingBackToCanvasAfterMenu() {

        assertNotNull(canvas.findViewById(R.id.menu));

        onView(withId(R.id.draw)).check(matches(not(isDisplayed())));
        onView(withId(R.id.eraser)).check(matches(not(isDisplayed())));
        onView(withId(R.id.home)).check(matches(not(isDisplayed())));
        onView(withId(R.id.paintbrush)).check(matches(not(isDisplayed())));
        onView(withId(R.id.movinghand)).check(matches(not(isDisplayed())));
        onView(withId(R.id.background)).check(matches(not(isDisplayed())));
        onView(withId(R.id.port)).check(matches(not(isDisplayed())));
        onView(withId(R.id.color)).check(matches(not(isDisplayed())));
        onView(withId(R.id.reflection)).check(matches(not(isDisplayed())));

        onView(withId(R.id.menu)).perform(click());

        onView(withId(R.id.draw)).check(matches(isDisplayed()));
        onView(withId(R.id.eraser)).check(matches(isDisplayed()));
        onView(withId(R.id.home)).check(matches(isDisplayed()));
        onView(withId(R.id.paintbrush)).check(matches(isDisplayed()));
        onView(withId(R.id.movinghand)).check(matches(isDisplayed()));
        onView(withId(R.id.background)).check(matches(isDisplayed()));
        onView(withId(R.id.port)).check(matches(isDisplayed()));
        onView(withId(R.id.color)).check(matches(isDisplayed()));
        onView(withId(R.id.reflection)).check(matches(isDisplayed()));


    }

    //Canvas: Senario 3
    @Test
    public void testLaunchOfCanvasAfterExitBlank() {

        assertNotNull(canvas.findViewById(R.id.menu));

        onView(withId(R.id.menu)).perform(click());

        assertNotNull(canvas.findViewById(R.id.home));

        onView(withId(R.id.home)).perform(click());

        Activity homeScreen = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(homeScreen);

        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        assertNotNull(canvas.findViewById(R.id.menu));

    }

    @After
    public void tearDown() throws Exception {
        canvas = null;
    }

}