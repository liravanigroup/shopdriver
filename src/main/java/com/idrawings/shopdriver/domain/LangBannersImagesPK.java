package com.idrawings.shopdriver.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class LangBannersImagesPK implements Serializable {
    private Integer langId = 1;
    private Integer bannerImageId;

    @Column(name = "lang_id", nullable = false)
    @Id
    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    @Column(name = "banner_image_id", nullable = false)
    @Id
    public Integer getBannerImageId() {
        return bannerImageId;
    }

    public void setBannerImageId(Integer bannerImageId) {
        this.bannerImageId = bannerImageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangBannersImagesPK that = (LangBannersImagesPK) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (bannerImageId != null ? !bannerImageId.equals(that.bannerImageId) : that.bannerImageId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (bannerImageId != null ? bannerImageId.hashCode() : 0);
        return result;
    }
}
