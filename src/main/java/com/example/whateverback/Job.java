package com.example.whateverback;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //직무번호
    @Column(nullable = false)
    private String job_mcd; //직무 상위 코드
    @Column(nullable = false)
    private String job_cd; //직무 코드
    @Column(nullable = false)
    private String name; //직무명
    @Column(nullable = false)
    private String keyword; //직무 키워드명

}
