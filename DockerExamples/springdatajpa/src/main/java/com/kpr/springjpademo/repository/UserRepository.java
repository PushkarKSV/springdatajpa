/**
 * 
 */
package com.kpr.springjpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author PushkarRajuKoppanath
 *
 */
public interface UserRepository extends JpaRepository<Users, Integer> {

}
