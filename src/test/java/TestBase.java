import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterEach
    void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}

