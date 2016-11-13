package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yongyeon on 2016-08-15.
 */
public interface BoardRepository extends JpaRepository<BoardVO, Long> {
}
