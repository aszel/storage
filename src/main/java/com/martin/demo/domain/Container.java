package com.martin.demo.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "containers")
@Data
public class Container {
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "comment")
    private String comment;

    @Basic
    @Column(name = "owner")
    private Integer owner;
}
