package com.bunker.bunkerframework.mapper;

import java.util.List;
import java.util.stream.StreamSupport;

public interface ModelMapper<Model, Dto> {

    Dto modelToDto(Model model);

    default List<Dto> modelToDto(List<Model> models) {
        if (models == null) {
            return null;
        }

        return models.stream().map(this::modelToDto).toList();
    }

    default List<Dto> modelToDto(Iterable<Model> models) {
        if (models == null) {
            return null;
        }

        return StreamSupport.stream(models.spliterator(), false).map(this::modelToDto).toList();
    }

    Model dtoToModel(Dto dto);

    default List<Model> dtoToModel(List<Dto> dtos) {
        if (dtos == null) {
            return null;
        }

        return dtos.stream().map(this::dtoToModel).toList();
    }

    default List<Model> dtoToModel(Iterable<Dto> dtos) {
        if (dtos == null) {
            return null;
        }

        return StreamSupport.stream(dtos.spliterator(), false).map(this::dtoToModel).toList();
    }
}
