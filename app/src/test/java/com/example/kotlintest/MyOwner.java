package com.example.kotlintest;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * author: wenjie
 * date: 2021-08-04 17:55
 * descption:
 */
public class MyOwner implements LifecycleOwner {
    @Override
    public void getLifecycle() {

    }

    public static List<StepNode> fromJson(String content) {
        List<StepNode> target = new ArrayList<StepNode>();

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
}
