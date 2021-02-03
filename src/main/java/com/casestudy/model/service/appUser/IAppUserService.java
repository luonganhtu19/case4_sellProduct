package com.casestudy.model.service.appUser;


import com.casestudy.model.models.AppUser;
import com.casestudy.model.service.IService;

import java.util.Optional;

public interface IAppUserService extends IService<AppUser> {
    AppUser getUserByName(String name);
    AppUser getCurrentUser();

    Iterable<AppUser> findAll();

    Optional<AppUser> findById(Long id);

    void delete(Long id);

    AppUser save(AppUser appUser);
}
