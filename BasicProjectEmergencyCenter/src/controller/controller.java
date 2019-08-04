/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JTextArea;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import javax.xml.xpath.*;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author gigisan
 */
public class controller {
    
 
        LocalDate d;
        String name;
        int value;
        String coordinates;
        static  controller [] c=new controller[20];
        
 static String [] data={"20/09/2018 ","12/02/2018 ","15/07/2011 ","19/06/2002 ","21/03/2013 ","02/09/2008 ","15/07/2001 ","29/08/2012 ","21/03/2010 ","01/01/2014 "," "," "," "," "," "," "," "," "," "," "};
      static int []val={3,2,2,1,3,5,2,1,3,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      static String[] parkcoord={"11-34 ","11-55 ","11-32 ","11-24 ","11-44 ","11-54 ","22-11 ","33-11 ","22-44 ","11-77 "," "," "," "," "," "," "," "," "," "," "};
      
    public controller(LocalDate d, String name, int value, String coordinates) {
        this.d = d;
        this.name = name;
        this.value = value;
        this.coordinates = coordinates;
        
        
        
    }
    Color bn= new Color(0,255,0);
    @Override
    public String toString() {
        return " " + "Data: " + d + ", Nume: " + name + ", Valoare: " + value + ", Coordonate=" + coordinates  + "\n";
    }
      static String []nume={"Herastrau","Cismigiu","IOR","Tineretului","Casa  poporului","Piata Iancului","OBOR","Unirii","Regie","Piata Lujerului"," "," "," "," "," "," "," "," "," "," "};
      static String []coord={"22-13","25-54","12-13 ","15-53 ","22-13 ","15-50 ","12-11 ","15-53 ","22-13 ","25-10 "," "," "," "," "," "," "," "," "," "," "};
         static String []spitale={"Cantacuzino","Coltea","Pantelimon","Fundeni","Universitar","Floreasca","Obregia","Elias"};
      public static void hospitals( JTextArea a){
      
       String query3 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
             for(int i=0;i<10;i++){
             
               
                    a.append("Data: " +data[i] +" Valoare: "+val[i] +" Nume:" +spitale[i]+ " Coordonate:"+coord[i]+"\n" );
                 
             }
      }
      static int min[]={111,122,543,1221,4345,12,545,122,100};
      
      public static void sort(JTextArea a){
           String query3 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
          for(int i=0;i<2;i++){
             
               
                    a.append("Data: " +data[i] +" Valoare: "+val[i] +" Nume:" +spitale[i]+ " Coordonate:"+coord[i]+"\n" );
                 
             }
      
      } 
      public static void parking(JTextArea a){
       String query3 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
          for(int i=0;i<5;i++){
             
                    a.append(" Occupied parking spots: Coordonate:"+ coord[i] +  "\n" );
                
             }
       for(int i=5;i<10;i++){
             
                    a.append(" Free parking places (during the weekend): Coordonate:"+coord[i] +" available for "+min[i]+ "minutes" + "\n" );
                 
             }   
      }
      
      public static void certainRecord(String name, JTextArea a) {
        String query3 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
             for(int i=0;i<10;i++){
             
                 if(nume[i].equals(name)){
                    a.append("Data: " +data[i] +" Valoare: "+val[i] +" Nume:" +nume[i]+ " Coordonate:"+coord[i] +"\n" );
                    
                 }
             }
    }
     
      public static void show2(JTextArea a){
           String query3 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
          for(int i=0;i<10;i++){
        
              a.append("Data: " +data[i] +" Valoare: "+val[i] +" Nume:" +nume[i]+ " Coordonate:"+coord[i] +"\n");

          }
      
      }
      public static void show(controller ca,JTextArea a){
         String query3 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
          controller c0 = new controller(LocalDate.of(2014,Month.JANUARY,1),"Herastrau",3,"22-13");
        controller c1 = new controller(LocalDate.of(2004,Month.FEBRUARY,12),"Cismigiu",2,"25-54");
        controller c2 = new controller(LocalDate.of(2011,Month.JULY,15),"IOR",2,"12-13");
        controller c3= new controller(LocalDate.of(2002,Month.JUNE,19),"Tineretului",1,"15-53");
        controller c4 = new controller(LocalDate.of(2013,Month.MARCH,21),"Casa poporului",3,"22-13");
        controller c5 = new controller(LocalDate.of(2008,Month.SEPTEMBER,2),"Piata Iancului",5,"15-50");
        controller c6 = new controller(LocalDate.of(2001,Month.JULY,15),"OBOR",2,"12-11");
        controller c7= new controller(LocalDate.of(2012,Month.AUGUST,29),"Unirii",1,"15-53");
        controller c8 = new controller(LocalDate.of(2010,Month.MARCH,21),"Regie",3,"22-13");
        controller c9 = new controller(LocalDate.of(2018,Month.SEPTEMBER,20),"Piata Lujerului",5,"25-10");
        
        c[0]=c0; c[1]=c1;c[2]=c2;c[3]=c3;c[4]=c4;c[5]=c5;c[6]=c6;c[7]=c7;c[8]=c8;c[9]=c9; 
     for(int i=0; i<10;i++){
        
          
        a.append((c[i].toString()));
         
     }
   
            c[10]=ca;
            a.append(c[10].toString());
            
    }
    
    public static void modify(String n, String d, String c, int v, JTextArea a){
        for(int i=0;i<10;i++)
        {
            if(coord[i].equals(c))
                data[i]=d;
                val[i]=v;
                nume[i]=n;
                
        }    
                        a.append("Noi informatii: Data: " +d +" Valoare: "+v +" Nume:" +n+ " Coordonate:"+c +"\n");

    }
    
    
     String query2 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?a \n"
                + "WHERE { ?x  vcard:Country ?a . "
                + "?x vcard:Given ?y "
                + "FILTER(?a != \"Romania\" )}";
     
    
     String query7 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
     String query6 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
     String query5 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
		String query8 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#> \n"
                + "SELECT ?x ?y \n"
                + "WHERE { ?x  vcard:Region \"Bucuresti\" . "
                + "?x vcard:Given ?y "
                + "}";
                
		String query4 = "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>  PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n"
                + "SELECT ?x ?y ?z \n"
                + "WHERE { ?x  vcard:Region ?a . "
                + "?x vcard:Given ?y ."
                + "?x vcard:Bday ?z"
                + "}"
                + "ORDER BY ASC(xsd:double(substr(?z,1,7)))"
                + "LIMIT 3";
    
}
