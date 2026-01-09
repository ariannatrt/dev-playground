package com.projectorchid.project_orchid.entity;

import com.projectorchid.project_orchid.entity.Property;
import jakarta.persistence.*;

@Entity
@Table(name = "property_image")
public class PropertyImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 500)
    private String url;

    @Column(name = "propertyId")
    private int propertyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propertyId", insertable = false, updatable = false)
    private Property property;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}