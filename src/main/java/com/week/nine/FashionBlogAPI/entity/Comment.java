package com.week.nine.FashionBlogAPI.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Comment extends BaseClass {


    private String Content;

    @ManyToOne
    @JoinColumn
    private Post posts;

    @ManyToOne
    @JoinColumn
    private BlogUser blogUser;

    private LocalDateTime createdAt;

    @OneToMany
    @JoinColumn(name = "comments_id")
    private List<Likes> likes=new ArrayList<>();


}
