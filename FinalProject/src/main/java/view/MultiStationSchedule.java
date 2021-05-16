/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import api.BartAPI;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.concurrent.TimeUnit; 

/**
 *
 * @author Daniel 
 */
public class MultiStationSchedule extends javax.swing.JPanel {

    /**
     * Creates new form MultiStationSchedule
     */
    
    BartSchedule bartSchedule; 
    BartAPI bartAPI;
    List<String> lsOne; 
    List<String> ls_nameOne; 
    List<String> lsTwo; 
    List<String> ls_nameTwo; 
    
    static List<String> info1; 
    
    static String s1; 
    static String s2; 
    static String s3; 
    static String s4; 
    static String s5; 
    static String s6; 
    static String s7; 
    
    public MultiStationSchedule() {
        initComponents();
        info1 = new ArrayList(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buyButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fromStationTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        toStationOneTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ticketPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tripTime = new javax.swing.JTextField();
        toStationTwoTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        toTransitStationTwo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        toTranistStationOne = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fromStation = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        toStationOne = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        toStationTwo = new javax.swing.JComboBox<>();
        checkButton = new javax.swing.JButton();

        buyButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        buyButton.setText("Buy");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setText("Departure Time From Station");

        fromStationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromStationTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Arrival Time To Station 1");

        toStationOneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStationOneTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Ticket Price");

        jLabel7.setText("Trip Time");

        jLabel9.setText("Arrival Time To Station 2");

        jLabel10.setText("Transit to Station 2");

        jLabel11.setText("Transit to Station 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(fromStationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ticketPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tripTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toStationOneTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toStationTwoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toTransitStationTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toTranistStationOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromStationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(toTranistStationOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toStationOneTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toTransitStationTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(toStationTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tripTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Choose Stations");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fromStation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Station", "12th St. Oakland City Center", "16th St. Mission", "19th St. Oakland", "24th St. Mission", "Antioch", "Ashby", "Balboa Park", "Bay Fair", "Berryessa/North San Jose", "Castro Valley", "Civic Center/UN Plaza", "Coliseum", "Colma", "Concord", "Daly City", "Downtown Berkeley", "Dublin/Pleasanton", "El Cerrito del Norte", "El Cerrito Plaza", "Embarcadero", "Fremont", "Fruitvale", "Glen Park", "Hayward", "Lafayette", "Lake Merritt", "MacArthur", "Millbrae", "Milpitas", "Montgomery St.", "North Berkeley", "North Concord/Martinez", "Oakland International Airport", "Orinda", "Pittsburg/Bay Point", "Pittsburg Center", "Pleasant Hill/Contra Costa Centre", "Powell St.", "Richmond", "Rockridge", "San Bruno", "San Francisco International Airport", "San Leandro", "South Hayward", "South San Francisco", "Union City", "Walnut Creek", "Warm Springs/South Fremont", "West Dublin/Pleasanton", "West Oakland" }));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("From Station:");

        toStationOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Station", "12th St. Oakland City Center", "16th St. Mission", "19th St. Oakland", "24th St. Mission", "Antioch", "Ashby", "Balboa Park", "Bay Fair", "Berryessa/North San Jose", "Castro Valley", "Civic Center/UN Plaza", "Coliseum", "Colma", "Concord", "Daly City", "Downtown Berkeley", "Dublin/Pleasanton", "El Cerrito del Norte", "El Cerrito Plaza", "Embarcadero", "Fremont", "Fruitvale", "Glen Park", "Hayward", "Lafayette", "Lake Merritt", "MacArthur", "Millbrae", "Milpitas", "Montgomery St.", "North Berkeley", "North Concord/Martinez", "Oakland International Airport", "Orinda", "Pittsburg/Bay Point", "Pittsburg Center", "Pleasant Hill/Contra Costa Centre", "Powell St.", "Richmond", "Rockridge", "San Bruno", "San Francisco International Airport", "San Leandro", "South Hayward", "South San Francisco", "Union City", "Walnut Creek", "Warm Springs/South Fremont", "West Dublin/Pleasanton", "West Oakland" }));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("To Station 1: ");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("To Station 2:");

        toStationTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Station", "12th St. Oakland City Center", "16th St. Mission", "19th St. Oakland", "24th St. Mission", "Antioch", "Ashby", "Balboa Park", "Bay Fair", "Berryessa/North San Jose", "Castro Valley", "Civic Center/UN Plaza", "Coliseum", "Colma", "Concord", "Daly City", "Downtown Berkeley", "Dublin/Pleasanton", "El Cerrito del Norte", "El Cerrito Plaza", "Embarcadero", "Fremont", "Fruitvale", "Glen Park", "Hayward", "Lafayette", "Lake Merritt", "MacArthur", "Millbrae", "Milpitas", "Montgomery St.", "North Berkeley", "North Concord/Martinez", "Oakland International Airport", "Orinda", "Pittsburg/Bay Point", "Pittsburg Center", "Pleasant Hill/Contra Costa Centre", "Powell St.", "Richmond", "Rockridge", "San Bruno", "San Francisco International Airport", "San Leandro", "South Hayward", "South San Francisco", "Union City", "Walnut Creek", "Warm Springs/South Fremont", "West Dublin/Pleasanton", "West Oakland" }));
        toStationTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStationTwoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fromStation, 0, 345, Short.MAX_VALUE)
                    .addComponent(toStationOne, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toStationTwo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toStationOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(toStationTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(checkButton)
                .addGap(42, 42, 42)
                .addComponent(buyButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkButton)
                    .addComponent(buyButton))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void toStationOneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStationOneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toStationOneTextFieldActionPerformed

    private void toStationTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStationTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toStationTwoActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
        bartSchedule.ticketPaymentPanel(); 
        info1.add(s1);
        info1.add(s2);
        info1.add(s3);
        info1.add(s4);
        info1.add(s5);
        info1.add(s6);
        info1.add(s7); 
        
        TicketPayment.price1 = s6;
        TicketPayment.setPrice1();
        System.out.println(info1); 
    }//GEN-LAST:event_buyButtonActionPerformed

    private void fromStationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromStationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromStationTextFieldActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        
         bartAPI.mapValue(); 
         
         String fromSta = bartAPI.map.get(fromStation.getSelectedItem().toString()); 
         String toSta = bartAPI.map.get(toStationOne.getSelectedItem().toString()); 
         String url = "http://api.bart.gov/api/sched.aspx?cmd=depart&orig=" + fromSta + "&dest=" + toSta +"&date=now&key=ZZ22-58T5-93RT-DWEI&b=2&a=2&l=1&json=y";
          //System.out.println(bartAPI.bartAPICalled(url)); 
         JSONObject obj = bartAPI.bartAPICalled(url); 
         
         JSONObject obj1 = obj.getJSONObject("root");
         JSONObject obj2 = obj1.getJSONObject("schedule"); 
         JSONObject obj3 = obj2.getJSONObject("request"); 
          
         JSONArray jarray = obj3.getJSONArray("trip");
         JSONObject jObj  = jarray.getJSONObject(0);
         JSONObject jObj1 = jarray.getJSONObject(1); 
         JSONObject jObj2 = jarray.getJSONObject(2); 
         JSONObject jObj3 = jarray.getJSONObject(3); 
         
         
         s1 = jObj.getString("@origTimeMin") + "  |  " + jObj1.getString("@origTimeMin") + "  |  " +
              jObj2.getString("@origTimeMin") + "  |  " + jObj3.getString("@origTimeMin");
         this.fromStationTextField.setText(s1); 
          
         s3 = jObj.getString("@destTimeMin") + "  |  " + jObj1.getString("@destTimeMin") + "  |  " +
              jObj2.getString("@destTimeMin") + "  |  " + jObj3.getString("@destTimeMin");
         this.toStationOneTextField.setText(s3);
         
         
         String firstTripTime = jObj.getString("@tripTime"); 
        
         try{
            TimeUnit.SECONDS.sleep(2);
         }
         catch(InterruptedException ie){
            System.out.println(ie.getMessage()); 
         }
         
         String fromSta1 = bartAPI.map.get(toStationOne.getSelectedItem().toString()); 
         String toSta1 = bartAPI.map.get(toStationTwo.getSelectedItem().toString()); 
         String url1 = "http://api.bart.gov/api/sched.aspx?cmd=depart&orig=" + fromSta1 + "&dest=" + toSta1 +"&date=now&key=ZZ22-58T5-93RT-DWEI&b=2&a=2&l=1&json=y";
         
         JSONObject objj = bartAPI.bartAPICalled(url1); 
         
         JSONObject objj1 = objj.getJSONObject("root");
         JSONObject objj2 = objj1.getJSONObject("schedule"); 
         JSONObject objj3 = objj2.getJSONObject("request"); 
          
         JSONArray jjarray = objj3.getJSONArray("trip");
         JSONObject jObjj  = jjarray.getJSONObject(0);
         JSONObject jObjj1 = jjarray.getJSONObject(1); 
         JSONObject jObjj2 = jjarray.getJSONObject(2); 
         JSONObject jObjj3 = jjarray.getJSONObject(3); 
         
         
         lsOne = new ArrayList(); 
         ls_nameOne = new ArrayList(); 
          
          JSONArray jsonArray = jObj.getJSONArray("leg");
          
          for(int i=0; i<jsonArray.length(); i++){
             
              JSONObject jsonObj = jsonArray.getJSONObject(i);
              lsOne.add(jsonObj.getString("@destination")); 
              
          }
          
          for(int i=0; i<lsOne.size(); i++){
            for(Map.Entry<String,String> entry : bartAPI.map.entrySet()){

                    if(lsOne.get(i).equals(entry.getValue()) && !lsOne.get(i).equals(toSta))
                        ls_nameOne.add(entry.getKey()); 

            }
          }
          
          String transitStationOne = ""; 
          
          if(ls_nameOne.size() != 0){
            for(String s : ls_nameOne)
                transitStationOne += s + " | "; 
          }
          else{
              transitStationOne = "No transit !"; 
          }
          
          
         int secondTripTime = Integer.parseInt(jObjj.getString("@tripTime")); 
         int hour = secondTripTime / 60; 
         int minutes = secondTripTime % 60; 
         
         String time1 = jObj.getString("@destTimeMin"); 
         String time2 = jObj1.getString("@destTimeMin"); 
         String time3 = jObj2.getString("@destTimeMin"); 
         String time4 = jObj3.getString("@destTimeMin"); 
         
         int time1_minutes_check = (Integer.parseInt(time1.substring(3,5)) + minutes) % 60; 
         int time1_hour_check = (Integer.parseInt(time1.substring(0,2)) + hour) + 
                                (Integer.parseInt(time1.substring(3,5)) + minutes) / 60 ; 
         
         int time2_minutes_check = (Integer.parseInt(time2.substring(3,5)) + minutes) % 60; 
         int time2_hour_check = (Integer.parseInt(time2.substring(0,2)) + hour) + 
                                (Integer.parseInt(time2.substring(3,5)) + minutes) / 60 ; 
         
         int time3_minutes_check = (Integer.parseInt(time3.substring(3,5)) + minutes) % 60; 
         int time3_hour_check = (Integer.parseInt(time3.substring(0,2)) + hour) + 
                                (Integer.parseInt(time3.substring(3,5)) + minutes) / 60 ; 
         
         int time4_minutes_check = (Integer.parseInt(time4.substring(3,5)) + minutes) % 60; 
         int time4_hour_check = (Integer.parseInt(time4.substring(0,2)) + hour) + 
                                (Integer.parseInt(time4.substring(3,5)) + minutes) / 60 ; 
         
         
         String t1 = String.format("%02d", time1_hour_check) + ":" +
                     String.format("%02d", time1_minutes_check) + 
                     time1.substring(5,8);
         
         String t2 = String.format("%02d", time2_hour_check) + ":" +
                     String.format("%02d", time2_minutes_check) + 
                     time2.substring(5,8);
         
         String t3 = String.format("%02d", time3_hour_check) + ":" +
                     String.format("%02d", time3_minutes_check) + 
                     time3.substring(5,8);
         
         String t4 = String.format("%02d", time4_hour_check) + ":" +
                     String.format("%02d", time4_hour_check) + 
                     time4.substring(5,8);
         
//         this.toStationTwoTextField.setText(jObjj.getString("@destTimeMin") + "  |  " + jObjj1.getString("@destTimeMin") + "  |  " +
//                                            jObjj2.getString("@destTimeMin") + "  |  " + jObjj3.getString("@destTimeMin"));
      
         s5 = t1 + "  |  " + t2 + "  |  " + t3 + "  |  " + t4; 
         this.toStationTwoTextField.setText(s5); 
                                           
         
         s2 = transitStationOne; 
         this.toTranistStationOne.setText(s2);
         
         
         lsTwo = new ArrayList(); 
         ls_nameTwo = new ArrayList(); 
          
         JSONArray jsonArrayTwo = jObjj.getJSONArray("leg");
          
         for(int i=0; i<jsonArrayTwo.length(); i++){
             
             JSONObject jsonObj = jsonArrayTwo.getJSONObject(i);
             lsTwo.add(jsonObj.getString("@destination")); 
              
         }
          
         for(int i=0; i<lsTwo.size(); i++){
           for(Map.Entry<String,String> entry : bartAPI.map.entrySet()){

                   if(lsTwo.get(i).equals(entry.getValue()) && !lsTwo.get(i).equals(toSta1))
                       ls_nameTwo.add(entry.getKey()); 

            }
          }
          
          String transitStationTwo = ""; 
          
          if(ls_nameTwo.size() != 0){
            for(String s : ls_nameTwo)
                transitStationTwo += s + " | "; 
          }
          else{
              transitStationTwo = "No transit !"; 
          }
          
          s4 = transitStationTwo; 
          this.toTransitStationTwo.setText(s4); 
          
          
          float fare1 = Float.parseFloat(jObj.getString("@fare")); 
          float fare2 = Float.parseFloat(jObjj.getString("@fare")); 
          float total = fare1 + fare2; 
          
          s6 = "$ " + String.format("%.2f",total);
          this.ticketPrice.setText(s6);
          
          int totalTripTime = Integer.parseInt(firstTripTime) + secondTripTime; 
          
          s7 = Integer.toString(totalTripTime) + " Mins";
          this.tripTime.setText(s7);
         //System.out.println(totalTripTime);
         
         System.out.println(firstTripTime); 
         System.out.println(secondTripTime); 
         
//         System.out.println(obj); 
//         System.out.println(); 
//         System.out.println(objj); 
    }//GEN-LAST:event_checkButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JComboBox<String> fromStation;
    private javax.swing.JTextField fromStationTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ticketPrice;
    private javax.swing.JComboBox<String> toStationOne;
    private javax.swing.JTextField toStationOneTextField;
    private javax.swing.JComboBox<String> toStationTwo;
    private javax.swing.JTextField toStationTwoTextField;
    private javax.swing.JTextField toTranistStationOne;
    private javax.swing.JTextField toTransitStationTwo;
    private javax.swing.JTextField tripTime;
    // End of variables declaration//GEN-END:variables
}
