package com.web.project2.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;


@Controller
public class KaptchaContorller extends HttpServlet {
    @Autowired
    private Producer captchaProducer=null;

    @RequestMapping("/kaptcha")
    public void getKaptchaImage(HttpServletRequest req, HttpServletResponse res) throws Exception {
        HttpSession session = req.getSession();
        res.setDateHeader("Expires", 0);
        res.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        res.addHeader("Cache-Control", "post-check=0, pre-check=0");
        res.setHeader("Pragma", "no-cache");
        res.setContentType("image/jpeg");
        //生成验证码
        String capText = captchaProducer.createText();

        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        //向客户端写出
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = res.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
    }

    public void checkKaptcha(HttpServletRequest request, HttpServletResponse response) throws Exception{

    }


}
