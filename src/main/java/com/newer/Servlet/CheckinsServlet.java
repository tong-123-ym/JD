package com.newer.Servlet;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.newer.domain.Checkins;
import com.newer.service.CheckinsService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
@WebServlet("/cheackins")
public class CheckinsServlet extends HttpServlet {
    private CheckinsService checkinsService=new CheckinsService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String ation=req.getParameter("ation");
      if(ation.equals(null)){
          Add(req,resp);
      }else if(ation.equals("Sel")){
          Sel(req,resp);
      }
    }


    public void Sel(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        List<Checkins> list=checkinsService.SelCheck();
        System.out.println(list);
        Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        PrintWriter pw=resp.getWriter();
        pw.print(gson.toJson(list));
        pw.close();
    }
public void Add(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
    Checkins checkins=new Checkins();
    try {
        //自动映射请求参数
        BeanUtils.populate(checkins,req.getParameterMap());
        System.out.println(checkins);
        int row=checkinsService.addcheck(checkins);
        JsonObject jsonObject=new JsonObject();
        if(row>0){
            jsonObject.addProperty("suc",true);

        }
        try (PrintWriter pw = resp.getWriter()) {
            //将集合转换成json数组
            pw.print(jsonObject);
            pw.close();
        }
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (InvocationTargetException e) {
        e.printStackTrace();
    }
}

}
