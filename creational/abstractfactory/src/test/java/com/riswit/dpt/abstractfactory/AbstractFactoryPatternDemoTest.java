package com.riswit.dpt.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AbstractFactoryPatternDemoTest {
    AbstractFactoryPatternDemo abstractFactoryPatternDemo;

    @BeforeEach
    public void setup() {
        abstractFactoryPatternDemo = new AbstractFactoryPatternDemo();
    }

    @Test
    void shouldReturnError(){
        //given
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        //when
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        //then
//        Assertions.assertTrue(shape1.);
//        Assertions.assertEquals("Inside Rectangle::draw() method.", shape1.draw());
    }
}
