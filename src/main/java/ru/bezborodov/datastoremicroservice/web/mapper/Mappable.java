package ru.bezborodov.datastoremicroservice.web.mapper;

import java.util.List;

public interface Mappable<E, D> {

    E toEntity(D dto);

    List<E> toEntityList(List<D> dtoList);

    D toDto(E e);

    List<D> toDtoList(List<E> entityList);


}
