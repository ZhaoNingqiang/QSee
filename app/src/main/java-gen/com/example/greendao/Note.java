package com.example.greendao;

import org.greenrobot.greendao.annotation.*;

import com.example.greendao.dao.DaoSession;
import org.greenrobot.greendao.DaoException;

import com.example.greendao.dao.NoteDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "NOTE".
 */
@Entity(active = true)
public class Note {

    @Id
    private Long id;

    @NotNull
    private String text;
    private String comment;
    private java.util.Date date;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient NoteDao myDao;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Note() {
    }

    public Note(Long id) {
        this.id = id;
    }

    @Generated
    public Note(Long id, String text, String comment, java.util.Date date) {
        this.id = id;
        this.text = text;
        this.comment = comment;
        this.date = date;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getNoteDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getText() {
        return text;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setText(@NotNull String text) {
        this.text = text;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
