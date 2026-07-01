package com.scaler.bookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@Entity
public class Show extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;
}
