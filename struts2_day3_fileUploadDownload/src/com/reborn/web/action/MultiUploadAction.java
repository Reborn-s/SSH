package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;

/**
 * Created by Reborn。 on 2017/6/3.
 */
public class MultiUploadAction extends ActionSupport {
    private String username;
    private File[] photo;
    private String[] photoFileName;
    private String[] photoContentType;

    public String upload()
    {
        String descDirectory = ServletActionContext.getServletContext().getRealPath("/WEB-INF/files");
        File file = new File(descDirectory);
        if(!file.exists())
            file.mkdirs();
        for(int i=0;i<photo.length;i++)
        {
            photo[i].renameTo(new File(descDirectory,photoFileName[i]));
        }
        return NONE;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public File[] getPhoto() {
        return photo;
    }

    public void setPhoto(File[] photo) {
        this.photo = photo;
    }

    public String[] getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String[] photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String[] getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String[] photoContentType) {
        this.photoContentType = photoContentType;
    }
}
