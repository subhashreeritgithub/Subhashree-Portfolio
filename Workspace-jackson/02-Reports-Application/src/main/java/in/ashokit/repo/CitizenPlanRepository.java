package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.CitizenReports;

public interface CitizenPlanRepository  extends JpaRepository<CitizenReports,Integer>{

}
