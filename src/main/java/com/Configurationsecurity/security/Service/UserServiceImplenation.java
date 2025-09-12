package com.Configurationsecurity.security.Service;

import com.Configurationsecurity.security.DTOModel.UserDetail;
import com.Configurationsecurity.security.Entity.UserEntity;
import com.Configurationsecurity.security.Repository.UserRepo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class UserServiceImplenation implements UserDetailsService {

    private final UserRepo userRepo;

    public UserServiceImplenation(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user=userRepo.findByUserName(username);
        if(Objects.nonNull(user))
        {
            return new UserDetail(user);
        }throw new UsernameNotFoundException("User is not present ");
    }
}
