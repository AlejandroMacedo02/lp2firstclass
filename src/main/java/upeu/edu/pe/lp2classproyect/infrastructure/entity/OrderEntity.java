package upeu.edu.pe.lp2classproyect.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @author kodegod
 */

@Entity
@Table(name = "orden")
public class OrderEntity {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime date;
    private String total;
    private String metodo_pago;
    private String direccion_envio;
    private String detalles_pago;
    private String notas;
    private Float descuentos;
    private String envio;

    public OrderEntity() {
    }

    public OrderEntity(Integer id, LocalDateTime date, String total, String metodo_pago, String direccion_envio, String detalles_pago, String notas, Float descuentos, String envio) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.metodo_pago = metodo_pago;
        this.direccion_envio = direccion_envio;
        this.detalles_pago = detalles_pago;
        this.notas = notas;
        this.descuentos = descuentos;
        this.envio = envio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public String getDetalles_pago() {
        return detalles_pago;
    }

    public void setDetalles_pago(String detalles_pago) {
        this.detalles_pago = detalles_pago;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Float getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Float descuentos) {
        this.descuentos = descuentos;
    }

    public String getEnvio() {
        return envio;
    }

    public void setEnvio(String envio) {
        this.envio = envio;
    }
    
    
}
