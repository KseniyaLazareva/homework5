import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationServiceParameterizedTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testVacationService(int expected, int income, int expenses, int treshold) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(expected, actual);

    }
}
