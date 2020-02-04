package com.artiow.examples.messenger.account.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class SignUpDto {

    private String login;
    private String password;
}
