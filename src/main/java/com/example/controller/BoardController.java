package com.example.controller;

import com.example.repository.BoardRepository;
import com.example.repository.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yongyeon on 2016-08-15.
 */
@Controller
public class BoardController {

    @Autowired
    BoardRepository boardRepository;

    /**
     * 목록
     * @param model
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(Model model) {
        //model.addAttribute("list",boardRepository.findAll());
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        model.addAttribute("list", list);
        return "/board/list.tiles";
    }

    /**
     * 상세보기
     * @param model
     * @return
     */
    @RequestMapping(value = "/content")
    public String content(Model model) {
        return "/board/content.tiles";
    }

    /**
     * 글쓰기
     * @param model
     * @return
     */
    @RequestMapping(value = "/write_proc")
    @ResponseBody  public String write_proc(Model model, @ModelAttribute(value = "boardVO") BoardVO boardVO) {
        return boardRepository.save(boardVO).toString();
    }

    /**
     * 글수정
     * @param model
     * @return
     */
    @RequestMapping(value = "/edit")
    public String edit(Model model) {
        return "edit.tiles";
    }

    /**
     * 글삭제
     * @param model
     * @return
     */
    @RequestMapping(value = "/delete")
    public String delete(Model model) {
        return "delete.tiles";
    }

}
