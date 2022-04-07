package com.curios.crud_lms_sboot.repository;

import com.curios.crud_lms_sboot.model.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Companies,Long> {

}
