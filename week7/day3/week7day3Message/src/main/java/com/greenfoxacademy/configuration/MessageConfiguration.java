package com.greenfoxacademy.configuration;

import com.greenfoxacademy.service.EmailService;
import com.greenfoxacademy.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  @Primary
  public EmailService emailService(){
    return new EmailService();
  }

  @Bean
  public TwitterService twitterService() {
    return new TwitterService();
  }

  @Bean
  public MessageProceeder emailServiceProceeder(){
    return new MessageProceeder();
  }
}

