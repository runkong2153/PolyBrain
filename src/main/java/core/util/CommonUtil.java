package core.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.PrintWriter;

import static core.util.Constants.GSON;
import static core.util.Constants.JSON_MIME_TYPE;

public class CommonUtil {
    public static <Vo> @Nullable Vo jsonToVo(HttpServletRequest req, Class<Vo> classOfVo){
        try(BufferedReader br = req.getReader()){
            return GSON.fromJson(br, classOfVo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static <Vo> void voToJson(@NotNull HttpServletResponse res, Vo vo){
        res.setContentType(JSON_MIME_TYPE);
        try(PrintWriter pw = res.getWriter()){
            pw.print(GSON.toJson(vo));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
