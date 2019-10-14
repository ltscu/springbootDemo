package com.ltscu.springbootDemo.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {
    @Column
    @CreatedDate
    private Date CreateDate;

    @Column
    @LastModifiedDate
    private Date LastModifiedDate;
    @Column
    @CreatedBy
    private Date CreatedBy;

    public Date getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Date createdBy) {
        CreatedBy = createdBy;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public Date getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }
}
