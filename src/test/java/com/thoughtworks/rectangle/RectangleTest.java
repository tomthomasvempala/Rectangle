package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest{
    @Test
    void shouldReturnAreaAs16WhenLengthIs4AndBreadthIs4(){
        Rectangle rectangle = new Rectangle(4, 4);
        assertEquals(16,rectangle.area());
    }
    
    @Test
    void shouldReturnAreaAs20WhenLengthIs4AndBreadthIs5(){
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20,rectangle.area());
    }

    @Test
    void shouldReturnAreaAs10WhenLengthIs1AndBreadthIs10(){
        Rectangle rectangle = new Rectangle(1, 10);
        assertEquals(10, rectangle.area());
    }
}