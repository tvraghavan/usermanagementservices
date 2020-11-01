package com.raghavan.usermanagementservice.services;

import com.raghavan.usermanagementservice.interfaces.IUserServices;
import com.raghavan.usermanagementservice.model.User;
import com.raghavan.usermanagementservice.repository.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class UserServices implements IUserServices {

    @Autowired
    UserMasterRepository userMasterRepository;

    @Override
    public void create(User user) {
        user.setId(UUID.randomUUID().toString());
        userMasterRepository.save(user);
    }

    @Override
    public Mono<User> findById(String id) {
        return Mono.justOrEmpty(userMasterRepository.findById(id));
    }

    @Override
    public Flux<User> findAll() {
        return Flux.fromIterable(userMasterRepository.findAll());
    }

    @Override
    public Mono<User> update(User user) {
        return Mono.just(userMasterRepository.save(user));
    }

    @Override
    public Mono<Void> delete(String id) {
        userMasterRepository.deleteById(id);
        return Mono.empty();
    }
}
