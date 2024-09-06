package ru.bezborodov.datastoremicroservice.repository;

import ru.bezborodov.datastoremicroservice.model.MeasurementType;
import ru.bezborodov.datastoremicroservice.model.Summary;
import ru.bezborodov.datastoremicroservice.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public class SummaryRepositoryImpl implements SummaryRepository {
    @Override
    public Optional<Summary> findBySensorId(long sensorId, Set<MeasurementType> measurementTypes, Set<SummaryType> summaryTypes) {
        return Optional.empty();
    }
}
