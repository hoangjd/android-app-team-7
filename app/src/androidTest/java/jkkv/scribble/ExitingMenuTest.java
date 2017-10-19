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
import static org.hamcrest.Matchers.not;

/**
 * Created by Keri on 10/18/2017.
 */
@RunWith(AndroidJUnit4.class)
public class ExitingMenuTest {

    @Rule
    public ActivityTestRule<Canvas> exitMenuRule = new ActivityTestRule<Canvas>(Canvas.class);

    @Test
    public void clickMenuButton_clickOutOfMenuButton(){
        onView(withId(R.id.menu))
                .check(matches(isClickable()));
        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.draw))
                .check(matches(isDisplayed()));
        onView(withId(R.id.eraser))
                .check(matches(isDisplayed()));
        onView(withId(R.id.home))
                .check(matches(isDisplayed()));
        onView(withId(R.id.paintbrush))
                .check(matches(isDisplayed()));
        onView(withId(R.id.movinghand))
                .check(matches(isDisplayed()));
        onView(withId(R.id.background))
                .check(matches(isDisplayed()));
        onView(withId(R.id.port))
                .check(matches(isDisplayed()));
        onView(withId(R.id.color))
                .check(matches(isDisplayed()));
        onView(withId(R.id.reflection))
                .check(matches(isDisplayed()));
        onView(withId(R.id.menu))
                .check(matches(isClickable()));


        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.draw))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.eraser))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.home))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.paintbrush))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.movinghand))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.background))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.port))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.color))
                .check(matches(not(isDisplayed())));
        onView(withId(R.id.reflection))
                .check(matches(not(isDisplayed())));
    }


}
