package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
	@Autowired
	CompanyDao companyDao;
	@Autowired
	EmployeeDao employeeDao;

	@Test
	public void testSaveManyToMany() {
		//Given
		Employee johnsmith = new Employee("John", "Smith");
		Employee stephanieclarcson = new Employee("Stephanie", "Clarcson");
		Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

		Company softwareMachine = new Company("Software Machine");
		Company dataMaesters = new Company("Data Maesters");
		Company greyMatter = new Company("Grey Matter");

		softwareMachine.getEmployees().add(johnsmith);
		dataMaesters.getEmployees().add(stephanieclarcson);
		dataMaesters.getEmployees().add(lindaKovalsky);
		greyMatter.getEmployees().add(johnsmith);
		greyMatter.getEmployees().add(lindaKovalsky);

		johnsmith.getCompanies().add(softwareMachine);
		johnsmith.getCompanies().add(greyMatter);
		stephanieclarcson.getCompanies().add(dataMaesters);
		lindaKovalsky.getCompanies().add(dataMaesters);
		lindaKovalsky.getCompanies().add(greyMatter);

		//When
		companyDao.save(softwareMachine); //zapsiuejmy obiekty przy pomocy kontrolera rep
		int softwareMachineId = softwareMachine.getId();//zapamiętujemy wartość id obiektu, nadaną temu obiektowi przez Hibernate
		companyDao.save(dataMaesters);
		int dataMaestersId = dataMaesters.getId();
		companyDao.save(greyMatter);
		int greyMatterId = greyMatter.getId();

		//Then
		Assert.assertNotEquals(0, softwareMachineId);
		Assert.assertNotEquals(0, dataMaestersId);
		Assert.assertNotEquals(0, greyMatterId);

		//CleanUp
		try{
			companyDao.deleteById(softwareMachineId);
			companyDao.deleteById(dataMaestersId);
			companyDao.deleteById(greyMatterId);
		} catch(Exception e) {
			//do nothing;
		}
	}
	@Test
	public void testQueries() {
		//Given
		Employee johnsmith = new Employee("John", "Smith");
		Employee stephanieclarcson = new Employee("Stephanie", "Clarcson");
		Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

		Company softwareMachine = new Company("Software Machine");
		Company dataMaesters = new Company("Data Maesters");
		Company greyMatter = new Company("Grey Matter");

		softwareMachine.getEmployees().add(johnsmith);
		dataMaesters.getEmployees().add(stephanieclarcson);
		dataMaesters.getEmployees().add(lindaKovalsky);
		greyMatter.getEmployees().add(johnsmith);
		greyMatter.getEmployees().add(lindaKovalsky);

		johnsmith.getCompanies().add(softwareMachine);
		johnsmith.getCompanies().add(greyMatter);
		stephanieclarcson.getCompanies().add(dataMaesters);
		lindaKovalsky.getCompanies().add(dataMaesters);
		lindaKovalsky.getCompanies().add(greyMatter);

		companyDao.save(softwareMachine); //zapsiuejmy obiekty przy pomocy kontrolera rep
		int softwareMachineId = softwareMachine.getId();//zapamiętujemy wartość id obiektu, nadaną temu obiektowi przez Hibernate
		companyDao.save(dataMaesters);
		int dataMaestersId = dataMaesters.getId();
		companyDao.save(greyMatter);
		int greyMatterId = greyMatter.getId();

		//When
		List<Employee> lastName1 = employeeDao.retrieveLastname("Smith");
		List<Company> company1 = companyDao.retriveCompanyNameByFirst3Letters("COMPANY_NAME");

		//Then
		Assert.assertEquals(1, lastName1.size());
		Assert.assertEquals(1, company1.size());

		//CleanUp
		try{
			companyDao.deleteAll();
			employeeDao.deleteAll();
		} catch(Exception e) {
			//do nothing;
		}
	}
}
