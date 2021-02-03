package com.casestudy.model.service.approle;

import com.casestudy.model.models.AppRole;
import com.casestudy.model.service.IService;

import java.util.Optional;

public interface IAppRoleService extends IService<AppRole> {
    Iterable<AppRole> findAll();

    Optional<AppRole> findById(Long id);

    void delete(Long id);

    AppRole save(AppRole appRole);
}
