package com.rcyh.budget.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "budget_spending")
public class BudgetSpending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;
    @ManyToOne
    @JoinColumn(name = "spending_id")
    private Spending spending;
}
