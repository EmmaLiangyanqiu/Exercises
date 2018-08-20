package springmvc20180818.dto;

import com.sun.istack.internal.NotNull;

/**
 * Created by Emma on 2018/8/18.
 */
public class User {
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
