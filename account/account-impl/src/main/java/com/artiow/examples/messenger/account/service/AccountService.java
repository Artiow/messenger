package com.artiow.examples.messenger.account.service;

import com.artiow.examples.messenger.account.domain.entity.UserEntity;
import com.artiow.examples.messenger.account.domain.repository.UserRepository;
import com.artiow.examples.messenger.account.dto.AccountDto;
import com.artiow.examples.messenger.account.dto.SignUpDto;
import com.artiow.examples.messenger.account.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;


    @Transactional
    public void signUp(SignUpDto credentials) {
        userRepository.save(encode(userMapper.fromSignUp(credentials)));
    }

    @Transactional(readOnly = true)
    public Optional<AccountDto> get(Long id) {
        return userRepository.findById(id).map(userMapper::toAccount);
    }


    private UserEntity encode(UserEntity entity) {
        return entity.setPassword(passwordEncoder.encode(entity.getPassword()));
    }
}
