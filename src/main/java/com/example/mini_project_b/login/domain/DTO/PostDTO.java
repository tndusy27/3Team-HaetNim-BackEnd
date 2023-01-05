package com.example.mini_project_b.login.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

    private Long id;

    @NotBlank
    @Size(max = 150)
    private String title;

    @NotBlank
    private String content;

    private String img;

    @NotBlank
    private boolean disclosure;
}