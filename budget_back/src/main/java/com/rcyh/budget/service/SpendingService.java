package com.rcyh.budget.service;


import com.rcyh.budget.model.entity.Spending;
import io.reactivex.rxjava3.core.Maybe;

public interface SpendingService {
//    public Maybe<Spending> save(int id, Spending spending);//guarda los gastos
    public Maybe<Spending> save(Spending spending);//guarda los gastos
//    public Flowable<Spending> findAll(int id,Date lastMonth);//busca gastos del ultimo mes
//    public Flowable<Spending> findAll(int id, Date fromDate, Date toDate); //busca gastos por ramgo de fechas
}
