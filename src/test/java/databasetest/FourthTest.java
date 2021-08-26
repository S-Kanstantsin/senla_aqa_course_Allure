package databasetest;

import io.qameta.allure.Step;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import startAndEnd.StartAndEnd;

import static locator.Locator.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FourthTest extends StartAndEnd {

    @Step(value = "Fill in login with {0}")
    @Test
    public void dellAddress() throws InterruptedException {
        driver.findElement(ADDRESS_BUTTON_HEADER).click();
        driver.findElement(DESTROY_BUTTON).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
}
