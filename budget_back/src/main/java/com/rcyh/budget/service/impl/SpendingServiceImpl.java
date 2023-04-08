package com.rcyh.budget.service.impl;

import com.rcyh.budget.model.entity.Spending;
import com.rcyh.budget.repository.SpendingRepository;
import com.rcyh.budget.service.SpendingService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SpendingServiceImpl implements SpendingService {

    @Autowired
    SpendingRepository spendingRepository;

    @Override
    public Maybe<Spending> save(Spending spending) {
        return Maybe.just(spendingRepository.save(spending));
    }

    @Override
    public Flowable<Spending> findAll() {
        return Flowable.fromIterable(spendingRepository.findAll());
    }

    @Override
    public Flowable<Spending> findAllByGroupFamily(Long id) {
        return Flowable.fromIterable(spendingRepository.findAll())
                .filter(spending -> spending.getUser().getGroupFamilyId() == id);
    }
}
