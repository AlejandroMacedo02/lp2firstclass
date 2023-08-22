package upeu.edu.pe.lp2classproyect.infrastructure.adapter;

import org.springframework.stereotype.Repository;
import upeu.edu.pe.lp2classproyect.app.repository.ProductRepository;
import upeu.edu.pe.lp2classproyect.infrastructure.entity.ProductEntity;
import upeu.edu.pe.lp2classproyect.infrastructure.entity.UserEntity;

/**
 *
 * @author alejandromacedop
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository{
    private final ProductCrudRepository productCrudRepository;
    private final ProductEntity productEntity;
    private final UserEntity userEntity;

    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository, ProductEntity productEntity, UserEntity userEntity) {
        this.productCrudRepository = productCrudRepository;
        this.productEntity = productEntity;
        this.userEntity = userEntity;
    }
    

       
    @Override
    public Iterable<ProductEntity> getProducts() {
        //metodo propio de Spring 
        return productCrudRepository.findAll();
    }

    @Override
    public Iterable<ProductEntity> getProductsByUser(UserEntity user) {
        return productCrudRepository.findByUserEntity(userEntity);
    }

    @Override
    public ProductEntity getProductById(Integer id) {
        return productCrudRepository.findById(id).get();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
       return productCrudRepository.save(productEntity);
    }

    @Override
    public void deleteProductById(Integer id) {
       productCrudRepository.deleteById(id);
    }
    
}
