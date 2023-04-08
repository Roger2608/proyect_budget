package com.rcyh.budget.repository;

import com.rcyh.budget.model.entity.GroupFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupFamilyRespository extends JpaRepository<GroupFamily,Long> {
}
