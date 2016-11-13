package com.example

import com.example.repository.BoardRepository
import com.example.repository.BoardVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * Created by yongyeon on 2016-08-14.
 */
@ContextConfiguration // not mentioned by docs, but had to include this for Spock to startup the Spring context
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BoardBasicTest extends Specification{

    @Autowired
    BoardRepository boardRepository;

    def "글을 작성 합니다."() {
        given:
            BoardVO b = new BoardVO()
            b.setTitle("글 작성 합니다.");

        when:
            def expected = boardRepository.save(b).findAll()

        then:
            expected == boardRepository.findAll()
    }

    def "글을 수정 합니다."() {
        given:
            BoardVO b = new BoardVO()
            b.setTitle("글 작성 합니다.");

        when:
            boardRepository.save(b)
            BoardVO editBno = new BoardVO()
            editBno.setBno(boardRepository.findOne(1+"").getBno())
            editBno.setTitle("글 수정 합니다.")
            def expected = boardRepository.save(editBno).findAll()

        then:
            expected == boardRepository.findAll()
    }

    def "상세 글을 확인 합니다."() {
        given:
            BoardVO b = new BoardVO()
            b.setTitle("상세 제목을 작성합니다. ");
            b.setContents("상세 내용 입니다.")

        when:
            def expected = boardRepository.findOne(1+"")

        then:
            expected == boardRepository.findOne(editBno)
    }

    def "글을 삭제 합니다."() {
        given:
            BoardVO b = new BoardVO()
            b.setTitle("글 삭제 테스트");

        when:
            def expected = boardRepository.delete(b).findAll()

        then:
            expected == boardRepository.findAll()
    }
}
