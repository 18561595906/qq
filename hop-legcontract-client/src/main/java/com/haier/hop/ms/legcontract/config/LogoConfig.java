package com.haier.hop.ms.legcontract.config;

import java.awt.Color;

public class LogoConfig {
	// logo默认边框颜色
	public static final Color DEFAULT_BORDERCOLOR = Color.RED;
	// logo默认边框宽度
	public static final int DEFAULT_BORDER = 2;
	// logo大小默认为照片的1/5
	public static final int DEFAULT_LOGOPART = 5;

	private static final int BORDER = DEFAULT_BORDER;
	private final Color borderColor;
	private final int logoPart;
	private String logoPath;

	public LogoConfig(Color borderColor, int logoPart, String logoPath) {
		this.borderColor = borderColor;
		this.logoPart = logoPart;
		this.logoPath = logoPath;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * @Description: 属性 border 的get方法
	 * @return border
	 */
	public int getBorder() {
		return BORDER;
	}

	public int getLogoPart() {
		return logoPart;
	}

	/**
	 * @Description: 属性 logoPath 的get方法
	 * @return logoPath
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * @Description: 属性 logoPath 的set方法
	 * @param logoPath
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

}
