package com.devoops.controller;


import com.devoops.component.BaseComponent;
import com.devoops.domain.Board;
import com.devoops.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController{

    private final BoardService boardService;

    @Autowired
    BaseComponent baseComponent;


    @GetMapping("/list/{category}")
    public List<Board> list (@PathVariable Map<String,Object> pathVal, Pageable pageable){
        return boardService.listBoard(Integer.parseInt(pathVal.get("category").toString()),pageable);
    }




}