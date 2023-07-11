package com.pratyay.project;

public class main {
    public static void main(String[] args) {

        mailer gEmailSender = new mailer();
        String to = "priya.bhagat2001@gmail.com";
        String from = "pratyayamrit1234567890@gmail.com";
        String subject = "Second: Sending email using GMail";
        String o=com.pratyay.project.otp.generateotp(5);
        String text = o;
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }
    }
}

