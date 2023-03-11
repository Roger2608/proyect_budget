package com.rcyh.budget.controller;

import com.rcyh.budget.model.entity.Spending;
import com.rcyh.budget.service.SpendingService;
import io.reactivex.rxjava3.core.Maybe;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spending")
@RequiredArgsConstructor
public class SpendingController {
    @Autowired
    SpendingService spendingService;

    @PostMapping("/save")
    public Maybe<Spending> saveSpending(@RequestBody Spending spending) {
        return spendingService.save(spending)
                .doOnError((e)-> System.out.println("Ha ocurrido un error ====> "+e))
                .doOnComplete(()-> System.out.println("Completado"));

    }
}
