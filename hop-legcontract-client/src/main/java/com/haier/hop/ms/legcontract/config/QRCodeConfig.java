package com.haier.hop.ms.legcontract.config;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/**
 * @ClassName: QrCodeConfig
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class QRCodeConfig {

	private int width = 200;// 二维码宽度
	private int height = 200;// 二维码高度
	private String content;// 二维码内容
	private String format;// 二维码格式jpg,png
	private String imagePath;// 保存路径
	private ByteArrayOutputStream outputStream;
	private LogoConfig logo;// logo配置

//	public QRCodeConfig(int width, int height, String content, String format,
//			String imagePath) {
//		this.width = width;
//		this.height = height;
//		this.content = content;
//		this.format = format;
//		this.imagePath = imagePath;
//	}
//	
//	public QRCodeConfig(int width, int height, String content, String format,
//			String imagePath, LogoConfig logo) {
//		this.width = width;
//		this.height = height;
//		this.content = content;
//		this.format = format;
//		this.imagePath = imagePath;
//		this.logo = logo;
//	}


	public ByteArrayOutputStream getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(ByteArrayOutputStream outputStream) {
		this.outputStream = outputStream;
	}

	/**
	 * @Description: 属性 width 的get方法
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @Description: 属性 width 的set方法
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @Description: 属性 height 的get方法
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @Description: 属性 height 的set方法
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @Description: 属性 content 的get方法
	 * @return content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @Description: 属性 content 的set方法
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @Description: 属性 format 的get方法
	 * @return format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @Description: 属性 format 的set方法
	 * @param format
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @Description: 属性 imagePath 的get方法
	 * @return imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @Description: 属性 imagePath 的set方法
	 * @param imagePath
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	/**
	 * @Description: 属性 logo 的get方法
	 * @return logo
	 */
	public LogoConfig getLogo() {
		return logo;
	}

	/**
	 * @Description: 属性 logo 的set方法
	 * @param logo
	 */
	public void setLogo(LogoConfig logo) {
		this.logo = logo;
	}

}
