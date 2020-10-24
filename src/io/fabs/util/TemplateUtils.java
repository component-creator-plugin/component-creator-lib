package io.fabs.util;

import java.util.HashMap;
import java.util.Map;

public class TemplateUtils {

    /**
     * Create map with default transformations of component name
     */
    public static Map<String, Object> createVariableMap(String componentName) {
        Map<String, Object> templateModel = new HashMap<>();
        templateModel.put("componentName", componentName);
        templateModel.put("componentNameCamelCase", StringFormatter.toCamelCase(componentName));
        templateModel.put("componentNamePascalCase", StringFormatter.toPascalCase(componentName));
        return templateModel;
    }
}
