import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Here is beforeAll()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Here is afterAll()");
    }


    @BeforeEach
    void beforeEach() {
        System.out.println("    Here is beforeEach()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("                Here is afterEach()");
    }

    @Test
    void firstTest() {
        System.out.println("        Here is firstTEST()");
    }

    @Test
    void secondTest() {
        System.out.println("          Here is secondTEST()");
    }

}
