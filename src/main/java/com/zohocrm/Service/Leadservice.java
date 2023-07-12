package com.zohocrm.Service;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface Leadservice {
		
		public void saveOneLead(Lead lead);
		public Lead getLeadById(long id);
		public void deleteLeadById(long id);
		public List<Lead> getAllLeads();

}
