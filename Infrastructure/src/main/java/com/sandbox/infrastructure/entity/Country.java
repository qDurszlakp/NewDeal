package com.sandbox.infrastructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "COUNTRIES")
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue
    @Column(name = "COUNTRY_ID")
    private Long id;

    @Column(name = "COUNTRY")
    private String name;

    @Column(name = "CODE")
    private String code;

    @Column(name = "INS_TIME")
    private LocalDateTime insertTime;

}
