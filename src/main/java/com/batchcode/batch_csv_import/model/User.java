package com.batchcode.batch_csv_import.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_data")
@Data
public class User {

    @Id
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "contactNo")
    private String contactNo;
    @Column(name = "country")
    private String country;
    @Column(name = "dob")
    private String dob;
}
