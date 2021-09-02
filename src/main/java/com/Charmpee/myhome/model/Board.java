package com.Charmpee.myhome.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @NotNull
    @Size(min=2, max=30, message = "제목은 2자 이상 입력해주십시오.")
    private String Title;
    private String Content;
}
