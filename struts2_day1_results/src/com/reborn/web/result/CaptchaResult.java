package com.reborn.web.result;

import com.opensymphony.xwork2.ActionInvocation;
import com.rebornJar.vcode.VerifyCode;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * Created by Reborn。 on 2017/6/1.
 */
public class CaptchaResult extends StrutsResultSupport {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    protected void doExecute(String s, ActionInvocation actionInvocation) throws Exception {
        VerifyCode verifyCode = new VerifyCode();
        BufferedImage image = verifyCode.getImage();
        HttpServletResponse response = ServletActionContext.getResponse();
        VerifyCode.output(image,response.getOutputStream());
    }
}
