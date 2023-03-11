package com.rcyh.budget.repository;

import com.rcyh.budget.model.entity.Spending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendingRepository extends JpaRepository<Spending, Long> {
//    @Query(value = """
//
//            """)
//    Maybe<Spending> saveSpending(Spending spending);
}
