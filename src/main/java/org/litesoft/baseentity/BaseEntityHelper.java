package org.litesoft.baseentity;

/**
 * Backdoor to set version number for Entities using "jpa-base-entity" library.
 */
public class BaseEntityHelper {
    public static <T extends AbstractBaseEntity<T>> void setVersion( T entity, Long version ) {
        entity.setVersion(version);
    }
}
