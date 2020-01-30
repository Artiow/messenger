package com.artiow.examples.messenger.domain.entity;

import com.artiow.examples.messenger.audit.UserSnapshot;
import com.artiow.examples.messenger.domain.util.LocalDateTimeUtil;
import org.springframework.lang.NonNull;

import javax.persistence.Basic;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import static javax.persistence.TemporalType.TIMESTAMP;

@MappedSuperclass
public abstract class AbstractAuditableEntity extends AbstractPersistableEntity implements AuditableEntity {

    @Basic
    private Long createdById;

    @Basic
    @Temporal(TIMESTAMP)
    private Date createdDate;

    @Basic
    private Long lastModifiedById;

    @Basic
    @Temporal(TIMESTAMP)
    private Date lastModifiedDate;


    @NonNull
    @Override
    public Optional<UserSnapshot> getCreatedBy() {
        return Optional.ofNullable(this.createdById).map(id -> (() -> id));
    }

    @Override
    public void setCreatedBy(UserSnapshot createdBy) {
        this.createdById = createdBy.getId();
    }

    @NonNull
    @Override
    public Optional<LocalDateTime> getCreatedDate() {
        return Optional.ofNullable(createdDate).map(LocalDateTimeUtil::mapToLocalDateTime);
    }

    @Override
    public void setCreatedDate(@NonNull LocalDateTime creationDate) {
        this.createdDate = LocalDateTimeUtil.mapToDate(creationDate);
    }

    @NonNull
    @Override
    public Optional<UserSnapshot> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedById).map(id -> (() -> id));
    }

    @Override
    public void setLastModifiedBy(UserSnapshot lastModifiedBy) {
        this.lastModifiedById = lastModifiedBy.getId();
    }

    @NonNull
    @Override
    public Optional<LocalDateTime> getLastModifiedDate() {
        return Optional.ofNullable(lastModifiedDate).map(LocalDateTimeUtil::mapToLocalDateTime);
    }

    @Override
    public void setLastModifiedDate(@NonNull LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = LocalDateTimeUtil.mapToDate(lastModifiedDate);
    }
}
