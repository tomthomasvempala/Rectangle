package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class RectangleTest{
    @Test
    void shouldReturnAreaAs16WhenLengthIs4AndBreadthIs4(){
        Rectangle rectangle = new Rectangle(4, 4);
        int area = rectangle.area();
        assertThat(area, is(equalTo(16)));
    }
    
    @Test
    void shouldReturnAreaAs20WhenLengthIs4AndBreadthIs5(){
        Rectangle rectangle = new Rectangle(4, 5);
        int area = rectangle.area();
        assertThat(area, is(equalTo(20)));
    }

    @Test
    void shouldReturnAreaAs10WhenLengthIs1AndBreadthIs10(){
        Rectangle rectangle = new Rectangle(1, 10);
        int area = rectangle.area();
        assertThat(area, is(equalTo(10)));
    }
}