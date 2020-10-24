import io.fabs.util.StringFormatter;
import org.junit.Assert;
import org.junit.Test;

public class StringFormatterTests {
    // Camel case
    @Test
    public void testToCamelCase() {
        String name = StringFormatter.toCamelCase("mymodule");
        Assert.assertEquals("mymodule", name);
    }

    @Test
    public void testToCamelCaseWithSnakeCaseInput() {
        String name = StringFormatter.toCamelCase("my-module");
        Assert.assertEquals("myModule", name);
    }

    @Test
    public void testToCamelCaseWithCamelCaseInput() {
        String name = StringFormatter.toCamelCase("myModule");
        Assert.assertEquals("mymodule", name);
    }

    @Test
    public void testToCamelCaseWithPascalCaseInput() {
        String name = StringFormatter.toCamelCase("MyModule");
        Assert.assertEquals("mymodule", name);
    }

    // Pascal Case
    @Test
    public void testToPascalCase() {
        String name = StringFormatter.toPascalCase("mymodule");
        Assert.assertEquals("Mymodule", name);
    }

    @Test
    public void testToPascalCaseWithSnakeCaseInput() {
        String name = StringFormatter.toPascalCase("my-module");
        Assert.assertEquals("MyModule", name);
    }

    @Test
    public void testToPascalCaseWithCamelCaseInput() {
        String name = StringFormatter.toPascalCase("myModule");
        Assert.assertEquals("Mymodule", name);
    }

    @Test
    public void testToPascalCaseWithPascalCaseInput() {
        String name = StringFormatter.toPascalCase("MyModule");
        Assert.assertEquals("Mymodule", name);
    }

}
