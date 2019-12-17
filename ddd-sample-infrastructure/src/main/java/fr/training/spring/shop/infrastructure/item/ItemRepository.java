package fr.training.spring.shop.infrastructure.item;

import fr.training.spring.shop.domain.item.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<ItemEntity, String> {

    List<ItemEntity> findByIdIn(List<String> id);

}
