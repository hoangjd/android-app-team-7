package jkkv.scribble;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class BackgroundTest {

    @Rule
    public ActivityTestRule<HomeScreen> mActivityTestRule = new ActivityTestRule<>(HomeScreen.class);

    //
    @Test
    public void backgroundTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.newProject), withText("New Project"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction floatingActionButton2 = onView(
                allOf(withId(R.id.background), isDisplayed()));
        floatingActionButton2.perform(click());

        ViewInteraction floatingActionButton3 = onView(
                allOf(withId(R.id.color21), isDisplayed()));
        floatingActionButton3.perform(click());


    }
    //Background: scenario 2, testing background after working on an image
    @Test
    public void backgroundTest2() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.newProject), withText("New Project"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction floatingActionButton2 = onView(
                allOf(withId(R.id.draw), isDisplayed()));
        floatingActionButton2.perform(click());

        ViewInteraction floatingActionButton3 = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton3.perform(click());

        ViewInteraction floatingActionButton4 = onView(
                allOf(withId(R.id.background), isDisplayed()));
        floatingActionButton4.perform(click());

        ViewInteraction floatingActionButton5 = onView(
                allOf(withId(R.id.color14), isDisplayed()));
        floatingActionButton5.perform(click());

        ViewInteraction floatingActionButton6 = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton6.perform(click());

    }
    @Test
    public void backgroundTest3() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.newProject), withText("New Project"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction floatingActionButton2 = onView(
                allOf(withId(R.id.background), isDisplayed()));
        floatingActionButton2.perform(click());

        ViewInteraction floatingActionButton3 = onView(
                allOf(withId(R.id.color21), isDisplayed()));
        floatingActionButton3.perform(click());

        ViewInteraction floatingActionButton4 = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton4.perform(click());

        ViewInteraction floatingActionButton5 = onView(
                allOf(withId(R.id.color), isDisplayed()));
        floatingActionButton5.perform(click());

        ViewInteraction floatingActionButton6 = onView(
                allOf(withId(R.id.color8), isDisplayed()));
        floatingActionButton6.perform(click());

        pressBack();

        ViewInteraction floatingActionButton7 = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton7.perform(click());

        ViewInteraction floatingActionButton8 = onView(
                allOf(withId(R.id.draw), isDisplayed()));
        floatingActionButton8.perform(click());

        ViewInteraction floatingActionButton9 = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton9.perform(click());

        ViewInteraction floatingActionButton10 = onView(
                allOf(withId(R.id.paintbrush), isDisplayed()));
        floatingActionButton10.perform(click());

        ViewInteraction floatingActionButton11 = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton11.perform(click());

        ViewInteraction floatingActionButton12 = onView(
                allOf(withId(R.id.eraser), isDisplayed()));
        floatingActionButton12.perform(click());

        ViewInteraction floatingActionButton13 = onView(
                allOf(withId(R.id.menu), isDisplayed()));
        floatingActionButton13.perform(click());

        ViewInteraction floatingActionButton14 = onView(
                allOf(withId(R.id.background), isDisplayed()));
        floatingActionButton14.perform(click());

        ViewInteraction floatingActionButton15 = onView(
                allOf(withId(R.id.color12), isDisplayed()));
        floatingActionButton15.perform(click());


    }}