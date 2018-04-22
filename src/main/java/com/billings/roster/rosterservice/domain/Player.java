package com.billings.roster.rosterservice.domain;

import javax.persistence.Entity;

@Entity
public class Player {

    private String firstName;
    private String lastName;
    private Integer heightInFeet;
    private Integer additionalInches;
    private Integer weight;
}
