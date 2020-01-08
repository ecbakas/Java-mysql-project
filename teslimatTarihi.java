/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalKargo;


import java.awt.Component;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.util.Calendar;

/**
 *
 * @author ecbak
 */
public class teslimatTarihi {
    String yeniTarih(Date x)
    {             
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
        String strDate = dateFormat.format((x));  
        Calendar c = Calendar.getInstance();
        try{
	   //Setting the date to the given date
	   c.setTime(dateFormat.parse(strDate));
	}catch(ParseException e){
		e.printStackTrace();
	 }
        c.add(Calendar.DAY_OF_MONTH,5);  
        String newDate = dateFormat.format(c.getTime());  
        Component frame = null;        
        JOptionPane.showMessageDialog(frame, "Tahmini teslimat tarihi :"+newDate);
        return newDate;
    }
}
