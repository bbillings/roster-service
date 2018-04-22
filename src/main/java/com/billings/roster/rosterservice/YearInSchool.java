package com.billings.roster.rosterservice;

public enum YearInSchool {

    FRESHMAN("Freshman", "Fr", false),
    REDSHIRT_FRESHMAN("Freshman", "Fr", true),
    SOPHOMORE("Sophomore", "So", false),
    REDSHIRT_SOPHOMORE("Sophomore", "So", true),
    JUNIOR("Junior", "Jr", false),
    REDSHIRT_JUNIOR("Junior", "Jr", true),
    SENIOR("Senior", "Sr", false),
    REDSHIRT_SENIOR("Senior", "Sr", true);


    private final String description;
    private final String abbreviation;
    private final boolean hasRedshirted;

    YearInSchool(String description, String abbreviation, boolean hasRedshirted) {
        this.description = description;
        this.abbreviation = abbreviation;
        this.hasRedshirted = hasRedshirted;
    }

    
}