package com.artiow.examples.messenger.account.domain.repository;

import com.artiow.examples.messenger.account.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
