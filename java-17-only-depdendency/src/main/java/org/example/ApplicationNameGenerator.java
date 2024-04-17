package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Hello world!
 *
 */
public class ApplicationNameGenerator
{

    public String createEncodedAppName(String AppName){
        String name = "ApplicationName";
        return Base64.getEncoder().encodeToString(name.getBytes(StandardCharsets.UTF_8));
    }
}
