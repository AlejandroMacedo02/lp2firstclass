package upeu.edu.pe.lp2classproyect.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;

/**
 *
 * @author alejandromacedop
 */
@Entity
@Table(name = "ordenproduct")
public class Order_ProductEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cantidad_producto;
    private BigDecimal precio_unitario;
    private BigDecimal total;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity ProductEntity;
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;  

    public Order_ProductEntity() {
    }

    public Order_ProductEntity(Integer id, Integer cantidad_producto, BigDecimal precio_unitario, BigDecimal total, ProductEntity ProductEntity, OrderEntity orderEntity) {
        this.id = id;
        this.cantidad_producto = cantidad_producto;
        this.precio_unitario = precio_unitario;
        this.total = total;
        this.ProductEntity = ProductEntity;
        this.orderEntity = orderEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public BigDecimal getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(BigDecimal precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ProductEntity getProductEntity() {
        return ProductEntity;
    }

    public void setProductEntity(ProductEntity ProductEntity) {
        this.ProductEntity = ProductEntity;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }
    
    
    
}
