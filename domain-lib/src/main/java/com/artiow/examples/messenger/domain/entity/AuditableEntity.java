package com.artiow.examples.messenger.domain.entity;

import com.artiow.examples.messenger.audit.UserSnapshot;
import org.springframework.data.domain.Auditable;

import java.time.LocalDateTime;

public interface AuditableEntity extends PersistableEntity, Auditable<UserSnapshot, Long, LocalDateTime> {

}
