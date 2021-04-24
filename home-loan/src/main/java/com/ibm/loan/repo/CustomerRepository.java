/** 
 * @author tarishi geetey
 */

package com.ibm.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.loan.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
