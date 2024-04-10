package org.example;

import sun.misc.BASE64Encoder;

import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class ApplicationNameGenerator
{

    public String createEncodedAppName(String AppName){
        String name = "ApplicationName";
        return new BASE64Encoder().encode(name.getBytes(StandardCharsets.UTF_8));
    }
}
