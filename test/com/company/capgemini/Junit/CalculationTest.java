import com.company.capgemini.Junit.Calculation;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void add() {
        Calculation cal = new Calculation();
        int res=cal.add(2,6);
        System.out.println("From Add Test.");
        assertEquals(8,res);
    }

    @BeforeAll
    static void BeforeAll()
    {
        System.out.println("From Before all.");
    }

    @AfterAll
    static void AfterAll()
    {
        System.out.println("From After all.");
    }

    @BeforeEach
    void BeforeEach(){
        System.out.println("From Before Each.");
    }

    @AfterEach
    void AfterEach()
    {
        System.out.println("From After Each.");
    }

    @Test
    void dummyMethod()
    {
        System.out.println("From Dummy Method.");
    }
}