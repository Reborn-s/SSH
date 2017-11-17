package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Reborn。 on 2017/6/3.
 */
public class DownloadAction extends ActionSupport {
    private InputStream fileInputStream;
    private String filename;

    public InputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(InputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String download() throws FileNotFoundException {
        String filePath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/files/QQ图片20140518220454.jpg");
        fileInputStream = new FileInputStream(filePath);
        filename = FilenameUtils.getName(filePath);
        return SUCCESS;
    }
}
