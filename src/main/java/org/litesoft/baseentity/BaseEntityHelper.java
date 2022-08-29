package org.litesoft.baseentity;

public class BaseEntityHelper {
    public static <T extends AbstractBaseEntity<T>> void setVersion( T entity, Long version ) {
        entity.setVersion(version);
    }
}
