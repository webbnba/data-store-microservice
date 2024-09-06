package ru.bezborodov.datastoremicroservice.config;

import ru.bezborodov.datastoremicroservice.model.MeasurementType;

public class RedisSchema {

    //set
    public static String sensorKeys() {
        return KeyHelper.getKey("sensors");
    }

    //hash with summary types
    public static String summaryKey(
            long sensorId,
            MeasurementType measurementType
    ) {
        return KeyHelper.getKey("sensors:" + sensorId + ":" + measurementType.name().toLowerCase());
    }
}
