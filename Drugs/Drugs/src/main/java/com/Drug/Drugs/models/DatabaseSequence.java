package com.Drug.Drugs.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "database_sequences")
public class DatabaseSequence {

   @Id
   private int id;
   private int seq;
   
   public int getSeq() {
        return seq;
    }
   public void setSeq(int seq) {
        this.seq = seq;
    }
}
