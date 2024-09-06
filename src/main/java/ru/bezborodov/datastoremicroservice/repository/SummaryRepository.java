package ru.bezborodov.datastoremicroservice.repository;

import ru.bezborodov.datastoremicroservice.model.Data;
import ru.bezborodov.datastoremicroservice.model.MeasurementType;
import ru.bezborodov.datastoremicroservice.model.Summary;
import ru.bezborodov.datastoremicroservice.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(long sensorId,
                                    Set<MeasurementType> measurementTypes,
                                    Set<SummaryType> summaryTypes);

    void handle(Data data);
}
