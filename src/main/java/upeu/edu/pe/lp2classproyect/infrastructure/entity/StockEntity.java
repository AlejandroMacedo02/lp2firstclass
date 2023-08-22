package upeu.edu.pe.lp2classproyect.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandromacedop
 */
@Entity
@Table(name = "stock")
public class StockEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String estado;
    private String imagen;
    private LocalDateTime fecha_ingreso;
    private LocalDateTime fecha_vencimiento;
    private LocalDateTime fecha_actualizacion;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity ProductEntity;  

    public StockEntity() {
    }
    
    public StockEntity(Integer id, String estado, String imagen, LocalDateTime fecha_ingreso, LocalDateTime fecha_vencimiento, LocalDateTime fecha_actualizacion, ProductEntity ProductEntity) {
        this.id = id;
        this.estado = estado;
        this.imagen = imagen;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_actualizacion = fecha_actualizacion;
        this.ProductEntity = ProductEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDateTime getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDateTime fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public LocalDateTime getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDateTime fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public LocalDateTime getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(LocalDateTime fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public ProductEntity getProductEntity() {
        return ProductEntity;
    }

    public void setProductEntity(ProductEntity ProductEntity) {
        this.ProductEntity = ProductEntity;
    }
    
    
}
