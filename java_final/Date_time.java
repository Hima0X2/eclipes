package java_final;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class Date_time {
  public static void main(String[] args) {
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");
   LocalDateTime time = LocalDateTime.now();
   System.out.println(dtf.format(time));
  }
}