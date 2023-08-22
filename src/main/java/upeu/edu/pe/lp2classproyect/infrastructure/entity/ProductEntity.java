package upeu.edu.pe.lp2classproyect.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author alejandromacedop
 */

@Entity
@Table(name = "products")
public class ProductEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdate;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity UserEntity;  

    public ProductEntity() {
        this.setCode(UUID.randomUUID().toString());
    }

    public ProductEntity(Integer id, String code, String name, String description, String image, BigDecimal price, LocalDateTime dateCreated, LocalDateTime dateUpdate, UserEntity UserEntity) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.dateCreated = dateCreated;
        this.dateUpdate = dateUpdate;
        this.UserEntity = UserEntity;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public UserEntity getUserEntity() {
        return UserEntity;
    }

    public void setUserEntity(UserEntity UserEntity) {
        this.UserEntity = UserEntity;
    }

    @Override
    public String toString() {
        return "ProductEntity{" + "id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", image=" + image + ", price=" + price + ", dateCreated=" + dateCreated + ", dateUpdate=" + dateUpdate + ", UserEntity=" + UserEntity + '}';
    }
    
    
}

