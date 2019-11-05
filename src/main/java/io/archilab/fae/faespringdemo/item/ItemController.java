package io.archilab.fae.faespringdemo.item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

  @GetMapping("/item")
  public Item getItem() {
    return new Item("item1");
  }

}
