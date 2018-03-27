package com.idrawings.shopdriver.dto;

import com.idrawings.shopdriver.domain.*;

import java.util.List;

/**
 * Created by White Stream on 02.06.2017.
 */
public class ProductDTO {
    private Product product;

    private List<Variant> variants;
    private List<Image> images;
    private List<Category> productCategories;
    private List<RelatedProduct> relatedProducts;
    private List<Option> options;
    private LangProduct langProduct;

    public ProductDTO() {
    }

    public ProductDTO(Product product, List<Variant> variants, List<Image> images, List<RelatedProduct> relatedProducts, List<Option> options, LangProduct langProduct) {
        this.product = product;
        this.variants = variants;
        this.images = images;
        this.productCategories = productCategories;
        this.relatedProducts = relatedProducts;
        this.options = options;
        this.langProduct = langProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Category> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<Category> productCategories) {
        this.productCategories = productCategories;
    }

    public List<RelatedProduct> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<RelatedProduct> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public void setLangProduct(LangProduct langProduct) {
        this.langProduct = langProduct;
    }

    public LangProduct getLangProduct() {
        return langProduct;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductDTO{");
        sb.append("product=").append(product);
        sb.append(", variants=").append(variants);
        sb.append(", images=").append(images);
        sb.append(", productCategories=").append(productCategories);
        sb.append(", relatedProducts=").append(relatedProducts);
        sb.append(", options=").append(options);
        sb.append(", langProduct=").append(langProduct);
        sb.append('}');
        return sb.toString();
    }
}