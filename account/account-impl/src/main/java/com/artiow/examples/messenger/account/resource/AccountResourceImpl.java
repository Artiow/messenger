package com.artiow.examples.messenger.account.resource;

import com.artiow.examples.messenger.account.dto.AccountDto;
import com.artiow.examples.messenger.account.dto.SignUpDto;
import com.artiow.examples.messenger.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.notFound;

@RestController
@RequiredArgsConstructor
public class AccountResourceImpl implements AccountResource {

    private final AccountService accountService;


    @Override
    public ResponseEntity<Void> signUp(SignUpDto credentials) {
        accountService.signUp(credentials);
        return noContent().build();
    }

    @Override
    public ResponseEntity<AccountDto> get(Long id) {
        return accountService.get(id).map(ResponseEntity::ok).orElse(notFound().build());
    }
}
