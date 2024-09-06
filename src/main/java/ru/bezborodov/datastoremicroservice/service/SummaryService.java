package ru.bezborodov.datastoremicroservice.service;

import ru.bezborodov.datastoremicroservice.model.Data;
import ru.bezborodov.datastoremicroservice.model.MeasurementType;
import ru.bezborodov.datastoremicroservice.model.Summary;
import ru.bezborodov.datastoremicroservice.model.SummaryType;

import java.util.Set;

public interface SummaryService {

    Summary get(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

    void handle(Data data);
}
