package com.cjc.hl.enquiry.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.enquiry.main.model.CibilSCore;
@Repository
public interface CibilRepository extends JpaRepository<CibilSCore, Integer>{

}
