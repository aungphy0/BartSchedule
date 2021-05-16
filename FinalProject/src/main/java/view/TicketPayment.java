/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;


/**
 *
 * @author Timothy
 */
public class TicketPayment extends javax.swing.JPanel {

    /**
     * Creates new form TicketPayment
     */
    JTextField credit_card; 
    JTextField payment_text;
    JLabel qr_code_label; 
    static JTextField amount; 
    JTextArea iArea; 
    
    BufferedImage qrCode; 
    StationSchedule stationSchedule; 
    MultiStationSchedule multistationSchedule; 
    
    static String price; 
    static String price1; 
    
    public TicketPayment() {
        initComponents();
        credit_card = creditCard;
        payment_text = payment; 
        qr_code_label = qrCodeLabel; 
        amount = payment; 
        iArea = infoArea; 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        creditCard = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        payButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();
        qrCodeLabel = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Credit Card Number:");

        creditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Payment:");

        payButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(creditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(payButton)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(creditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(payButton)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Ticket Payment");

        infoArea.setColumns(20);
        infoArea.setRows(5);
        jScrollPane1.setViewportView(infoArea);

        qrCodeLabel.setBackground(new java.awt.Color(204, 255, 204));
        qrCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qrCodeLabel.setText("Ticket QRCode ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(qrCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(qrCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void creditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditCardActionPerformed

    
    public static boolean isValid(long number)
    {
       return (getSize(number) >= 13 &&
               getSize(number) <= 16) &&
               (prefixMatched(number, 4) ||
                prefixMatched(number, 5) ||
                prefixMatched(number, 37) ||
                prefixMatched(number, 6)) &&
              ((sumOfDoubleEvenPlace(number) +
                sumOfOddPlace(number)) % 10 == 0);
    }
    
    public static boolean isValid(String number)
    {
       
        int count_digit = 0; 
        int count_space = 0; 
        
        for(int i=0; i<number.length(); i++){
            if(Character.isDigit(number.charAt(i)))
                count_digit++; 
            if(number.charAt(i) - ' ' == 0)
                count_space++; 
        } 
        
        return count_digit == 16 && count_space == 3; 
    }
    
    //adds all digits in the odd places from right to left in the card number
    public static int sumOfOddPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");       
        return sum;
    }
    //add all single-digit numbers
    public static int sumOfDoubleEvenPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2)
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
         
        return sum;
    }
    //gives a digit back
    public static int getDigit(int number)
    {
        if (number < 9)
            return number;
        return number / 10 + number % 10;
    }
    //checks if the d digit is the last. returns true if no
    public static boolean prefixMatched(long number, int d)
    {
        return getPrefix(number, getSize(d)) == d;
    }
    //gets k number of digits or 
    public static long getPrefix(long number, int k)
    {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }
    //gets number of inputdigts
    public static int getSize(long d)
    {
        String num = d + "";
        return num.length();
    }
    
                                                  
    private static final String QR_CODE_IMAGE_PATH = "QRCode.png";
    private static void generateQRCode(String text, int width, int height, String filePath)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
    
    
   
    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //check is credit card is valid in jTextField1
      //if (isValid(Long.parseLong(creditCard.getText()))) 
        if (isValid(creditCard.getText())){
            
            
            try {
                generateQRCode("www.clippercard.com/ClipperWeb/login.html", 250, 250, QR_CODE_IMAGE_PATH);
                //System.out.println(getQRCodeImage("", 350, 350)); 
                File file = new File("QRCode.png"); 
                qrCode = ImageIO.read(new File("QRCode.png")); 
                qrCodeLabel.setIcon(new ImageIcon(qrCode)); 
                //System.out.println(file.getAbsolutePath()); 
                
                
            } catch (WriterException ex) {
                Logger.getLogger(TicketPayment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TicketPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(stationSchedule.info.size() != 0){
                infoArea.append("Departure Time: \n"); 
                infoArea.append(stationSchedule.info.get(0) + "\n\n");
                infoArea.append("Arrival Time: \n");
                infoArea.append(stationSchedule.info.get(1) + "\n\n"); 
                infoArea.append("Transit Station: \n");
                infoArea.append(stationSchedule.info.get(2) + "\n\n"); 
                infoArea.append("Ticket Price: \n");
                infoArea.append(stationSchedule.info.get(3) + "\n\n");
                infoArea.append("Trip Time: \n"); 
                infoArea.append(stationSchedule.info.get(4) + "\n\n"); 
            }
            else{
                infoArea.append("Departure Time From Station: \n");
                infoArea.append(multistationSchedule.info1.get(0) + "\n\n");
                infoArea.append("Transit to Station 1: \n");
                infoArea.append(multistationSchedule.info1.get(1) + "\n\n");
                infoArea.append("Arrival Time To Station 1: \n"); 
                infoArea.append(multistationSchedule.info1.get(2) + "\n\n");
                infoArea.append("Transit to Station 2: \n");
                infoArea.append(multistationSchedule.info1.get(3) + "\n\n");
                infoArea.append("Arrival Time to Station 2: \n");
                infoArea.append(multistationSchedule.info1.get(4) + "\n\n"); 
                infoArea.append("Ticket Price: \n");
                infoArea.append(multistationSchedule.info1.get(5) + "\n\n");
                infoArea.append("Trip Time: \n");
                infoArea.append(multistationSchedule.info1.get(6) + "\n\n");
                
            }
            
            
            
            //System.out.println(stationSchedule.info); 
            System.out.println("pay click!"); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Not a valid card. Please enter valid card info.",
               "Swing Tester", JOptionPane.ERROR_MESSAGE);
        }
        //if not, return a invalid card error message. display on jPanel1 if possible
        //figure out what to display in corner
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /*
    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
//        this.qrCodePane.setContentType("text/html");
//        this.qrCodePane.setText("<html><img src='" + TicketPayment.class.getClassLoader().getResource("1200px-QR_code_for_mobile_English_Wikipedia.png").toString() + "'/></html>");
//          qrCodePane = new JTextPane(); 
//          qrCodePane.insertIcon(new ImageIcon("1200px-QR_code_for_mobile_English_Wikipedia.png"));
          qrCodePane.setText("QRcode is displaying!");
          System.out.println("click"); 
    }//GEN-LAST:event_payButtonActionPerformed
    */
    public static void setPrice(){
        amount.setText(price);
        System.out.println(price); 
    }

    public static void setPrice1(){
        amount.setText(price1);
        System.out.println(price1);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField creditCard;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton payButton;
    private javax.swing.JTextField payment;
    private javax.swing.JLabel qrCodeLabel;
    // End of variables declaration//GEN-END:variables
}