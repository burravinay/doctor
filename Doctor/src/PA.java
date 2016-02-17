import java.util.ArrayList;


public class PA {
	public Schedule doctorsSchedule;
	public PA()
	{
		doctorsSchedule=Doctor.drSch;
	}

	public void bookAppointment(String name,String day,String slot)
	{
		// check if patients exists
		if(Doctor.doesPatientExist(name))
		{
			if(  !doctorsSchedule.d[ day2IntMapping(day)].drLeaveStatus)
			{
				if(doctorsSchedule.d[ day2IntMapping(day)  ].s[slot2IntMapping(slot)].availability) {
					System.out.println("Slot is taken");
					// show avail slots for the same day
					// if no slot available for same day, show slots for next day, and so on
					// if no slots availabel till the last day of the week. ( Booked for the week message )
					// accept new slots using scanner in 
				}
				else
				{
					doctorsSchedule.d[ day2IntMapping(day)  ].s[slot2IntMapping(slot)].availability=true;
					System.out.println("Appointment is booked");
				}
			}
			else
			{
				System.out.println("Doctor on leave please choose another day and slot");
				// accept new slots using scanner in 
			}
		}
		else
		{
			//scanner in , name , telephone. insuracne
			// create opatients object and add in doctor arraylist
			// call urself
		}
	}
	public static int day2IntMapping(String days)
	{
		days=days.toLowerCase();
		switch(days)
		{
		case "sunday": return 0;
		case "monday": return 1;
		case "tueday": return 2;
		case "wednesday": return 3;
		case "thursday": return 4;
		case "friday": return 5;
		case "satday": return 6;
		default : return -1;
		}
	}public static int slot2IntMapping(String slot)
	{
		switch(slot)
		{
		case "9am": return 0;
		case "10am": return 1;
		case "11am": return 2;
		case "12am": return 3;
		case "1pm": return 4;
		case "2pm": return 5;
		case "3pm": return 6;
		case "4pm": return 7;
		default : return -1;
		}
	}
	
	
}
