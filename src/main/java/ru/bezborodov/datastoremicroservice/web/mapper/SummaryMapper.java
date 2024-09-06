package ru.bezborodov.datastoremicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.bezborodov.datastoremicroservice.model.Summary;
import ru.bezborodov.datastoremicroservice.web.dto.SummaryDto;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
