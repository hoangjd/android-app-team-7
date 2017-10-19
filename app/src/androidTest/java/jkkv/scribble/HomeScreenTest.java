package jkkv.scribble;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

/**
 * Created by viyatpatel on 10/18/17.
 */
public class HomeScreenTest {
    @Rule
    public ActivityTestRule<HomeScreen> homeScreenActivityTestRule = new ActivityTestRule<HomeScreen>(HomeScreen.class);

    private HomeScreen homeScreen = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Canvas.class.getName(),null,false);
    Instrumentation.ActivityMonitor monitor2 = getInstrumentation().addMonitor(Canvas.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        homeScreen = homeScreenActivityTestRule.getActivity();
    }

    //Home: Senario 1
    @Test
    public void testLaunchHome() {
        View view = homeScreen.findViewById(R.id.newProject);
        assertNotNull(view);
    }

    //Home: Senario 2
    @Test
    public void testLaunchHomeAfterClose() {
        assertNotNull(homeScreen.findViewById(R.id.newProject));
        homeScreen.finish();
        Intent intent = new Intent(homeScreen,homeScreen.getClass());
        homeScreen.startActivityForResult(intent,1);
        assertNotNull(homeScreen.findViewById(R.id.newProject));
    }

    //Home: Senario 3
    @Test
    public void testLaunchHomeFromMenu() {
        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

        assertNotNull(canvas.findViewById(R.id.menu));

        onView(withId(R.id.menu)).perform(click());

        assertNotNull(canvas.findViewById(R.id.home));

        onView(withId(R.id.home)).perform(click());

        assertNotNull(homeScreen.findViewById(R.id.newProject));
    }

    //Canvas: Senario 1
    @Test
    public void testLaunchOfCanvasOnButtonClick() {
        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

        canvas.finish();

    }

    //Canvas: Senario 2
    @Test
    public void testGoingBackToCanvasAfterMenu() {
        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

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
        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

        canvas.finish();

        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas2 = getInstrumentation().waitForMonitorWithTimeout(monitor2,5000);

        assertNotNull(canvas2);

    }

    //Menu: Senario 1
    @Test
    public void testLaunchOfMenuFromCanvas() {
        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

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

    //Menu: Senario 2
    @Test
    public void testClosingMenu(){
        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

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
        assertNotNull(canvas);

        onView(withId(R.id.menu)).perform(click());

        onView(withId(R.id.draw)).check(matches(not(isDisplayed())));
        onView(withId(R.id.eraser)).check(matches(not(isDisplayed())));
        onView(withId(R.id.home)).check(matches(not(isDisplayed())));
        onView(withId(R.id.paintbrush)).check(matches(not(isDisplayed())));
        onView(withId(R.id.movinghand)).check(matches(not(isDisplayed())));
        onView(withId(R.id.background)).check(matches(not(isDisplayed())));
        onView(withId(R.id.port)).check(matches(not(isDisplayed())));
        onView(withId(R.id.color)).check(matches(not(isDisplayed())));
        onView(withId(R.id.reflection)).check(matches(not(isDisplayed())));
        assertNotNull(canvas);
    }

    //Menu: Senario 3
    @Test
    public void testLaunchOfMenuFromHome() {
        assertNotNull(homeScreen.findViewById(R.id.newProject));

        onView(withId(R.id.newProject)).perform(click());

        Activity canvas = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(canvas);

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

    @After
    public void tearDown() throws Exception {
        homeScreen = null;
    }

}

