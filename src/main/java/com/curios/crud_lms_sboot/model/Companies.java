package com.curios.crud_lms_sboot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Companies {
    @Id
    @GeneratedValue
    private Long companyId;
    private String companyName;
    private String locatedCountry;
}
