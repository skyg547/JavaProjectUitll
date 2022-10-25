/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.app;

import org.junit.Test;

import com.ho.gradle.App;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    public void testApp() {
        String name = "hoge";
        App app = new App();
        assertNotNull(app);
        assertTrue(app.showMessage(name));

        try {
            assertTrue(app.getMessage(name),  true);
        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}
