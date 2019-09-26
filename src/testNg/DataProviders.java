package testNg;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name="addition")
    public static Object[][] dataporviderForAddition() {

        return new Object[][]{
                {2, 3},
                {-4, 89},
                {222, -9}

        };
    }


}
