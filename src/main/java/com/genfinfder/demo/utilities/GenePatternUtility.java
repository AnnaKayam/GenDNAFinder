package com.genfinfder.demo.utilities;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public final class GenePatternUtility {
    private static final String PREFIX = "AAAAAAAAAAA";
    private static final String patternStringWithoutPrefix = "[ACGT]*";
    private static final String patternStringWithPrefix = PREFIX + patternStringWithoutPrefix;
    private static final String patternInputString = "^" + patternStringWithPrefix + "$";
    private static final Pattern patternWithOutPrefix = Pattern.compile(patternStringWithoutPrefix);
    private static final Pattern patternWithPrefix = Pattern.compile(patternInputString);

    public static String getPrefix() {
        return PREFIX;
    }

    public static String getStringWithoutPrefix(String str) {
        return str.substring(PREFIX.length());
    }

    public static boolean isPatternWithoutPrefixValid(String str) {
        return patternWithOutPrefix.matcher(str).matches();
    }

    public static boolean isPatternWithPrefixValid(String str) {
        return patternWithPrefix.matcher(str).matches();
    }
}
