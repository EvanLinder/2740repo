package business;

import Business.Sensor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SensorTest {
    Sensor sensor1;

    @BeforeEach
    void setUp() {
        sensor1 = new Sensor(1, 1,"Air register");
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(78.8f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(86f);
        sensor1.addSensorReading(87.8f);
        sensor1.addSensorReading(86f);
        sensor1.addSensorReading(84.2f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(78.8f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(78.8f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
    }

    @Test
    void minReading() {
        assertEquals(72, this.sensor1.minReading());
    }

    @Test
    void maxReading() {
        assertEquals(88, this.sensor1.maxReading());
    }

    @Test
    void avgReading() {
        assertEquals(78, this.sensor1.avgReading());
    }
}