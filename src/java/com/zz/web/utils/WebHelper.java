package com.zz.web.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author lidongy
 * @version 10.0
 * Created by lidongy on 2020/10/17
 */
public class WebHelper {
    public static final WebHelper KEY = new WebHelper();

    public String getResource(String path) throws Exception {
        URL url = this.getClass().getClassLoader().getResource(path);
        FileInputStream stream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try {
            File f = new File(url.toURI());
            stream = new FileInputStream(f);
            inputStreamReader = new InputStreamReader(stream, "UTF-8");
            bufferedReader = new BufferedReader(inputStreamReader);

            StringBuffer sb = new StringBuffer();
            String text = null;
            while ((text = bufferedReader.readLine()) != null) {
                sb.append(text);
            }
            return sb.toString();
        } catch (Exception e) {
        } finally {
            if (stream != null) {
                stream.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return null;
    }


}
