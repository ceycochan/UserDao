package com.nshane.userdao.utils;

import android.util.Log;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 用于输出日志。<br/>
 * 可以输入日志级别V/I/D/W/E，每个级别都有三种种重载方法：<br/>
 * 两个String参数的方法可以自定义TAG和message，一个String参数的方法可以自动获取当前类名作为TAG。
 * 另外还加入了传入Throwable参数的方法，便于直接输出异常信息。 <br/>
 * 输出日志的message部分都会包含输出日志所在位置的方法名和行号，方便查找。

 */
public class LogUtil {

	private static String classname;

	private static ArrayList<String> methods;

	static {
		classname = LogUtil.class.getName();
		methods = new ArrayList<String>();

		Method[] ms = LogUtil.class.getDeclaredMethods();
		for (Method m : ms) {
			methods.add(m.getName());
		}
	}

	/**
	 * 输出Debug级别的日志，自动获取类名作为TAG。
	 * 
	 * @param msg
	 *            输出内容，带有方法名和行号。
	 * 
	 */
	public static void d(String msg) {
		if (Constants.debug) {
			String[] content = getMsgAndTagWithLineNumber(msg);
			Log.d(content[0], content[1]);
		}
	}

	/**
	 * 输出Debug级别的日志。
	 * 
	 * @param tag
	 *            TAG.
	 * @param msg
	 *            输出内容，带有方法名和行号。
	 * 
	 */
	public static void d(String tag, String msg) {
		if (Constants.debug) {
			Log.d(tag, getMsgWithLineNumber(msg));
		}
	}

	/**
	 * 输出Debug级别的异常日志。
	 * 
	 * @param t
	 *            异常对象。
	 * 
	 */
	public static void d(Throwable t) {
		d(t.getMessage());
	}

	/**
	 * 输出Error级别的日志。
	 * 
	 * @param msg
	 *            输出内容，带有方法名和行号。
	 * 
	 */
	public static void e(String msg) {
		if (Constants.debug) {
			String[] content = getMsgAndTagWithLineNumber(msg);
			Log.e(content[0], content[1]);
		}
	}

	/**
	 * 输出Error级别的日志。
	 * 
	 * @param tag
	 *            TAG.
	 * @param msg
	 *            输出内容，带有方法名和行号。
	 * 
	 */
	public static void e(String tag, String msg) {
		if (Constants.debug) {
			Log.e(tag, getMsgWithLineNumber(msg));
		}
	}

	/**
	 * 输出Error级别的异常日志。
	 * 
	 * @param t
	 *            异常对象。
	 * 
	 */
	public static void e(Throwable t) {
	    if (Constants.debug) {
	        t.printStackTrace();
	    }
	}

	/**
	 * 输出Info级别的日志。
	 * 
	 * @param msg
	 *            日志内容，带有方法名和行号。
	 * 
	 */
	public static void i(String msg) {
		if (Constants.debug) {
			String[] content = getMsgAndTagWithLineNumber(msg);
			Log.i(content[0], content[1]);
		}
	}

	/**
	 * 输出Info级别的日志。
	 * 
	 * @param tag
	 *            TAG.
	 * @param msg
	 *            日志内容，带有方法名和行号。
	 * 
	 */
	public static void i(String tag, String msg) {
		if (Constants.debug) {
			Log.i(tag, getMsgWithLineNumber(msg));
		}
	}

	/**
	 * 输出Info级别的异常日志。
	 * 
	 * @param t
	 *            异常对象。
	 * 
	 */
	/*public static void i(Throwable t) {
		i(t.getMessage());
	}*/

	/**
	 * 输出Vorbose级别的日志。
	 * 
	 * @param msg
	 *            日志内容，带有方法名和行号。
	 * 
	 */
	/*public static void v(String msg) {
		if (Constant.debug) {
			String[] content = getMsgAndTagWithLineNumber(msg);
			Log.v(content[0], content[1]);
		}
	}*/

	/**
	 * 输出Vorbose级别的日志。
	 * 
	 * @param tag
	 *            TAG.
	 * @param msg
	 *            日志内容，带有方法名和行号。
	 * 
	 */
	/*public static void v(String tag, String msg) {
		if (Constant.debug) {
			Log.v(tag, getMsgWithLineNumber(msg));
		}
	}*/

	/**
	 * 输出Vorbose级别的异常日志。
	 * 
	 * @param t
	 *            异常对象。
	 * 
	 */
	/*public static void v(Throwable t) {
		v(t.getMessage());
	}*/

	/**
	 * 输出Warn级别的日志。
	 * 
	 * @param msg
	 *            日志内容，带有方法名和行号。
	 * 
	 */
	public static void w(String msg) {
		if (Constants.debug) {
			String[] content = getMsgAndTagWithLineNumber(msg);
			Log.w(content[0], content[1]);
		}
	}

	/**
	 * 输出Warn级别的日志。
	 * 
	 * @param tag
	 *            TAG.
	 * @param msg
	 *            日志内容，带有方法名和行号。
	 * 
	 */
	public static void w(String tag, String msg) {
		if (Constants.debug) {
			Log.w(tag, getMsgWithLineNumber(msg));
		}
	}

	/**
	 * 输出Warn级别的异常日志。
	 * 
	 * @param t
	 *            异常对象。
	 * 
	 */
	public static void w(Throwable t) {
		w(t.getMessage());
	}

	/**
	 * 获取日志信息的TAG、带行号的内容。
	 * 
	 * @param msg
	 *            日志内容。
	 * @return TAG、带行号的内容组成的字符串数组。
	 * 
	 */
	private static String[] getMsgAndTagWithLineNumber(String msg) {
		try {
			for (StackTraceElement st : (new Throwable()).getStackTrace()) {
				if (classname.equals(st.getClassName()) || methods.contains(st.getMethodName())) {
					continue;
				} else {
					int b = st.getClassName().lastIndexOf(".") + 1;
					String tag = st.getClassName().substring(b);
					String message = st.getMethodName() + "():" + st.getLineNumber() + "->" + msg;
					String[] content = new String[] { tag, message };
					return content;
				}

			}
		} catch (Exception e) {
			LogUtil.e(e);
		}
		return new String[] { "MoboGenie", msg };
	}

	/**
	 * 获取带行号的日志信息内容。
	 * 
	 * @param msg
	 *            日志内容。
	 * @return 带行号的日志信息内容。
	 * 
	 */
	private static String getMsgWithLineNumber(String msg) {
		try {
			for (StackTraceElement st : (new Throwable()).getStackTrace()) {
				if (classname.equals(st.getClassName()) || methods.contains(st.getMethodName())) {
					continue;
				} else {
					int b = st.getClassName().lastIndexOf(".") + 1;
					String tag = st.getClassName().substring(b);
					String message = tag + "->" + st.getMethodName() + "():" + st.getLineNumber() + "->" + msg;
					return message;
				}

			}
		} catch (Exception e) {
			LogUtil.e(e);
		}
		return msg;
	}


}
