package com.gildedrose;

import com.github.approval.reporters.AbstractReporter;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class StringEqualsJunitReporter extends AbstractReporter {

    @Override
    public void notTheSame(byte[] oldValue, File fileForVerification, byte[] newValue, File fileForApproval) {
        Assertions.assertThat(new String(newValue, StandardCharsets.UTF_8)).isEqualTo(new String(oldValue, StandardCharsets.UTF_8));
    }

    @Override
    public void approveNew(byte[] value, File fileForApproval, File fileForVerification) {
        Assertions.assertThat(new String(value, StandardCharsets.UTF_8)).isEqualTo("");
    }

    @Override
    public boolean canApprove(File fileForApproval) {
        return true;
    }
}