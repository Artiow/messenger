package com.artiow.examples.messenger.account.domain.entity;

import com.artiow.examples.messenger.domain.entity.AbstractAuditableEntity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends AbstractAuditableEntity {

    @Basic(optional = false)
    private String login;

    @Basic(optional = false)
    private String password;
}
