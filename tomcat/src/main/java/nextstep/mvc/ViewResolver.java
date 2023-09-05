package nextstep.mvc;

import common.FileReader;
import java.io.IOException;
import org.apache.coyote.http11.SupportContentType;

public class ViewResolver {

    private ViewResolver() {
    }

    public static View resolve(final String viewName) throws IOException {
        return new View(FileReader.readFile(viewName), SupportContentType.getContentType(viewName));
    }
}
