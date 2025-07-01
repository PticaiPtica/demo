package ru.academy.homework.demo.Home_work.OnetoOne.Two;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "licenseNumber")
    private String fullName;

    @Column(name= "issuedAt")
    private LocalDateTime issuedAt;

    @OneToOne(mappedBy = "license",cascade = CascadeType.ALL)
    private Driver driver;
}
