package com.raghavan.usermanagementservice.repository;

import com.raghavan.usermanagementservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserMasterRepository extends JpaRepository<User, String> {
}
