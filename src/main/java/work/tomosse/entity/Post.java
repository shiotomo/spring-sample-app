package work.tomosse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Post {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      @Column
      private int id;

      @Column(name="title")
      private String title;

      @Column(name="body")
      private String body;
}
