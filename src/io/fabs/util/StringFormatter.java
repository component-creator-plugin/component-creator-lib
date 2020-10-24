package io.fabs.util;
import com.google.common.base.CaseFormat;


public class StringFormatter {
    public static String toCamelCase(String input) {
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, input);
    }

    public static String toPascalCase(String input) {
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, input);
    }
}
