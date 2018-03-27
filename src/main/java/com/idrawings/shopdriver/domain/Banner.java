package com.idrawings.shopdriver.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by Sergej on 18.10.2017.
 */
@Entity
@Table(name = "banners")
public class Banner {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    private String groupId;
    private String name;


    @Type(type = "text")
    @Column(name = "description", nullable = false, length = -1)
    private String description;
    private Integer position;
    private Byte visible;


    @Column(name = "show_all_pages", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean showAllPages;

    private String categories;
    private String pages;
    private String brands;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "group_id", nullable = false, length = 32)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
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

    @Basic
    @Column(name = "position", nullable = false)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Basic
    @Column(name = "visible", nullable = false)
    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    public boolean getShowAllPages() {
        return showAllPages;
    }

    public void setShowAllPages(boolean showAllPages) {
        this.showAllPages = showAllPages;
    }

    @Basic
    @Column(name = "categories", nullable = false, length = 200)
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Basic
    @Column(name = "pages", nullable = false, length = 200)
    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Basic
    @Column(name = "brands", nullable = false, length = 200)
    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Banner banner = (Banner) o;

        if (id != null ? !id.equals(banner.id) : banner.id != null) return false;
        if (groupId != null ? !groupId.equals(banner.groupId) : banner.groupId != null) return false;
        if (name != null ? !name.equals(banner.name) : banner.name != null) return false;
        if (description != null ? !description.equals(banner.description) : banner.description != null)
            return false;
        if (position != null ? !position.equals(banner.position) : banner.position != null) return false;
        if (visible != null ? !visible.equals(banner.visible) : banner.visible != null) return false;
//        if (showAllPages != null ? !showAllPages.equals(banner.showAllPages) : banner.showAllPages != null) return false;
        if (categories != null ? !categories.equals(banner.categories) : banner.categories != null) return false;
        if (pages != null ? !pages.equals(banner.pages) : banner.pages != null) return false;
        if (brands != null ? !brands.equals(banner.brands) : banner.brands != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
//        result = 31 * result + (showAllPages != null ? showAllPages.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        result = 31 * result + (pages != null ? pages.hashCode() : 0);
        result = 31 * result + (brands != null ? brands.hashCode() : 0);
        return result;
    }
}
