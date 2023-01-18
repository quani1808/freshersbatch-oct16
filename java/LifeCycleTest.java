/*test case of program 4*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class LifeCycleTest
{
    LifeCycle L1;
    TestInfo testInfo;
    TestReporter testReporter;
    @Nested
    class AddTest
    {
        @Test
        void testAddPositive( )
        {
            assertEquals(4,L1.add(2,2),"gives the result of positive numbers");
        }
        @Test
        void testAddnegative()
        {
            assertEquals(-2,L1.add(-1,-1),"gives the result of positive numbers");
        }

    }
    @BeforeEach
    void init()

    {
        L1=new LifeCycle();
    }
    @AfterEach
    void cleanup()

    {
        System.out.println("do cleanup after every method");
    }
    @Test
    @DisplayName("a testing and a method")
    @Disabled
    void test()
    {
        int expected=10;
        int actual=L1.add(5,5);
        assertEquals(expected,actual,"The numbers must be added");
        System.out.println("this is the test file");
    }
    @Test
    void multiply()
    {
        assertAll(
                ()->assertEquals(4,L1.multiply(2,2)),
                ()->assertEquals(2,L1.multiply(2,1)),
                ()->assertEquals(6,L1.multiply(2,3)),
                ()->assertEquals(8,L1.multiply(2,4))
        );
    }
    @Test
    void computeCircleArea()
    {
        assertEquals(0,L1.computeCircleArea(10),"must cxaluculate the area of circlr");
    }
    @Test
    void Divide()

    {
        assertThrows(ArithmeticException.class,()->L1.Divide(5,0),"Division by zero is not possible");
    }

}