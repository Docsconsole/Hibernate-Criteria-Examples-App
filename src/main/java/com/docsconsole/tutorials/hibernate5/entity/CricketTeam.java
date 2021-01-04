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
@Table(name = "cricket_team")
public class CricketTeam implements Serializable {

    private static final long serialVersionUID = 88889999998L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nation")
    private String nation;
    @Column(name = "board_name")
    private String boardName;

}
