package io.archilab.fae.faespringdemo.item;

import java.util.UUID;
import lombok.Data;

@Data
public class Item {

  private UUID id;
  private String name;

  public Item(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
  }
}
