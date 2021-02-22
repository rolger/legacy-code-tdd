package com.gildedrose;

import com.github.approval.Approval;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class GildedRoseApprovalTest {

    @Test
    public void update_items_5_days_to_achieve_a_coverage_of_100_percent() throws Exception {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        TexttestFixture.main(new String[]{"5"});

        Approval.of(String.class)
                .withReporter(new StringEqualsJunitReporter())
                .withConveter(new EndOfLineSaveStringConverter<>())
                .build()
                .verify(new String(outputStream.toByteArray(), StandardCharsets.UTF_8), Paths.get("src", "test",  "resources", "approval", "result.txt"));
    }

}
