package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestHello {

   @Test
   public void testHelloWorld()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Hello.main(null);

     // assertion
     assertEquals("Hello world!", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
    @Test
    public void testAdd(){
       Hello h = new Hello();
       int res = h.add(2,3);
        // assertion
        assertEquals(res, 5);
   }
}
