package jkkv.scribble;


import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

/**
 * Created by Joe on 10/19/17.
 */

public class MenuScenario12Test {
    @Rule
    public ActivityTestRule<Canvas> canvasToHomeRule = new ActivityTestRule<Canvas>(Canvas.class);


    @Test //scenario 1
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

    @Test//scenario 2 test
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