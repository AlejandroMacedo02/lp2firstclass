/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.lp2classproyect.app.repository;
import upeu.edu.pe.lp2classproyect.infrastructure.entity.ProductEntity;
import upeu.edu.pe.lp2classproyect.infrastructure.entity.UserEntity;

/**
 *
 * @author alejandromacedop
 */
public interface ProductRepository {
    //metodo que trae todos los productos
    Iterable<ProductEntity> getProducts();
    Iterable<ProductEntity> getProductsByUser(UserEntity user);
    ProductEntity getProductById(Integer id);
    ProductEntity saveProduct(ProductEntity product);
    void deleteProductById(Integer id);
    
}
