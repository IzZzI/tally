package com.zhouzy.tally.repository;

import com.zhouzy.tally.entity.Tally;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TallyRepository extends JpaRepository<Tally, Integer> {
}
