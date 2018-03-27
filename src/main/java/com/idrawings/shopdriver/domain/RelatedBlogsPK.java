package com.idrawings.shopdriver.domain;

import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class RelatedBlogsPK implements Serializable {
    private Integer postId;
    private Integer relatedId;

    @javax.persistence.Column(name = "post_id", nullable = false)
    @javax.persistence.Id
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @javax.persistence.Column(name = "related_id", nullable = false)
    @javax.persistence.Id
    public Integer getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Integer relatedId) {
        this.relatedId = relatedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelatedBlogsPK that = (RelatedBlogsPK) o;

        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (relatedId != null ? !relatedId.equals(that.relatedId) : that.relatedId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId != null ? postId.hashCode() : 0;
        result = 31 * result + (relatedId != null ? relatedId.hashCode() : 0);
        return result;
    }
}
