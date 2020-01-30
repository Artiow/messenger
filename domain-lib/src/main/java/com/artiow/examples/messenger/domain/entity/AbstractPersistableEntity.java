package com.artiow.examples.messenger.domain.entity;

import lombok.Getter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.Objects;

import static java.util.Objects.isNull;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@MappedSuperclass
public abstract class AbstractPersistableEntity implements PersistableEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Version
    private Long version = 0L;


    @Override
    public boolean isNew() {
        return isNull(this.id);
    }


    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(ProxyUtils.getUserClass(obj))) {
            return false;
        }
        return Objects.equals(this.getId(), ((AbstractPersistable<?>) obj).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
