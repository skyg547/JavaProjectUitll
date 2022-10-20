package com.ho.lib;

import com.ho.lib.lib;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        lib lib = new lib("hos", "log");

        System.out.println(lib.getMessage());
    }
}
