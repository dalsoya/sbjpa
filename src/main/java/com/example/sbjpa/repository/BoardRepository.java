package com.example.sbjpa.repository;

import java.util.List;

import com.example.sbjpa.model.Board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

    @Query(value = "SELECT id FROM board ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Board findLastBoard();

    // https://jforj.tistory.com/90
    @Query(value = "SELECT * FROM board ORDER BY id DESC LIMIT 2 OFFSET :offset", nativeQuery = true)
    List<Board> findBoardsOffset(@Param(value = "offset") int offset);
}
