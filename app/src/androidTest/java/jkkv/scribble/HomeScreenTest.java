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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
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


    @After
    public void tearDown() throws Exception {
        homeScreen = null;
    }

}

