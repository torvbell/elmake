package com.dahan.gohan.http;

/*
 * Creates on 2020/5/11.
 */

/**
 * 字符编码统一管理
 *
 * @author kevin
 */
public enum HttpMediaType {

  JSON {
    public String getValue() {
      return "application/json; charset=utf-8";
    }
  },

  FORMAT {
    public String getValue() {
      return "application/x-www-form-urlencoded;charset=UTF-8";
    }
  },

  TEXT {
    public String getValue() {
      return "application/text;charset=UTF-8";
    }
  },

  IMAGE {
    @Override
    public String getValue() {
      return "image/png";
    }
  },

  STREAM {
    @Override
    public String getValue() {
      return "application/octet-stream";
    }
  },

  FORCE_DOWNLOAD {
    @Override
    public String getValue() {
      return "application/force-download";
    }
  },

  FORM {
    @Override
    public String getValue() {
      return null;
    }
  },

  ;

  public abstract String getValue();

}