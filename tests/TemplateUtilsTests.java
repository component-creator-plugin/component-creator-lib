import io.fabs.util.TemplateUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TemplateUtilsTests {

    @Test
    public void testAvailableVariables() {
        Map<String, String> map = TemplateUtils.createVariableMap("my-component");

        Assert.assertEquals("my-component", map.get("componentName"));
        Assert.assertEquals("myComponent", map.get("componentNameCamelCase"));
        Assert.assertEquals("MyComponent", map.get("componentNamePascalCase"));
    }
}
