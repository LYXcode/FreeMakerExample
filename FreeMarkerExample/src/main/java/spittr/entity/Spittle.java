package spittr.entity;

import java.util.Date;

public class Spittle {

	private Long id;
	private String message;
	private final Date time;
	
	public Spittle(){
		time = new Date();
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
