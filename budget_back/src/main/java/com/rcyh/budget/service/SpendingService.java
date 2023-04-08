package com.rcyh.budget.service;


import com.rcyh.budget.model.entity.Spending;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;

public interface SpendingService {
    public Maybe<Spending> save(Spending spending);//guarda los gastos
    public Flowable<Spending> findAll();//lista todos los gastos
    public Flowable<Spending> findAllByGroupFamily(Long id);//lista todos los gastos
//    public Flowable<Spending> findAllByDate(int id,Date lastMonth);//busca gastos del ultimo mes
//    public Flowable<Spending> findAllByDate(int id, Date fromDate, Date toDate); //busca gastos por ramgo de fechas
}
