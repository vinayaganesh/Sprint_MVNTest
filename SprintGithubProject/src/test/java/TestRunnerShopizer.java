
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class TestRunnerShopizer {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ShopizerUserStories.class);
        System.out.println("Result Successful: " + result.wasSuccessful());
        for (
                Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }

}
