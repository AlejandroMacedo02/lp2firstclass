package upeu.edu.pe.lp2classproyect.infrastructure.adapter;

import org.springframework.data.repository.CrudRepository;
import upeu.edu.pe.lp2classproyect.infrastructure.entity.ProductEntity;
import upeu.edu.pe.lp2classproyect.infrastructure.entity.UserEntity;

/**
 *
 * @author alejandromacedop
 */
public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer>{
    Iterable<ProductEntity> findByUserEntity(UserEntity user);
}
