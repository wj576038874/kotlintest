package com.example.kotlintest;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



public class StepNode implements Serializable {

    /**
     * 5秒内步数
     */
    public int step5;

    /**
     * 5秒内里程
     */
    public float distance5;

    public StepNode(int step5, float distance5) {
        this.step5 = step5;
        this.distance5 = distance5;
    }

    public StepNode() {
    }

    public String[] toStringArray() {
        String[] intArr = new String[2];
        intArr[0] = String.valueOf(step5);
        intArr[1] = String.valueOf(distance5);

        return intArr;
    }

    /**
     * 节点数据转换成对象
     *
     * @param content
     * @return
     */
    public static List<StepNode> fromJson(String content) {
        List<StepNode> target = new ArrayList<StepNode>();
        if (TextUtils.isEmpty(content)) {
            return target;
        }
        content = content.replace("\"","").replace("\\","");
        Type listType = new TypeToken<List<String[]>>() {
        }.getType();

        try {
            // 暂时list
            List<String[]> list = new Gson().fromJson(content, listType);

            for (String[] string : list) {
                StepNode node = new StepNode();
                node.step5 = Integer.valueOf(string[0]);
                node.distance5 = Float.valueOf(string[1]);

                target.add(node);
            }

        } catch (Exception e) {

        }

        return target;
    }

    @Override
    public String toString() {
        return "{step:" + step5 + ",meter:" + distance5 + "}";
    }

}