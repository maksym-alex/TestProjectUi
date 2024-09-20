import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class Itest {

    @Test
    void runTest() {
        open("https://www.youtube.com/");
        closeWindow();
    }

    @DataProvider(name = "numbers")
    public Object[][] samMethod() {
        return new Object[][]{{"First-Value"},
                {"Second-Value"},
                {"Third-Value"},
                {"Fourth-Value"}};
    }

    @Test(dataProvider = "numbers")
    public void myTest(String val) {
        System.out.println("Passed Parameter Is : " + val);
    }
}

