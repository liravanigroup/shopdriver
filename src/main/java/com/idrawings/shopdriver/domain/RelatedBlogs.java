package com.idrawings.shopdriver.domain;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "related_blogs")
@javax.persistence.IdClass(RelatedBlogsPK.class)
public class RelatedBlogs {
    private Integer postId;
    private Integer relatedId;
    private Integer position;

    @javax.persistence.Id
    @javax.persistence.Column(name = "post_id", nullable = false)
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @javax.persistence.Id
    @javax.persistence.Column(name = "related_id", nullable = false)
    public Integer getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Integer relatedId) {
        this.relatedId = relatedId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "position", nullable = false)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelatedBlogs that = (RelatedBlogs) o;

        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (relatedId != null ? !relatedId.equals(that.relatedId) : that.relatedId != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId != null ? postId.hashCode() : 0;
        result = 31 * result + (relatedId != null ? relatedId.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
