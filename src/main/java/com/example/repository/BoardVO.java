package com.example.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by yongyeon on 2016-08-15.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bno;
    private String title;
    private String content;
}
