package com.raghavan.usermanagementservice.interfaces;

import com.raghavan.usermanagementservice.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserServices {
    void create(User user);
    Mono<User> findById(String id);
    Flux<User> findAll();
    Mono<User> update(User user);
    Mono<Void> delete(String id);

}
