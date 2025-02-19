package org.abc.constituency.dao;
import org.abc.constituency.entity.Constituency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstituencyDao extends JpaRepository<Constituency,Integer>{

	Constituency findByName(String name);

}
