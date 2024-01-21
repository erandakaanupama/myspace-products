package com.eab.myspaceproducts.mapper;

/**
 * Base mapper
 * @param <E> mapped entity
 * @param <D> mapped dto
 */
public interface BaseMapper<E, D> {

    E mapToEntity(D dto);

    D mapFromEntity(E entity);
}
