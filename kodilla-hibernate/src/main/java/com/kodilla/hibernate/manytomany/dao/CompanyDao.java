package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {//nie wprowadza nowych met., udostępnia standarowo dostępne
	@Query(nativeQuery = true)
	List<Company> retriveCompanyNameByFirst3Letters(@Param("COMPANY_NAME") String name);
}
