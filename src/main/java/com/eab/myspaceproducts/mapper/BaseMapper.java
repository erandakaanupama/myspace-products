package com.eab.myspaceproducts.mapper;

/**
 * Base mapper
 * @param <E> mapped entity
 * @param <D> mapped dto
 */
public interface BaseMapper<E, D> {

    public E mapToEntity(D dto);

    public D mapFromEntity(E entity);
}
