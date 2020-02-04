package com.artiow.examples.messenger.account.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class AccountDto {

    private Long id;
    private Long version;
    private String login;
}
