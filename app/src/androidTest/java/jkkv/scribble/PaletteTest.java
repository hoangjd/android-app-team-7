package jkkv.scribble;


import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

/**
 * Created by Keri on 11/7/2017.
 */

public class PaletteTest {

    @Rule
    public ActivityTestRule<Canvas> ColorPickTestRule = new ActivityTestRule<Canvas>(Canvas.class);

    @Test
    public void firstTimeEditingImageScenario() { //Scenario 1 of Color Palette
        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.color))
                .check(matches(isClickable()));
        onView(withId(R.id.color))
                .perform(click());
        onView(withId(R.id.color9))
                .check(matches(isClickable()));
        onView(withId(R.id.color9))
                .perform(click());
        pressBack();

    }

    @Test
    public void alreadyStartedImage() { //Scenario 2 of Color Palette
        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.color))
                .check(matches(isClickable()));
        onView(withId(R.id.color))
                .perform(click());
        onView(withId(R.id.color5))
                .check(matches(isClickable()));
        onView(withId(R.id.color5))
                .perform(click());
        pressBack();

    }

    @Test
    public void userDoesNotLikeColorChosen() { //Scenario 3 of Color Palette
        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.color))
                .check(matches(isClickable()));
        onView(withId(R.id.color))
                .perform(click());
        onView(withId(R.id.color2))
                .check(matches(isClickable()));
        onView(withId(R.id.color2))
                .perform(click());
        pressBack();
        onView(withId(R.id.menu))
                .perform(click());
        onView(withId(R.id.color))
                .check(matches(isClickable()));
        onView(withId(R.id.color))
                .perform(click());
        onView(withId(R.id.color6))
                .check(matches(isClickable()));
        onView(withId(R.id.color6))
                .perform(click());
        pressBack();

    }


}
