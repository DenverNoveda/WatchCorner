package com.mobdeve.s13_demesa_noveda.mobdeve_mc02;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {
    private String reviewMovieName;
    private String reviewContent;
    private Date reviewPublished;
    private User reviewAuthor;
    private float rating;

}
