package in.ashokit.service;

import java.util.Collection;
import java.util.List;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;

public interface TicketService {
 public Ticket bookTicket(Passenger p);
 public Collection<Ticket> getAllTickets();


}
