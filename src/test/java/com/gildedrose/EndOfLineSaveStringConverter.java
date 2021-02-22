package com.gildedrose;

import com.github.approval.converters.AbstractConverter;

import java.nio.charset.StandardCharsets;

/**
 * @author Michael.Baum on 01.12.2017
 */
public class EndOfLineSaveStringConverter<T> extends AbstractConverter<T> {

    public final byte[] getRawForm(T value) {
        return value == null ? this.fixAtLeastOneBlankLineAtEOF("null").getBytes(StandardCharsets.UTF_8) : this.fixAtLeastOneBlankLineAtEOF(correctLineSeparators(this.getStringForm(value).trim())).getBytes(StandardCharsets.UTF_8);
    }

    private String fixAtLeastOneBlankLineAtEOF(String value) {
        return value.trim() + System.getProperty("line.separator")+System.getProperty("line.separator");
    }

    private String correctLineSeparators(String input){
        return input.replaceAll("(\\r)?\\n", System.getProperty("line.separator"));
    }

    private String getStringForm(T value) {
        return value.toString();
    }
}
