package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest{
    @Test
    void shouldHaveArea16for4x4(){
        Rectangle rectangle = new Rectangle(4, 4);
        assertEquals(16,rectangle.area());
    }
    
    @Test
    void shouldHaveArea20for4x5(){
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20,rectangle.area());
    }

    @Test
    void shouldHaveArea10for1x10(){
        Rectangle rectangle = new Rectangle(1, 10);
        assertEquals(10, rectangle.area());
    }
}