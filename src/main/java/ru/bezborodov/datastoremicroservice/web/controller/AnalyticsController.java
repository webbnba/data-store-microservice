package ru.bezborodov.datastoremicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bezborodov.datastoremicroservice.model.MeasurementType;
import ru.bezborodov.datastoremicroservice.model.Summary;
import ru.bezborodov.datastoremicroservice.model.SummaryType;
import ru.bezborodov.datastoremicroservice.service.SummaryService;
import ru.bezborodov.datastoremicroservice.web.dto.SummaryDto;
import ru.bezborodov.datastoremicroservice.web.mapper.SummaryMapper;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/analytics")
public class AnalyticsController {

    private final SummaryService summaryService;
    private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDto getSummary(@PathVariable long sensorId,
                                 @RequestParam(value = "mt", required = false)
                                 Set<MeasurementType> measurementTypes,
                                 @RequestParam(value = "st", required = false)
                                 Set<SummaryType> summaryTypes) {
        Summary summary = summaryService.get(
                sensorId,
                measurementTypes,
                summaryTypes
        );
        return summaryMapper.toDto(summary);
    }
}
