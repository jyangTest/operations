package com.iot.common.enums;
import java.io.Serializable;

/**
 * Created by TIANCHENGYUAN103 on 2015-12-04.
 */
public enum LogEnum implements Serializable {
	SERVER_START(1,"����������"),
    SERVER_EXIT(2,"�������ر�"),
    CLIENT_CONNECTION(3,"�ͻ�������"),
    CLIENT_BREAK(4,"�ͻ������������ж�"),
    READER_START(5,"�������ݶ�ȡ"),
    READER_SHUTDOWN(6,"�ر����ݶ�ȡ"),
    DATA_SAVE(7,"ִ�����ݴ洢")
    ;
    private int code;
    private String label;

    LogEnum() {
    }

    LogEnum(int code, String label) {

        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
