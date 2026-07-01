package com.scaler.bookMyShow.model;

import jakarta.persistence.*;

@Entity
public class Theatre extends BaseEntity{

    private String name;

    @Enumerated(EnumType.STRING)
    private TheatreStatus status;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

//    @ManyToOne
//    @JoinColumn
//    private TheatreStatus status;
}
