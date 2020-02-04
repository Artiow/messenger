package com.artiow.examples.messenger.account.domain.entity;

import com.artiow.examples.messenger.domain.entity.AbstractAuditableEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "user")
@Entity(name = "user")
@Accessors(chain = true)
public class UserEntity extends AbstractAuditableEntity {

    @Basic(optional = false)
    private String login;

    @Basic(optional = false)
    private String password;
}
