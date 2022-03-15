package com.advices;



import java.time.LocalDateTime;
import java.util.Date;



public class ErrorDetails {

private LocalDateTime ldt;
private String message;
private String details;

public ErrorDetails(LocalDateTime date, String message, String details) {
super();
this.ldt = date;
this.message = message;
this.details = details;
}





public LocalDateTime getLdt() {
return ldt;
}





public void setLdt(LocalDateTime ldt) {
this.ldt = ldt;
}





public String getMessage() {
return message;
}



public String getDetails() {
return details;
}



}