package tools;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import data.Input;
import data.Output;

import java.io.File;
import java.io.IOException;

public class DataUtil {

    private static DataUtil instance;
    private ObjectMapper objectMapper;

    public DataUtil() {
        objectMapper = new ObjectMapper();
    }

    /**
     * metoda prin care se formeaza Singleton
     * @return
     */
    public static DataUtil getInstance() {
        if (instance == null) {
            instance = new DataUtil();
        }
        return instance;
    }

    /**
     * metoda prin care se preia informatia din fisierele de intrare (test)
     * @param path
     * @return
     * @throws IOException
     */
    public Input loadData(final String path) throws IOException {
        return objectMapper.readValue(new File(path), Input.class);
    }

    /**
     * metoda prin care se scriu fisierele de iesire (output)
     * @param path
     * @param output
     * @throws IOException
     */
    public void saveData(final String path, final Output output) throws IOException {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File(path), output);
    }
}

