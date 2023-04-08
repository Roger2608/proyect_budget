package com.rcyh.budget.controller;

import com.rcyh.budget.model.entity.GroupFamily;
import com.rcyh.budget.service.GroupFamilyService;
import io.reactivex.rxjava3.core.Flowable;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("groupFamily")
@RequiredArgsConstructor
public class GroupFamilyController {
    @Autowired
    GroupFamilyService groupFamilyService;

    @GetMapping("/findAll")
    public Flowable<GroupFamily> saveSpending() {
        return groupFamilyService.findAll()
                .doOnError((e)-> System.out.println("Ha ocurrido un error ====> "+e))
                .doOnComplete(()-> System.out.println("Completado"));
    }
}
