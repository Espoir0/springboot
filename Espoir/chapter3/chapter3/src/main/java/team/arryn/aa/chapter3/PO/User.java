package team.arryn.aa.chapter3.PO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jpa_user2222")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32)
    private String name;
    @Column(length = 32)
    private String account;
    @Column(length = 64)
    private String pwd;
}