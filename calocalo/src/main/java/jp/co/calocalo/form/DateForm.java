package jp.co.calocalo.form;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DateForm {
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
