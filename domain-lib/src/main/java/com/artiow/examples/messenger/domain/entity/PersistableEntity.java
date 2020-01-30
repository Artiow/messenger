package com.artiow.examples.messenger.domain.entity;

import org.springframework.data.domain.Persistable;

public interface PersistableEntity extends Persistable<Long> {

    Long getVersion();
}
