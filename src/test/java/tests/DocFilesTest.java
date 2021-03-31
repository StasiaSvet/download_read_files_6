package tests;

import org.junit.jupiter.api.Test;

import static utils.Files.readTextFromPath;

public class DocFilesTest {
    @Test
    void docText () {
        String docFilePath = "./src/test/resources/files/testdoc.doc";
        String expectedData = "Тестовый файл doc";

        String actualData = readTextFromPath(docFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
