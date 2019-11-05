package io.archilab.fae.faespringdemo.item;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {

  @Id
  private UUID id;
  private String name;

  protected Item() {
    this.id = UUID.randomUUID();
  }

  public Item(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
  }
}
