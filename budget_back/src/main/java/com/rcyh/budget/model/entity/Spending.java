package com.rcyh.budget.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "spending")
public class Spending implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private Payment payment;
    @Nullable
    @OneToMany
    @JoinColumn(name = "details_id")
    private Set<Detail> details;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
