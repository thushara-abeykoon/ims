package com.lahiru.ims.features.user.impl;

import com.lahiru.ims.exception.DataConflictException;
import com.lahiru.ims.features.user.UserEntity;
import com.lahiru.ims.features.user.UserRepo;
import com.lahiru.ims.features.user.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public void saveUser(String username, String password) throws Exception {
        if (!userRepo.existsByUsername(username)) {
            String encodedPassword = passwordEncoder.encode(password);
            userRepo.save(new UserEntity(username, encodedPassword));
        }
    }
}
