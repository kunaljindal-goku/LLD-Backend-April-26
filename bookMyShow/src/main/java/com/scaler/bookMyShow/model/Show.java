package com.scaler.bookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@Entity
public class Show extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Theatre theatre;

    private Date startTime;

    private Date endTime;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> seats;

    @OneToMany(mappedBy = "show")
    private List<ShowSeatType> showSeatTypes;
}
