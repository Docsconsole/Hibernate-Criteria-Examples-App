package com.docsconsole.tutorials.hibernate5.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@Table(name = "cricketer")
public class Cricketer implements Serializable {

    private static final long serialVersionUID = 88889999998L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "player_type")
    private String playerType;
    @Column(name = "age")
    private Long age;
    @Column(name = "jersey_no")
    private Long jerseyNo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team")
    private CricketTeam cricketTeam;
    @Column(name = "salary_income")
    private Long salaryIncome;

}
