package com.marine.core;

import com.marine.steps.Hooks;
import org.openqa.selenium.WebDriver;

public class Step {

    public WebDriver driver = Hooks.driver;

    public boolean waitUntil(WaitCondition condition) {
        return waitUntil(5000, condition);
    }
    public boolean waitUntil(int timeoutInMillis, WaitCondition condition) {
        boolean isValid = false;
        long timeout = System.currentTimeMillis() + timeoutInMillis;
        while (!isValid && System.currentTimeMillis() < timeout) {
            try {
                isValid = condition.condition();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isValid;
    }

    public interface WaitCondition {
        boolean condition();
    }
}


