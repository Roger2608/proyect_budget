package com.rcyh.budget.service;

import com.rcyh.budget.model.entity.GroupFamily;
import io.reactivex.rxjava3.core.Flowable;

public interface GroupFamilyService {
    public Flowable<GroupFamily> findAll();
}
