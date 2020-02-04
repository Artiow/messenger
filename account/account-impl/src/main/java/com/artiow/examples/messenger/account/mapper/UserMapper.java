package com.artiow.examples.messenger.account.mapper;

import com.artiow.examples.messenger.account.domain.entity.UserEntity;
import com.artiow.examples.messenger.account.dto.AccountDto;
import com.artiow.examples.messenger.account.dto.SignUpDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    AccountDto toAccount(UserEntity entity);

    UserEntity fromSignUp(SignUpDto dto);
}
