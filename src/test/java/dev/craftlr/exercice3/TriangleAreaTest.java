package dev.craftlr.exercice3;

import org.junit.jupiter.api.*;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@Disabled("Remove to activate")
class TriangleAreaTest {
    private TriangleArea triangleArea;
    private PrintStream out;

    @BeforeEach
    public void setUp() throws Exception {
        triangleArea = new TriangleArea();
        out = mock(PrintStream.class);
        System.setOut(out);
    }

    @Disabled("Remove to activate")
    @Test
    void should_an_empty_triangle_have_a_zero_area() throws Exception {
        assertThat(triangleArea.getArea()).isZero();
    }

    @Disabled("Remove to activate")
    @Test
    void should_an_unity_triangle_have_a_0_5_area() throws Exception {
        triangleArea.setP1(0, 0);
        triangleArea.setP2(1, 0);
        triangleArea.setP3(0, 1);
        assertThat(triangleArea.getArea()).isEqualTo(0.5);
    }

    @Disabled("Remove to activate")
    @Test
    void should_triangle1_have_a_correct_area() throws Exception {
        triangleArea.setP1(0, 0);
        triangleArea.setP2(6, 0);
        triangleArea.setP3(4, 3);
        assertThat(triangleArea.getArea()).isEqualTo(9);
    }

    @Disabled("Remove to activate")
    @Test
    void should_triangle2_have_a_correct_area() throws Exception {
        triangleArea.setP1(1, 0);
        triangleArea.setP2(2, 2);
        triangleArea.setP3(0, 1);
        assertThat(triangleArea.getArea()).isEqualTo(1.5);
    }

    @Disabled("Remove to activate")
    @Test
    void printResult() throws Exception {
        triangleArea.setP1(0, 0);
        triangleArea.setP2(6, 0);
        triangleArea.setP3(4, 3);
        triangleArea.printResult();
        verify(out).println("For P1(0,0), P2(6,0), P3(4,3), the area of triangle ABC is 9.0");
    }

    @Disabled("Remove to activate")
    @Test
    void areaPositive() throws Exception {
        triangleArea.setP1(0, 0);
        triangleArea.setP2(5, 5);
        triangleArea.setP3(5, 0);
        triangleArea.printResult();
        verify(out).println("For P1(0,0), P2(5,5), P3(5,0), the area of triangle ABC is 12.5");
    }
}