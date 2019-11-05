package io.archilab.fae.faespringdemo.item;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

  private final ItemRepository itemRepository;

  public ItemController(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  @GetMapping("/items")
  public List<Item> getAllItems() {
    return this.itemRepository.findAll();
  }

  @PostMapping("/items")
  public Item postItem(@RequestBody Item item) {
    return this.itemRepository.save(item);
  }

}
