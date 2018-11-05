package com.verizon.jhd.model.o2mm2o;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="courses2")
public class Course {

	    @Id
        private String ccode;
        private String title;
        
        @OneToMany(mappedBy="course",cascade=CascadeType.ALL )
        private Set<Participant> participants;
        
        

		public void setParticipants(Set<Participant> participants) {
			this.participants = participants;
		}



		public Set<Participant> getParticipants() {
			return participants;
		}



		public Course() {
			super();
		}
		
		

		public Course(String ccode, String title) {
			super();
			this.ccode = ccode;
			this.title = title;
			
		}



		public String getCcode() {
			return ccode;
		}

		public void setCcode(String ccode) {
			this.ccode = ccode;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
        
        
}
