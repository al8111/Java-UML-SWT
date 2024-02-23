package org.acme.prototype;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.acme.prototype.model.Car;
import org.junit.jupiter.api.Test;

class ModelTest {


    @Test
    void verifyIfDataSourceIsWorking() {
        
    	assertNotNull(Car.all);
    }

}

