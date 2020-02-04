package com.artiow.examples.messenger.account.resource;

import com.artiow.examples.messenger.account.dto.AccountDto;
import com.artiow.examples.messenger.account.dto.SignUpDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
public interface AccountResource {

    @PostMapping("/sign-up")
    ResponseEntity<Void> signUp(@RequestBody SignUpDto credentials);

    @GetMapping("/{id}")
    ResponseEntity<AccountDto> get(@PathVariable("id") Long id);
}
