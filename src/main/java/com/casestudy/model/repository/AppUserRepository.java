package com.casestudy.model.repository;

import com.casestudy.model.models.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser,Long> {
    AppUser findAppUserByUsername(String name);
}
