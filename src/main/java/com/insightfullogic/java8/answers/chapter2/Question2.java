package com.insightfullogic.java8.answers.chapter2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Question2 {

     public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(
             () -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy", Locale.US))
     );

}
