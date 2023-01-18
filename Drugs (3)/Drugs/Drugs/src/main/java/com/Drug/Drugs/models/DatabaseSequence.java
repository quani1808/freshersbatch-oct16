
  package com.Drug.Drugs.models;
  
  import org.springframework.data.annotation.Id; 
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  @Document(collection = "database_sequences")
  public class DatabaseSequence
  {
  
  @Id
  private String id;
  
  private int seq;
  
  
 
  }
 