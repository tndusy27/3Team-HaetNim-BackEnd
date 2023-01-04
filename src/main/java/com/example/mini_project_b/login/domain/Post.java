package com.example.mini_project_b.login.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Table(name = "post")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = 150)
    private String title;

    @Column(name = "content", nullable = false, length = 500)
    private String content;

    @Column(name = "img", nullable = true,length = 150)
    private String img;

    @Column(name = "disclosure", nullable = false)
    private boolean disclosure;

    @ManyToOne(targetEntity = Member.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;


//    @OneToMany(mappedBy = "posts", fetch=FetchType.LAZY, cascade={CascadeType.ALL})
//    @JoinTable(name="post_hashtag", joinColumns=@JoinColumn(name="post_id"), inverseJoinColumns=@JoinColumn(name="hashtag_id"))
//    private List<PostHashtag> postHashtags = new ArrayList<PostHashtag>();



}
