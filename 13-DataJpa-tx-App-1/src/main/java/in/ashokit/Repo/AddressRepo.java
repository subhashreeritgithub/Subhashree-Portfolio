package in.ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Address;

public interface AddressRepo  extends JpaRepository<Address,Integer>{

}
