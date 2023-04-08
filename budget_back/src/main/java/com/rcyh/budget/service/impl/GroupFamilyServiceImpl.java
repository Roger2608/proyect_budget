package com.rcyh.budget.service.impl;

import com.rcyh.budget.model.entity.GroupFamily;
import com.rcyh.budget.repository.GroupFamilyRespository;
import com.rcyh.budget.service.GroupFamilyService;
import io.reactivex.rxjava3.core.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupFamilyServiceImpl implements GroupFamilyService {
    @Autowired
    GroupFamilyRespository groupFamilyRespository;

    @Override
    public Flowable<GroupFamily> findAll() {
        return Flowable.fromIterable(groupFamilyRespository.findAll());
    }
}
