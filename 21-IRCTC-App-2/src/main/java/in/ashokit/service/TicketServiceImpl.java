package in.ashokit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
@Service
public class TicketServiceImpl implements TicketService {
	Map<Integer,Ticket> db=new HashMap<>();
	

	@Override
	public Collection<Ticket> getAllTickets() {
	
	return db. values();
	}

	@Override
	public Ticket bookTicket(Passenger p) {
		Ticket t=new Ticket();
		Random r=new Random(10);
		int id= r.nextInt(10);
		t.setTicketnum(id);
		BeanUtils.copyProperties(p, t);
		t.setSatus("Confrimed");
		db.put(id,t);
		return t;
		
	}

}
