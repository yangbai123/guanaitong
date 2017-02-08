package com.yb.team.project.controll;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultNoise;


/**
 * 防止Captcha机器人登陆
 * @author xuchengfei
 * 
 */
@Controller
@RequestMapping("/kaptcha")
public class CaptchaController {

	@Autowired
	private Producer captchaProducer = null;
	@RequestMapping("/code")
	public ModelAndView getKaptchaImage(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		//获取验证码
			String code = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
		//	String code = (String) session.getAttribute("Kaptcha_Code");
		//清除浏览器的缓存
		response.setDateHeader("Expires", 0);
		// Set standard HTTP/1.1 no-cache headers.
		response.setHeader("Cache-Control","no-store, no-cache, must-revalidate");
		// Set IE extended HTTP/1.1 no-cache headers (use addHeader).
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		// Set standard HTTP/1.0 no-cache header.
		response.setHeader("Pragma", "no-cache");
		// return a jpeg
		response.setContentType("image/jpeg");
		//浏览器记忆功能-----当前过浏览器和服务器交互成功以后下载的图片和资源会进行缓存一次。下次刷新的时候就不会在到服务器去下载。
		// 获取KAPTCHA验证的随机文本
		String capText = captchaProducer.createText();
		// 讲生成好的图片放入会话中
		session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
		// create the image with the text
		BufferedImage bi = captchaProducer.createImage(capText);
		ServletOutputStream out = response.getOutputStream();
		// write the data out
		ImageIO.write(bi, "jpg", out);
		try {
			out.flush();
		} finally {
			out.close();//关闭
		}
		return null;
	}
}