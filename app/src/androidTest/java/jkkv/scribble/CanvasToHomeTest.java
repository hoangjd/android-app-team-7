package jkkv.scribble;



import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Created by Joe on 10/18/17.
 */
@RunWith(AndroidJUnit4.class)
public class CanvasToHomeTest {

    @Rule
    public ActivityTestRule<Canvas> canvasToHomeRule = new ActivityTestRule<Canvas>(Canvas.class);


    @Test
    public void clickMenuButton_clickHomeButton_goToHome_backToCanvas(){
        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.home))
                .check(matches(isClickable()));
        onView(withId(R.id.home))
                .perform(click());
        onView(withId(R.id.title))
                .check(matches(isDisplayed()));//check if on homepage
        onView(withId(R.id.newProject))
                .perform(click());
        onView(withId(R.id.menu))
                .check(matches(isDisplayed()));//check if on canvas
    }
}
