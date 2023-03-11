package com.rcyh.budget.repository;

import com.rcyh.budget.model.entity.MethodPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodPaymentRepository extends JpaRepository<MethodPayment, Long> {
}
