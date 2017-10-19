package jkkv.scribble;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Joe on 10/18/17.
 */

public class MenuAllButtonsTest {
    @Rule
    public ActivityTestRule<Canvas> canvasToHomeRule = new ActivityTestRule<Canvas>(Canvas.class);


    @Test
    public void clickMenuButton_checkTools_clickMenu_checkTools() {//go through all buttons
        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.draw))
                .check(matches(isClickable()));
        onView(withId(R.id.draw))
                .perform(click());

        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.port))
                .check(matches(isClickable()));
        onView(withId(R.id.port))
                .perform(click());

        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.movinghand))
                .check(matches(isClickable()));
        onView(withId(R.id.movinghand))
                .perform(click());

        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.eraser))
                .check(matches(isClickable()));
        onView(withId(R.id.eraser))
                .perform(click());

        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.paintbrush))
                .check(matches(isClickable()));
        onView(withId(R.id.paintbrush))
                .perform(click());

        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.background))
                .check(matches(isClickable()));
        onView(withId(R.id.background))
                .perform(click());

        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.color))
                .check(matches(isClickable()));
        onView(withId(R.id.color))
                .perform(click());

        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.reflection))
                .check(matches(isClickable()));
        onView(withId(R.id.reflection))
                .perform(click());


    }
}
