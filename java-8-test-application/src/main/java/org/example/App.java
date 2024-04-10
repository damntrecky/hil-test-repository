package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void test()
    {
        System.out.println( "Hello World!" );
        String applicationName = "AppName";
        ApplicationNameGenerator applicationNameGenerator = new ApplicationNameGenerator();
        System.out.println("Generated App Name:" + applicationNameGenerator.createEncodedAppName(applicationName));

    }
}
