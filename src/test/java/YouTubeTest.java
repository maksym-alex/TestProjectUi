import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BaseFixture;

import static com.codeborne.selenide.Selenide.closeWindow;

public class YouTubeTest extends BaseFixture {

    @BeforeClass(description = "Open YouTube page, maximaze browser window")
    void setUp() {
        openYouTube();
    }

    @Test(description = "YouTube page - end to end test")
    public void youTubeSearchTest() {
        pages.youTubePage.isOpened()
                .enterRandomNumbersInSearch()
                .selectDropdownItem(1)
                .clickOnVideo(3)
                .checkVideoIsOpened()
                .clickOnOwnerAvatar()
                .isOpened()
                .clickSubscribeBtn()
                .checkSignInText();
    }

    @AfterClass(description = "Close browser")
    private void tearDown() {
        closeWindow();
    }
}

