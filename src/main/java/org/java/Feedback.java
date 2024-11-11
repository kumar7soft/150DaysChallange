package org.java;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Feedback {

    private String customerId;
    private Double rating;

    private String comment;

    public Feedback(String customerId,Double rating,String comment){
        this.customerId=customerId;
        this.rating=rating;
        this.comment=comment;
    }

}


class FeedbackDTO{
    public List<Feedback> getFeedBackList(){
        List<Feedback> list = Arrays.asList(
                new Feedback("1", 4.5, "Excellent"),
                new Feedback("2", 4.0, "Good"),
                new Feedback("3", 5.0, "Excellent")
                );
        return list;
    }

}
